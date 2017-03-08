package music_playlist.processing;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import music_playlist.entities.Singer;
import music_playlist.entities.Track;
import music_playlist.interfaces.ProcessingInterface;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ProcessingFunctions implements ProcessingInterface{
    //реализация всех функций из данного интерфейса
    @Override
    public boolean searchString(String line, String word){
        
        return line.contains(word);
        
    }
    
    @Override
    public boolean searchTime(double time, double start, double end){
        
        return (time > start && time < end);
        
    }
    
    @Override
    public void sortSinger(List<Singer> singerList){
        
        Collections.sort(singerList, new Comparator<Singer>(){
            
            @Override
            public int compare(Singer s1, Singer s2){
                
                return s1.getNickname().compareTo(s2.getNickname());
                
            }
            
        });            
                
    }
    
    @Override
    public void sortTrackTitle(List<Track> trackList){
        
        Collections.sort(trackList, new Comparator<Track>(){
            
            @Override
            public int compare(Track t1, Track t2){
                
                return t1.getTitle().compareTo(t2.getTitle());
                
            }
            
        });
        
    }
    
    @Override
    public void sortTrackGenre(List<Track> trackList){
        
        Collections.sort(trackList, new Comparator<Track>(){
            
            @Override
            public int compare(Track t1, Track t2){
                
                return t1.getGenre().compareTo(t2.getGenre());
                
            }
            
        });
        
    }
    
    @Override
    public void sortTrackDuration(List<Track> trackList){
        
        Collections.sort(trackList, new Comparator<Track>(){
            
            @Override
            public int compare(Track t1, Track t2){
                
                if (t1.getDuration() > t2.getDuration()){
                    
                    return 1;
                    
                }else if(t1.getDuration() < t2.getDuration()){
                    
                    return 0;
                    
                }else{
                    
                    return -1;
                    
                }
                
            }
            
        });
        
    }
}
