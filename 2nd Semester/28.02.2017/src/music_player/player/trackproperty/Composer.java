package music_player.player.trackproperty;

import java.util.Calendar;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Composer implements Comparable<Composer>{
    
    private static String name;
    private Calendar birth;
    
    public void setName(String composerName){
        
        this.name = composerName;
        
    }
    
    public static String getName(){
        
        return name;
        
    }
    
    public void setBirth(Calendar composerBirth){
        
        this.birth = composerBirth;
        
    }
    
    public Calendar getBirth(){
        
        return birth;
        
    }

    @Override
    public int compareTo(Composer com) {
        
        if(this.name.equals(com.getName())){
            
            return 1;
            
        }else{
            
            return 0;
            
        }
        
    }
}
