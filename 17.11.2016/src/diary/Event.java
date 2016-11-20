package diary;

/**
 *
 * @author Андрей
 */
public class Event {
    
        protected static final int NUMBER_OF_NOTES = 5;//limit for the number of notes
	
	protected String information;// information, which stores in a note
        //getters and setters
	protected void setInformation(String diaryInformation){

		this.information = diaryInformation;

	}

	protected String getInformation(){

		return information;

	}    
}
