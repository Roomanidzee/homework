package music_player.processing;

import music_player.functions.FileParseImplementation;
import music_player.functions.MusicImplementation;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {
    
    public static void play(){
        
        Path path = null;
        
        try{
            
            path = Paths.get("src/music_player/music_notes/the_rains_of_castamere.mus").toRealPath();
            
        }catch(IOException err){
            
            System.err.println("Файл не найден");
            
        }
        
        FileParseImplementation parse = new FileParseImplementation();
        
        int[][] notes = parse.fileParse(path);
        
        MusicImplementation player = new MusicImplementation();
        
        for(int[] note : notes){
            
            player.playSound(0, note[2], note[0], note[3], note[1]);
            
        }
        
        player.close();
        
    }
    
}
