package music_playlist.entities;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Singer {
    
    private String nickname;//псевдоним исполнителя
    
    private Singer(){}
    
    public Singer(String singerNickname){
        
        this.nickname = singerNickname;
        
    }
   
    public String getNickname(){
        
        return this.nickname;
        
    }
    
}
