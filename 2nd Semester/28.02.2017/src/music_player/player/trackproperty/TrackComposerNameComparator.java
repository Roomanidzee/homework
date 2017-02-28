package music_player.player.trackproperty;

import java.util.Comparator;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class TrackComposerNameComparator implements Comparator<Track>{

    @Override
    public int compare(Track t1, Track t2) {
        
        if(t1.getComposerName().equals(t2.getComposerName())){
            
            return 1;       
            
        }
          
       return 0;
        
    }
    
}
