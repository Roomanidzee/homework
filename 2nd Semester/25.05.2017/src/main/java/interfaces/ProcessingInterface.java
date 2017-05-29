package interfaces;

import java.util.List;
import entities.Singer;
import entities.Track;

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
    List<String> sortSinger(List<Singer> singerList);
    //сортировка по названию композиции
    List<String> sortTrackTitle(List<Track> trackList);
    //сортировка по жанру песни
    List<String> sortTrackGenre(List<Track> trackList);
    //сортировка по длительности песни
    List<Double> sortTrackDuration(List<Track> trackList);
        
}
