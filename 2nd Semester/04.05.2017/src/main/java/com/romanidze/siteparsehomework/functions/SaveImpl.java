package com.romanidze.siteparsehomework.functions;

import com.romanidze.siteparsehomework.interfaces.SaveInterface;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.json.simple.JSONObject;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class SaveImpl implements SaveInterface{  
    //реализация данного интерфейса
    @Override
    public void save(JSONObject obj) {
        
        Path path = null;
        
        try {
            
            path = Paths.get("src/main/resources/json/bicycles.json").toRealPath();
            
        } catch (IOException ex) {
            
            System.err.println("Файл для сохранения данных не найден");
            System.exit(1);
            
        }
        
        try(FileWriter file = new FileWriter(path.toFile()))
        {
            
            file.write("\uFEFF");
            
            file.write(obj.toJSONString());
            file.flush();
            
        }catch(IOException e){
            
            System.err.println("Ошибка ввода - вывода");
            System.exit(1);
            
        }
        
    }
    
}
