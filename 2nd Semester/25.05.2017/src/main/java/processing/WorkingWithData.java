package processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import entities.Singer;
import entities.Track;
import interfaces.DataInterface;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class WorkingWithData implements DataInterface{
    
    private final List<Track> trackList;//коллекция для хранения атрибутов песни
    private final List<Singer> singerList;//коллекция для хранения атрибутов исполнителя
    
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
        
        Iterator<Track> track_iter = this.trackList.iterator();
        Iterator<Singer> singer_iter = this.singerList.iterator();
        
        while(track_iter.hasNext() && singer_iter.hasNext()){
            
            if(singer_iter.next().getNickname().equals(singer)){
                
                if(track_iter.next().getTitle().equals(title) && 
                   track_iter.next().getDuration() == duration && 
                   track_iter.next().getGenre().equals(genre))
                {
                    
                    Track track = new Track(title, duration, genre);
                    Singer removedSinger = new Singer(singer);
                    this.trackList.remove(track);
                    this.singerList.remove(removedSinger);
                    
                }else{
                    
                    k++;
                    
                }
                
            }
            
        }
        
        if(k == this.trackList.size() && k == this.singerList.size()){
            
            System.err.println("Нет такой песни");
            
        }
        
    }
}
