package entities;

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

    @Override
    public boolean equals(Object o) {

        if(o == null){

            return false;

        }

        if(!(o instanceof Singer)){

            return false;

        }

        Singer singer = (Singer) o;

        return this.getNickname().equals(singer.getNickname());
    }

    @Override
    public int hashCode() {

        return nickname.hashCode();

    }

    @Override
    public String toString(){

        return "Информация об исполнителе: \\n" +
                "Псевдоним: " + this.getNickname();

    }
}
