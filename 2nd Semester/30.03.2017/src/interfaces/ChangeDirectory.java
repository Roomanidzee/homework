package interfaces;

import java.nio.file.Path;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface ChangeDirectory {
     //функция для смены директории
     Path goTo(String pathToDirectory);
    
}
