package player.storage;

import java.net.URI;
import player.trackproperty.Track;
import java.util.Arrays;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MusicStorage implements DataStorage{
   
   private static Track[] musicArray;
   
   
   private int size = 0;
   
   public MusicStorage(){
       
       musicArray = new Track[20];
       
   }
   
   public void add(Track track){
       
       if(this.musicArray.length - this.size <= 10){
            
            increaseArraySize();
            
        }
       
       this.musicArray[this.size] = track;
       this.size++;
       
   }
   
   private void increaseArraySize(){
        
        this.musicArray = Arrays.copyOf(musicArray, musicArray.length * 2);
        
   }
   
   public void scan(){
       
       for(int i = 0; i < this.size; i++){
           
           System.out.println(this.musicArray[i].toString());
           
       }
       
   }
   
   public Track search(Track title){
       
       for(int i = 0; i < this.size; i++){
            
            if(this.musicArray[i] == title){
                
                return this.musicArray[i];
                
            }
            
        }
        
        throw new NullPointerException("No such tag");
        
    }
   
   public static Object createPlaylist(){
       
       return MusicStorage.musicArray;
       
   }

    @Override
    public boolean scan(URI uri) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object read(URI uri) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
       
}