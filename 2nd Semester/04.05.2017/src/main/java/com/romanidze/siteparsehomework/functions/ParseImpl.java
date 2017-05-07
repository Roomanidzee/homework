package com.romanidze.siteparsehomework.functions;

import com.romanidze.siteparsehomework.interfaces.ParseInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

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
    
}
