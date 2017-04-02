package interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface DeleteFile {
    
    public void deleteSimple(String pathToDirectory);//обычное удаление файла
    public void deleteRecursive(String pathToDirectory);//удаление всех файлов из папки
    public void deleteFolder(String pathToDirectory);//удаление папки
    public void deleteAll(String pathToDirectory);//удаление всех файлов из папки,
    //а затем - самой папки
    
}
