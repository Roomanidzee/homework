package diary.events;

/**
 *The {@code Event} class contains all Event properties
 * 
 * @author Andrey Romanov
 * @version 1.0
 */
public class Event {
    
       
	
	private String information;// information, which stores in a note
        private int day;
        private int month;
        private int year;
        private int hour;
        private int minutes;
        
        //getters and setters
	public void setInformation(String diaryInformation){

		this.information = diaryInformation;

	}

	public String getInformation(){

		return information;

	}  
        
        public void setDay(int diaryDay){
            
            this.day = diaryDay;
            
        }
        
        public int getDay(){
            
            return day;
            
        }
        
        public void setMonth(int diaryMonth){
            
            this.month = diaryMonth;
            
        }
        
        public int getMonth(){
            
            return month;
            
        }
        
        public void setYear(int diaryYear){
            
            this.year = diaryYear;
            
        }
        
        public int getYear(){
            
            return year;
            
        }
        
        public void setHour(int diaryHour){
            
            this.hour = diaryHour;
            
        }
        
        public int getHour(){
            
            return hour;
            
        }
        
        public void setMinutes(int diaryMinutes){
            
            this.minutes = diaryMinutes;
            
        }
        
        public int getMinutes(){
            
            return minutes;
            
        }
}
