package com.romanidze.siteparsehomework.launcher;

import com.romanidze.siteparsehomework.functions.ParseImpl;
import com.romanidze.siteparsehomework.functions.SaveImpl;
import com.romanidze.siteparsehomework.processing.RegularExpressions;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.simple.JSONObject;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {
    
    private static final long SLEEP_TIME = 10000;
    private static final String START_URL = "http://kazan.vseveliki.ru";
    private static final int GROUP_NUMBER = 1; 
    
    @SuppressWarnings("unchecked")
    public static void launch() {
        
        ParseImpl parseInfo = new ParseImpl();
        SaveImpl saveToJson = new SaveImpl();
        RegularExpressions re = new RegularExpressions();
        
        String startPage = parseInfo.getPage(START_URL);
        
        Pattern pattern1 = Pattern.compile(re.getOtherNameRegexp());
        Pattern pattern2 = Pattern.compile(re.getHrefRegexp());
        
        Matcher matcher1 = pattern1.matcher(startPage);
        Matcher matcher2 = null;
        
        List<String> linksList = new ArrayList<>();
        String link = "";
        
        while(matcher1.find()){
            
            matcher2 = pattern2.matcher(matcher1.group(GROUP_NUMBER));
            
            while(matcher2.find()){
                
                link = matcher2.group(GROUP_NUMBER);
                link = link.replaceAll("\"", "");
                linksList.add(link);
                
            }
            
        }
        
        List<JSONObject> jsonsList = new ArrayList<>();
        
        for(int i = 0; i < linksList.size(); i++){
            
            jsonsList.add(parseInfo.getJSONObject(START_URL + linksList.get(i)));
            
            try {
                
                Thread.sleep(SLEEP_TIME);
                
            } catch (InterruptedException ex) {
                
                System.err.println("Поток ожидания был прерван");
                
            }
            
        }
        
        JSONObject outputJson = new JSONObject();
        
        int count = 1;
        
        for(int i = 0; i < jsonsList.size(); i++){
            
            outputJson.put("type#" + count, jsonsList.get(i));
            count++;
            
        }
        
        saveToJson.save(outputJson);
        
    }        
}