package music_playlist.interfaces;

import java.util.List;
import java.util.Set;
import music_playlist.entities.Singer;
import music_playlist.entities.Track;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface ProcessingInterface {
    //ищет подстроку в строке
    boolean searchString(String line, String word);
    //ищет длительность в определенных границах
    boolean searchTime(double time, double start, double end);
    //сортировка по исполнителю
    List<String> sortSinger(Set<Singer> singerList);
    //сортировка по названию композиции
    List<String> sortTrackTitle(Set<Track> trackList);
    //сортировка по жанру песни
    List<String> sortTrackGenre(Set<Track> trackList);
    //сортировка по длительности песни
    List<Double> sortTrackDuration(Set<Track> trackList);
        
}
