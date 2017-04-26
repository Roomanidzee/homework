package music_player.interfaces;

import java.nio.file.Path;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface FileParseInterface {
    
    int[][] fileParse(Path pathToFile);
    
}
