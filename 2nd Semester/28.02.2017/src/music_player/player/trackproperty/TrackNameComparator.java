package music_player.player.trackproperty;

import java.util.Comparator;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class TrackNameComparator implements Comparator<Track>{

    @Override
    public int compare(Track t1, Track t2) {
       
        if(t1.getTitle().equals(t2.getTitle())){
            
            return 1;
            
        }else{
            
            return 0;
            
        }
        
    }
    
}
