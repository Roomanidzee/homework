package player.storage;

import java.net.URI;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface DataStorage {
    
    boolean scan(URI uri);
    Object read(URI uri);
    default Object remove(URI uri){
        
        return "Not supported yet";
        
    }
    
}
