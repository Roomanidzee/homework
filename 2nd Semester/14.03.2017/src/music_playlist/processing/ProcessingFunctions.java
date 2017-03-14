package music_playlist.processing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
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
    public List<String> sortSinger(Set<Singer> singerList){
        
        List<String> sortedSingers = new ArrayList<>();
        Iterator<Singer> singer_iterator = singerList.iterator();
        
        while(singer_iterator.hasNext()){
            
            sortedSingers.add(singer_iterator.next().getNickname());
            
        }
        
        Collections.sort(sortedSingers);
        
        return sortedSingers;
        
    }
    
    @Override
    public List<String> sortTrackTitle(Set<Track> trackList){
        
        List<String> sortedTracks = new ArrayList<>();
        Iterator<Track> track_iterator = trackList.iterator();
        
        while(track_iterator.hasNext()){
            
            sortedTracks.add(track_iterator.next().getTitle());
            
        }
        
        Collections.sort(sortedTracks);
        
        return sortedTracks;
        
    }
    
    @Override
    public List<String> sortTrackGenre(Set<Track> trackList){
        
        List<String> sortedTracks = new ArrayList<>();
        Iterator<Track> track_iterator = trackList.iterator();
        
        while(track_iterator.hasNext()){
            
            sortedTracks.add(track_iterator.next().getGenre());
            
        }
        
        Collections.sort(sortedTracks);
        
        return sortedTracks;
        
    }
    
    @Override
    public List<Double> sortTrackDuration(Set<Track> trackList){
        
        List<Double> sortedTracks = new ArrayList<>();
        Iterator<Track> track_iterator = trackList.iterator();
        
        while(track_iterator.hasNext()){
            
            sortedTracks.add(track_iterator.next().getDuration());
            
        }
        
        Collections.sort(sortedTracks);
        
        return sortedTracks;
        
    }
}
