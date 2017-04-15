package interfaces;

import java.util.List;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface ReadInterface {
    //считывает определеные столбцы документа в коллекцию
    List<String[]> read(List<String[]> dataArray, int n);
    //считывает весь документ в коллекцию
    List<String[]> showAll(List<String[]> dataArray);
    
}
