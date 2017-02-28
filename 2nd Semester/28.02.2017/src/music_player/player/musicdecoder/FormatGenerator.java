package music_player.player.musicdecoder;

import java.util.Random;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public abstract class FormatGenerator {
    
    public static FormatGenerator getFormat(String what){
        
        switch (what) {
            case "flac":
                return new FLAC();
            case "mp3":
                return new MP3();
            case "wav":
                return new WAV();
            default:
                return null;
        }
        
    }
    
    public static String generate(){
        
        Random r = new Random();
        
        String[] formats = new String[]{"flac", "mp3", "wav"};
        
        int num = r.nextInt(formats.length);
        
        return formats[num];
        
    }
    
}
