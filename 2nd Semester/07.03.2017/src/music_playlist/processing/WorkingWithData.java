package music_playlist.processing;

import java.util.List;
import java.util.ArrayList;
import music_playlist.entities.Singer;
import music_playlist.entities.Track;
import music_playlist.interfaces.DataInterface;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class WorkingWithData implements DataInterface{
    
    private final List<Track> trackList;//коллекция для хранения атрибутов песни
    private final List<Singer> singerList;//коллекция для хранения атрибутов исполнителя
    private Track track;
    
    public WorkingWithData(){
        
        this.trackList = new ArrayList<>();
        this.singerList = new ArrayList<>();
        
    }
    
    @Override
    public void add(String title, double duration, String singer, String genre){
        
        this.trackList.add(new Track(title, duration, genre));
        this.singerList.add(new Singer(singer));
        
    }
    
    @Override
    public void remove(String title, double duration, String singer, String genre){
        
        int k = 0;
        
        for(int i = 0; i < this.trackList.size() && i < this.singerList.size(); i++){
            
            if(this.singerList.get(i).getNickname().equals(singer)){
                
                if(this.trackList.get(i).getTitle().equals(title) &&
                   this.trackList.get(i).getDuration() == duration && 
                   this.trackList.get(i).getGenre().equals(genre))
                {
                    
                    this.track = new Track(title, duration, genre);
                    this.trackList.remove(this.track);
                    
                }
                
            }else{
                
                k++;
                
            }
            
        }
        
        if(k == this.trackList.size() && k == this.singerList.size()){
            
            System.err.println("Нет такой песни");
            
        }
        
    }
}
