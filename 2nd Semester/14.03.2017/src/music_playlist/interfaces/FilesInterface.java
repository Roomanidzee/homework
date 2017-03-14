package music_playlist.interfaces;

import java.util.Set;
import music_playlist.entities.Singer;
import music_playlist.entities.Track;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface FilesInterface {
    //сохраняет информаицю, полученную из коллекций
    void saveData(Set<Track> trackList, Set<Singer> singerList);
    //показывает список существующих плейлистов
    void showSavedData();
    //ищет определенный файл
    void findFile();
    
}
