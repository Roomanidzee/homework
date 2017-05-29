package interfaces;

import java.util.List;
import entities.Singer;
import entities.Track;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface FilesInterface {
    //сохраняет информацию, полученную из коллекций
    void saveData(List<Track> trackList, List<Singer> singerList);
    //показывает список существующих плейлистов
    void showSavedData();
    //ищет определенный файл
    void findFile();
    
}
