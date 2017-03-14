package music_playlist.interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface DataInterface {
    //добавляет элементы в коллекцию
    void add(String title, double duration, String singer, String genre);
    //удаляет элементы из коллекции
    void remove(String title, double duration, String singer, String genre);
    
}
