package player.trackproperty;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Track {
    
    private String title;
    private String format;
    private int duration;
    
    public void setTitle(String trackTitle){
        
        this.title = trackTitle;
        
    }
    
    public String getTitle(){
        
        return title;
        
    }
    
    public void setFormat(String trackFormat){
        
        this.format = trackFormat;
        
    }
    
    public String getFormat(){
        
        return format;
        
    }
    
    public void setDuration(int trackDuration){
        
        this.duration = trackDuration;
        
    }
    
    public int getDuration(){
        
        return duration;
        
    }
    
    @Override
    public String toString(){
        
      return "Title: " + this.getTitle() + ", format: "+ this.getFormat() + 
              ", duration: " + this.getDuration();
        
    }
}
