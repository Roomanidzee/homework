package processing;

import interfaces.Command;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CommandGenerator {
    //фабрика для получения типа команды
    private static final Properties p = new Properties();
    
    public static Command getCommand(String what){
        
        switch(what){
            
            case "ls":
                return p.getShowInformation();
            case "cd":
                return p.getCd();
            case "rm":
                return p.getDel();
            case "mv":
                return p.getMv();    
            case "cp":
                return p.getCp();            
            default:
                return null;
            
        }
        
    }
    
}
