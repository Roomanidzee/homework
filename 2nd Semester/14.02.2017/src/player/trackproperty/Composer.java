package player.trackproperty;

import java.util.Calendar;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Composer {
    
    private String name;
    private Calendar birth;
    
    public void setName(String composerName){
        
        this.name = composerName;
        
    }
    
    public String getName(){
        
        return name;
        
    }
    
    public void setBirth(Calendar composerBirth){
        
        this.birth = composerBirth;
        
    }
    
    public Calendar getBirth(){
        
        return birth;
        
    }
}
