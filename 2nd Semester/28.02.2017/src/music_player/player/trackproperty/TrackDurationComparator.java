package music_player.player.trackproperty;

import java.util.Comparator;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class TrackDurationComparator implements Comparator<Track>{

    @Override
    public int compare(Track t1, Track t2) {
        
        if(t1.getDuration() == t2.getDuration()){
            
            return 1;
            
        }else{
            
            return 0;
            
        }
        
    }
    
}
