package processing;

import commands.ChangeDirectoryCommand;
import commands.CopyFileCommand;
import commands.CurrentPathCommand;
import commands.DeleteFileCommand;
import commands.MoveFileCommand;
import commands.ShowFileInfoCommand;
import functions.ChangeDirectoryImplementation;
import functions.CopyFileImplementation;
import functions.CurrentPathImplementation;
import functions.DeleteFileImplementation;
import functions.MoveFileImplementation;
import functions.ShowFileInfoImplementation;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Properties {
    //экземпляры классов функций, инициализируются здесь для удобного хранения
    private final CurrentPathImplementation current = new CurrentPathImplementation();
    private final CurrentPathCommand currentDirectory = new CurrentPathCommand(current);
    
    private final ShowFileInfoImplementation show = new ShowFileInfoImplementation();
    private final ShowFileInfoCommand showInformation = new ShowFileInfoCommand(show);
    
    private final ChangeDirectoryImplementation change = new ChangeDirectoryImplementation();
    private final ChangeDirectoryCommand cd = new ChangeDirectoryCommand(change);
    
    private final DeleteFileImplementation delete = new DeleteFileImplementation();
    private final DeleteFileCommand del = new DeleteFileCommand(delete);
    
    private final MoveFileImplementation move = new MoveFileImplementation();
    private final MoveFileCommand mv = new MoveFileCommand(move);
    
    private final CopyFileImplementation copy = new CopyFileImplementation();
    private final CopyFileCommand cp = new CopyFileCommand(copy);

    /**
     * @return the currentDirectory
     */
    public CurrentPathCommand getCurrentDirectory() {
        return currentDirectory;
    }

    /**
     * @return the showInformation
     */
    public ShowFileInfoCommand getShowInformation() {
        return showInformation;
    }

    /**
     * @return the cd
     */
    public ChangeDirectoryCommand getCd() {
        return cd;
    }

    /**
     * @return the del
     */
    public DeleteFileCommand getDel() {
        return del;
    }

    /**
     * @return the mv
     */
    public MoveFileCommand getMv() {
        return mv;
    }

    /**
     * @return the cp
     */
    public CopyFileCommand getCp() {
        return cp;
    }    
}
