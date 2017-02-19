package player.trackproperty;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Track {
    
    private static String title;
    private static String format;
    private static int duration;
    
    private static Track instance = null;
    
    private Track(String trackTitle, String trackFormat, int trackDuration){
        
        Track.title = trackTitle;
        Track.format = trackFormat;
        Track.duration = trackDuration;
        
    }
    
    
    public static Track getInstance(){
        
        if(Track.instance  == null){
            
            instance = new Track("test", ".mp3", 5);
                       
        }
        return instance;
    }
    
    public String getTitle(){
        
        return title;
        
    }
  
    
    public String getFormat(){
        
        return format;
        
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
