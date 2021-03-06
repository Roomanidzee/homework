package music_player.player.trackproperty;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Track  implements Comparable<Track> {
    
    private String title;
    private String format;
    private int duration;
    
    private static Track instance = null;
    
    private Track(){}
    
    
    public static Track getInstance(){
        
        if(Track.instance  == null){
            
            instance = new Track();
                       
        }
        return instance;
    }
    
    public void setTitle(String songTitle){
        
        this.title = songTitle;
        
    }
    
    public String getTitle(){
        
        return title;
        
    }
  
    
    public void setFormat(String songFormat){
        
        this.format = songFormat;
        
    }
    
    public String getFormat(){
        
        return format;
        
    }
    
    public void setDuration(int songDuration){
        
        this.duration = songDuration;
        
    }
    
    public int getDuration(){
        
        return duration;
        
    }
    
    public String getComposerName(){
        
        return Composer.getName();
        
    }
    
    @Override
    public String toString(){
        
      return "Title: " + this.getTitle() + ", format: "+ this.getFormat() + 
              ", duration: " + this.getDuration();
        
    }

    @Override
    public int compareTo(Track t) {
        
        if(this.title.equals(t.getTitle())){
            
            return 1;
            
        }else{
            
            return 0;
            
        }
        
    }
}
