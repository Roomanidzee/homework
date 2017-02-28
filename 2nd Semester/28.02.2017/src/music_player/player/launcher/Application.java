package music_player.player.launcher;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public abstract class Application {
    
    protected String[] args;
    
    public Application(String[] args){
        
        this.args = args;
        this.init();
        this.start();
        
    }
    
    public abstract void init();
    public abstract void start();
    
}
