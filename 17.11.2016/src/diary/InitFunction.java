package diary;

import java.util.Calendar;
import java.text.SimpleDateFormat;//all imports, what i need

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author Андрей
 */
public class InitFunction extends Event{
    
     protected static void init(){

        	
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	        Scanner sc = new Scanner(System.in);//initializing input

	        

	        String[] notes = new String[NUMBER_OF_NOTES];//initializing of array
	        int checkRatio = -1;//ratio for checking of null string
	        int k = 100;//counts of commands for program
	        int counter = 0;//index for notes
	        int counter1 = 0;//variable for saving the index for wrote notes
            
	        

    	
    	        Functions func = new Functions();//getting the functions

    	    

    	        System.out.println();

    	        System.out.println("Hello, friend!");
                System.out.println("This is a diary, where you can make some notes.");
		

	        System.out.print("Try to write something: " );   
	        sc.nextLine(); 

	        System.out.println("Thank you! Now I need your command, what should I do next.");

	        
                
                System.out.println("If you want to make new notes, write \"make a new note\" .");
                System.out.println("If you want to read past notes,write \"read past notes\" .");
                System.out.println("BE AWARE: If you want to do other of previous action after starting first, or second, you need to restart the program.");
                
                System.out.println();
                
                System.out.print("Your command: ");
                
                String firstCommand = sc.nextLine();
                
                if(firstCommand.equals("read past notes")){
                    
                            System.out.print("Please, type the data of your note(in format dd.MM.yyyy) : ");
                            String name = sc.nextLine();
                            
                            File dir = new File("SavedData");
                            File file = new File(dir + "\\" +  "" + name + ".txt");
                            try{
                                
                                if(file.exists()){
                                    
                                    FileReader fr = new FileReader(file);//initializing of FileReader and BufferedReader
                                    BufferedReader reader = new BufferedReader(fr);
                                    
                                    String line = reader.readLine();
                                    
                                    while(line != null){//while string is not empty
                                        
                                        System.out.println(line);
                                        
                                        line = reader.readLine();
                                        
                                    }
                                    
                                }
                                
                            }catch(FileNotFoundException error1){
                                
                                System.err.println("You didn't make notes on that date");
                                
                            }catch(IOException error2){
                                
                                System.err.println("You have some problems with a file");
                                
                            }                 
                }
                
                if(firstCommand.equals("make a new note")){
                
                    System.out.println();

	            System.out.println("Write me the date, when do you want to make a note.");
	            System.out.println("Write it in a format dd.MM.yyyy, one by one");
                
                    System.out.print("First, type me the day: ");
	            int day = sc.nextInt();
                    System.out.print("Then, type me the month: ");
	            int month = sc.nextInt();
                    System.out.print("Next, type me the year: ");
	            int year = sc.nextInt();

	            Calendar calendar = Calendar.getInstance();// setting the date for program
            
                    dateFormat.setLenient(false);//try to make the date real

	            calendar.set(Calendar.DAY_OF_MONTH, day);
	            calendar.set(Calendar.MONTH, month - 1);//fix of the date, if setLenient didn't help
	            calendar.set(Calendar.YEAR, year);

	            try{
                    
                       File dir = new File("SavedData");//initializing of directory
                    
                       if(!dir.exists()){
                    
                          boolean created = dir.mkdir();
                    
                    
                    
                          if (created){
                        
                             System.out.println();
                             System.out.println("Successful created directory for saving data");
                        
                          }else{
                        
                             System.err.println("Error with creating of directory for saving data");
                        
                          }
                        
                       }  
                    
	               File file = new File(dir + "\\" +  "" + dateFormat.format(calendar.getTime()) + ".txt");//initialization of file

                   

                       if(!file.exists() ){

                            file.createNewFile();

                        }

                    }catch(FileNotFoundException error){

                        System.err.println("Error with creating of file for saving data");

                    }catch(IOException err1){

                        System.err.println("Error with creating of file for saving data");

                    }        

	            System.out.println("Type command \"write\", if you want to make a note.");	

	            System.out.println();

	            System.out.println("Type command \"exit\", if you want to exit from this app.");

	            System.out.println();

	            System.out.println("Type command \"read all\", if you want to look at all notes.");

	            System.out.println();

	            System.out.println("Type command \"read all at\", if you want to look at pointly note.");

	            System.out.println();

	            System.out.println("Type command \"write to file\", if you want to save your data."); 
                
                    System.out.println();

	            String command;

	            System.out.println();

	            for(int i = 0; i < k; i++){
                    
                        System.out.println();

	        	System.out.print("Your command: ");

		        command = sc.nextLine();

		        if(command.equals("exit")){
                                
                                System.out.println();
			        System.out.println("Thank you for using this app!");
			        i = 100;
			

		        }

		        if(command.equals("write")){

		        	try{

		        	        if(func.checkNullString(checkRatio + 1, notes)){
                                            
                                            System.out.println();

                                            System.out.println("Okay! Let's make a note.");
                                            System.out.println("Remember, you can make 5 notes at 1 day");
			                    System.out.println("Please type your note here: ");
			                    String note = sc.nextLine();

			                    func.setInformation(note);

			                    func.add(dateFormat.format(calendar.getTime()) + ": " + func.getInformation() , notes, counter);//adding note to array of strings
			                    checkRatio++;
                                            i++;
                                            counter++;
                                            counter1 = counter;

                                        }

                                    }catch(ArrayIndexOutOfBoundsException e){

                    	                 System.err.println("You exceed the limit of notes.");
                                         System.err.println("Now you can only read all the notes, or pointly note, or look to past notes");
                                         System.err.println("If you want, you can write your data in a file");           
                           	
                                         i++;
                          

                                       }
		        }

		        if(command.equals("write to file")){

                               
                               try{
                               	
                                      File dir = new File("SavedData");
                                      File file = new File(dir + "\\" +  "" + dateFormat.format(calendar.getTime()) + ".txt");

                                   try (PrintWriter pw = new PrintWriter(file.getAbsoluteFile())) {
                                       for(int coun = 0; coun < counter1; coun++){
                                           
                                           pw.println(notes[coun]);
                                           
                                       }
                                   } 

                                       }catch(IOException err){

        	                              System.err.println("You have some error with file");

                                       }

                                   
                               System.out.println("Your data successfully saved.");         
                               i++;

		        }

		        if(command.equals("read all")){

		        	func.readAll(notes);
			        System.out.println();
			        System.out.println("If you see \"null\" - don't panic, it's just mean, that you marked not all free space at one day.");
			        i++;

		        }

		        if(command.equals("read all at")){

		        	System.out.println("Please, type the index of note");
		        	System.out.println("Start index is 0");

		        	String index = sc.nextLine();

		        	for(int j = 0 ; j < 5; j++){

		        		int num = j;

		        		if( (index.equals((Integer.toString(j))) && (notes[num] != null) ) ){

		        			func.readAllAt(num, notes);

		        		}else{

		        			j++;

		        		}
		        	}

		        	i++;
		        }
                        
		        else{

		            System.out.println();

                            System.out.println("Reminder: write a correct command.");

		        }

		        System.out.println();
	        }
           }        
      }   
}
