package player.storage;

import player.trackproperty.Track;
import java.util.Arrays;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MusicStorage {
    
   private Object[] musicArray;
   private int size = 0;
   
   public MusicStorage(){
       
       musicArray = new Object[20];
       
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
   
   public Object search(String title){
       
       for(int i = 0; i < this.size; i++){
            
            if(this.musicArray[i] == title){
                
                return this.musicArray[i];
                
            }
            
        }
        
        throw new NullPointerException("No such tag");
        
    }
   
   public Object createPlaylist(){
       
       return this.musicArray;
       
   }
       
}