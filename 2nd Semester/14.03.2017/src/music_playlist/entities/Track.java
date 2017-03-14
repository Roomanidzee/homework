package music_playlist.entities;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Track {
    
    private String title;//название песни
    private double duration;//продолжительность песни
    private String genre;//жанр песни
    
    private Track(){}
    
    public Track(String trackTitle, double trackDuration, String trackGenre){
        
        this.title = trackTitle;
        this.duration = trackDuration;
        this.genre = trackGenre;
        
    }
    
    public String getTitle(){
        
        return this.title;
        
    }
    
    public double getDuration(){
        
        return this.duration;
        
    }
    
    public String getGenre(){
        
        return this.genre;
        
    }
}
