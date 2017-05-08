package com.romanidze.siteparsehomework.functions;

import com.romanidze.siteparsehomework.interfaces.ParseInterface;
import com.romanidze.siteparsehomework.processing.RegularExpressions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.simple.JSONObject;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ParseImpl implements ParseInterface{
    //реализация данного интерфейса
    @Override
    public String getPage(String url) {
        
        URL page = null;
        
        try {
            
            page = new URL(url);
            
        } catch (MalformedURLException ex) {
            
            System.err.println("Веб-страница не найдена");
            System.exit(1);
            
        }
        
        URLConnection conn = null;
        
        try {
            
            conn = page.openConnection();
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка открытия соединения");
            System.exit(1);
            
        }
        
        StringBuilder response = new StringBuilder();
        String inputLine = "";
        
        try(BufferedReader br = new BufferedReader(
                                   new InputStreamReader(
                                        conn.getInputStream())))
        {
              
             while ((inputLine = br.readLine()) != null){
                 
                 response.append(inputLine);
                 
             } 
                      

            
        } catch (IOException ex) {
            
            System.err.println(ex.getLocalizedMessage());
            
        }
        
        return response.toString();
        
    }

    @Override
    @SuppressWarnings("unchecked")
    public JSONObject getJSONObject(String url) {
        
        RegularExpressions re = new RegularExpressions();
        
        String text = getPage(url);
        
        Pattern pattern1 = Pattern.compile(re.getNameRegexpFirst());
        Pattern pattern2 = Pattern.compile(re.getPriceRegexpFirst());
        Pattern pattern3 = Pattern.compile(re.getOtherNameRegexp());
        Pattern pattern4 = Pattern.compile(re.getOtherPriceRegexp());
        
        Matcher matcher1 = pattern1.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);
        Matcher matcher3 = pattern3.matcher(text);
        Matcher matcher4 = pattern4.matcher(text);
        
        JSONObject outputJson = new JSONObject();
        
        JSONObject firstBike = new JSONObject();
        
        String found = "";
        String price = "";
        
        while(matcher1.find() && matcher2.find()){
            
            found = matcher1.group(1);
            found = found.replaceAll("<br/><small>", " ");
            found = found.replaceAll("</small>"," ");
            found = found.replaceAll("\t", "");
            
            price = matcher2.group(1);
            price = price.replaceAll("&nbsp;", " ");
            price = price.replaceAll("\t", "");
            
        }
        
        firstBike.put("title", found);
        firstBike.put("price", price);
        
        outputJson.put("bike#1", firstBike);
        
        JSONObject otherBike = null;
        
        int k = 2;
        
        while(matcher3.find() && matcher4.find()){
            
            for(int i = 1; i <= matcher3.groupCount() && i <= matcher4.groupCount(); i++){
                
                otherBike = new JSONObject();
                
                found = matcher3.group(i);
                
                found = found.replaceAll(re.getReplacingRegexp(), " ");
                
                found = found.replaceAll("</a>", " ");
                found = found.replaceAll("</small>", " ");
                found = found.replaceAll("\t", "");
                
                otherBike.put("title", found);
                
                price = matcher4.group(i);
                
                price = price.replaceAll("&nbsp;", " ");
                price = price.replaceAll("\t", "");
                
                otherBike.put("price", price);
                
                outputJson.put("bike#" + k, otherBike);
                k++;
                
            }
            
        }
        
        return outputJson;
        
    }
    
}
