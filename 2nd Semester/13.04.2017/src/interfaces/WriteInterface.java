package interfaces;

import java.util.List;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface WriteInterface {
    //записывает всю коллекцию в документ
    boolean write(List<String[]> dataArray);
    
}
