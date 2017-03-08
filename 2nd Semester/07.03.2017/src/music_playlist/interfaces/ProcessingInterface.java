package music_playlist.interfaces;

import java.util.List;
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
    void sortSinger(List<Singer> singerList);
    //сортировка по названию композиции
    void sortTrackTitle(List<Track> trackList);
    //сортировка по жанру песни
    void sortTrackGenre(List<Track> trackList);
    //сортировка по длительности песни
    void sortTrackDuration(List<Track> trackList);
        
}
