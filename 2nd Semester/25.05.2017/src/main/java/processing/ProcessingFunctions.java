package processing;

import java.util.*;

import entities.Singer;
import entities.Track;
import interfaces.ProcessingInterface;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class ProcessingFunctions implements ProcessingInterface{
    //реализация всех функций из данного интерфейса

    public boolean searchString(String line, String word){
        
        return line.contains(word);
        
    }
    

    public boolean searchTime(double time, double start, double end){
        
        return (time > start && time < end);
        
    }
    
    @Override
    public List<String> sortSinger(List<Singer> singerList){
        
        List<String> sortedSingers = new ArrayList<>(singerList.size());

        for (Singer oldSingerList : singerList) {

            sortedSingers.add(oldSingerList.getNickname());

        }

        Collections.sort(sortedSingers);

        return sortedSingers;
        
    }
    
    @Override
    public List<String> sortTrackTitle(List<Track> trackList){
        
        List<String> sortedTracks = new ArrayList<>(trackList.size());

        for (Track oldTrackList : trackList) {

            sortedTracks.add(oldTrackList.getTitle());

        }

        Collections.sort(sortedTracks);
        
        return sortedTracks;
        
    }
    
    @Override
    public List<String> sortTrackGenre(List<Track> trackList){
        
        List<String> sortedTracks = new ArrayList<>(trackList.size());

        for (Track oldTrackList : trackList) {

            sortedTracks.add(oldTrackList.getGenre());

        }

        Collections.sort(sortedTracks);

        return sortedTracks;
        
    }
    
    @Override
    public List<Double> sortTrackDuration(List<Track> trackList){
        
        List<Double> sortedTracks = new ArrayList<>(trackList.size());

        for (Track oldTrackList : trackList) {

            sortedTracks.add(oldTrackList.getDuration());

        }

        Collections.sort(sortedTracks);
        
        return sortedTracks;
        
    }
}
