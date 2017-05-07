package com.romanidze.siteparsehomework.processing;

import com.romanidze.siteparsehomework.functions.ParseImpl;
import com.romanidze.siteparsehomework.functions.SaveImpl;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.simple.JSONObject;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {
    
    private static final long SLEEP_TIME = 10000;
    
    @SuppressWarnings("unchecked")
    public static void launch() {
        
        ParseImpl parseInfo = new ParseImpl();
        SaveImpl saveToJson = new SaveImpl();
        RegularExpressions re = new RegularExpressions();
        
        String text = parseInfo.getPage("http://kazan.vseveliki.ru/index/skladnoy-velosiped-710-24.html");
        
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
            found = found.replaceAll("<br/><small>Stels</small>", " ");
            
            try {
                
                Thread.sleep(SLEEP_TIME);
                
            } catch (InterruptedException ex) {
                
               System.err.println("Поток ожидания был прерван");
               
            }
            
            price = matcher2.group(1);
            price = price.replaceAll("&nbsp;", " ");
            
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
                
                found = found.replaceAll("</a> Stells</small>", " ");
                
                otherBike.put("title", found);
                
                try {
                
                       Thread.sleep(SLEEP_TIME);
                
                } catch (InterruptedException ex) {
                
                       System.err.println("Поток ожидания был прерван");
               
                }
                
                price = matcher4.group(i);
                
                price = price.replaceAll("&nbsp;", " ");
                
                otherBike.put("price", price);
                
                outputJson.put("bike#" + k, otherBike);
                k++;
                
            }
            
        }
        
        saveToJson.save(outputJson);
        
    }        
}