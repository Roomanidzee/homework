package interfaces;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface Command {
    //функции для реализации паттерна "Команда"
    default Path executePath(String path1){
        
        return Paths.get(path1);
        
    }
    
    default void execute(String path){
        
        System.out.println("Important");
        
    }
    
    default void executeMore(String path1, String path2){
        
        System.out.println("Important");
        
    }
    
    default void executeAdded(String path){
    
        System.out.println("Not important");
        
    }
    default void executeAddedMore(String path){
    
        System.out.println("Not important");
        
    }
    default void executeFull(String path){
    
        System.out.println("Not important");
        
    }
    
}
