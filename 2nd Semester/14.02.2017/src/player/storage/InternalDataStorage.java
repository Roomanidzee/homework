package player.storage;

import java.io.File;
import java.net.URI;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class InternalDataStorage implements DataStorage{
    
    @Override
    public boolean scan(URI uri){
        
        File file = new File(uri.toString());
        
        return file.isFile();
    }
    
    @Override
    public Object read(URI uri){
        
        File file = new File(uri.toString());
        return file;
        
    }
    
    @Override
    public Object remove(URI uri){
        
        URI removed = uri;
        removed = null;
        
        return removed;
        
    }
}
