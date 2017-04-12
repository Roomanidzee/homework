package myproperties.main.java;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MyPropertyImplementation {
    //структура для хранения данных 
    private Map<String, String> propertyMap = new HashMap<>();
    
    public void load(InputStream inStream) throws IOException{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
        
        StringBuilder sbKey = new StringBuilder();
        StringBuilder sbValue = new StringBuilder();
        
        try {
            //чтение каждой строчки
            int index;
            
            String line = reader.readLine();
            
            char[] lineArray = line.toCharArray();
            
            while(line != null){
                
                index = line.indexOf("=");
                
                for(int i = 0; i < index; i++){
                    
                    sbKey.append(lineArray[i]);
                    
                }
                
                for(int j = index + 1; j < line.length(); j++){
                    
                    sbValue.append(lineArray[j]);
                    
                }
                
                this.propertyMap.put(sbKey.toString(), sbValue.toString());
                
                line = reader.readLine();
            }
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода-вывода");
            
        }
        
    }
    
    public void load(Reader reader) throws IOException{
        
        BufferedReader stringReader = new BufferedReader(reader);
        
        StringBuilder sbKey = new StringBuilder();
        StringBuilder sbValue = new StringBuilder();
        
        try {
            
            int index;
            
            String line = stringReader.readLine();
            
            char[] lineArray = line.toCharArray();
            
            while(line != null){
                
                index = line.indexOf("=");
                
                for(int i = 0; i < index - 1; i++){
                    
                    sbKey.append(lineArray[i]);
                    
                }
                
                for(int j = index; j < line.length() + 1; j++){
                    
                    sbValue.append(lineArray[j]);
                    
                }
                
                this.propertyMap.put(sbKey.toString(), sbValue.toString());
                
                line = stringReader.readLine();
            }
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода-вывода");
            
        }
    }
    
    public void list(PrintStream out){
        
        Set<Map.Entry<String, String>> me = this.propertyMap.entrySet();
        //с помощью лямбда - выражения выводим файл .properties
        me.stream().map((entry) -> {
            
            out.append(entry.getKey() + "=" + entry.getValue());
            
            return entry;
            
        }).forEachOrdered((_item) -> {
            
            out.append("\n");
            
        });
        
    }
    
    public void list(PrintWriter out){
        
        Set<Map.Entry<String, String>> me = this.propertyMap.entrySet();
        
        me.stream().map((entry) -> {
            
            out.append(entry.getKey() + "=" + entry.getValue());
            
            return entry;
            
        }).forEachOrdered((_item) -> {
            
            out.append("\n");
            
        });
        
    }
    
    public String getProperty(String key){
        
        return this.propertyMap.get(key);
        
    }
    
    public String getProperty(String key, String defaultValue){
        
        String temp = getProperty(key);
        
        if(temp == null){
            
            return defaultValue;
            
        }
        
        return temp;
        
    }
    
    public Object setProperty(String key, String value){
        
        return this.propertyMap.put(key, value);
        
    }   
    
    public void store(OutputStream out, String comments)throws IOException{
        //приведение типов для работы с потоками данных
        ByteArrayOutputStream buffer = (ByteArrayOutputStream) out;
        
        byte[] bytes = buffer.toByteArray();
        
        InputStream in = new ByteArrayInputStream(bytes);
        
        try {
            
            load(in);
            
        } catch (IOException ex) {
            
            System.err.println("Ошибка ввода-вывода");
            
        }
        
    }
    
    public void store(Writer writer, String comments){        
        
        StringWriter sw = (StringWriter) writer;
        
        String temp = sw.toString();
        
        BufferedReader br = new BufferedReader(new StringReader(temp));
        
        try {
            
            load(br);
            
        } catch (IOException ex) {
            
             System.err.println("Ошибка ввода-вывода");
             
        }
        
    }
}
