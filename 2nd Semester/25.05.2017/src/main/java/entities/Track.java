package entities;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class Track {
    
    private String title;//название песни
    private double duration;//продолжительность песни
    private String genre;//жанр песни
    
    private Track(){}

    @Override
    public boolean equals(Object o) {

        if (o == null) {

            return false;

        }

        if (!(o instanceof Track)) {

            return false;

        }

        Track track = (Track) o;

        if (Double.compare(track.getDuration(), this.getDuration()) != 0) {

            return false;

        }

        return this.getTitle().equals(track.getTitle()) && this.getGenre().equals(track.getGenre());
    }

    @Override
    public int hashCode() {

        int result;
        long temp;

        result = title.hashCode();

        temp = Double.doubleToLongBits(duration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + genre.hashCode();

        return result;
    }

    @Override
    public String toString(){

        return "Информация о композиции : \\n" +
                "Название : " + this.getTitle() + " \\n" +
                "Длительность : " + this.getDuration() + " секунд \\n" +
                "Жанр : " + this.getGenre();

    }

    public Track(String trackTitle, double trackDuration, String trackGenre){
        
        this.title = trackTitle;
        this.duration = trackDuration;
        this.genre = trackGenre;
        
    }
    
    public String getTitle(){
        
        return this.title;
        
    }
    
    public double getDuration(){
        
        return this.duration;
        
    }
    
    public String getGenre(){
        
        return this.genre;
        
    }
}
