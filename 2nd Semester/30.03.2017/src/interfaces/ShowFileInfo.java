package interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface ShowFileInfo {
    
    public void showFiles(String pathToDirectory);//показать список файлов из папки
    public void showFilesWithInfo(String pathToDirectory);//список файлов с информаицией о них
    public void showAllFiles(String pathToDirectory);//показать и обычные, и скрытые файлы
    public void showAllFilesFull(String pathToDirectory);//показать и обычные, 
    //и скрытые файлы с информацией о них
    
}
