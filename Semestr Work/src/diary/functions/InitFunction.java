package diary.functions;

import diary.events.Event;
import java.util.Calendar;
import java.text.SimpleDateFormat;//all imports, what i need

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *The {@code InitFunction} class launch the app, and all operations
 * @author Andrey Romanov
 * @version 1.0
 */
public class InitFunction{
    
     public static void init(){

                Event ev = new Event();	
         
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                SimpleDateFormat dateFormatTime = new SimpleDateFormat("HH:mm");
	        Scanner sc = new Scanner(System.in);//initializing input

	        int k = 100;//counts of commands for program
            
	        

    	
    	        Functions func = new Functions();//getting the functions
                
                int[] hoursArray = new int[func.newSize()];//arrays for hours and minutes
                int[] minutesArray = new int[func.newSize()];
                int counter = 0;

                
                String consoleEncoding = System.getProperty("consoleEncoding");//operations for russian encoding
    
                if(consoleEncoding != null){
    
                   try{
            
                     System.setOut(new PrintStream(System.out, true, consoleEncoding));  
            
                      }catch(UnsupportedEncodingException err){
            
                         System.err.println("Unsupported encoding for console: " + consoleEncoding);
            
                      }
       
                }
                
                
    	        func.meeting();

    	        
                
                String firstCommand = sc.nextLine();
                
                if(firstCommand.equals("read past notes")){
                    
                            System.out.print("Пожалуйста, напишите дату вашей записи(в формате dd.MM.yyyy) : ");
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
                                    
                                }else{
                                    
                                     System.err.println("Вы не делали никаких записей на эту дату");
                                    
                                }
                                
                            }catch(FileNotFoundException error1){
                                
                                System.err.println("Вы не делали никаких записей на эту дату");
                                
                            }catch(IOException error2){
                                
                                System.err.println("У вас возникли проблемы с файлом");
                                
                            }                 
                }
                
                if(firstCommand.equals("make a new note")){
                
                    System.out.println();

	            System.out.println("Напишите, пожалуйста, дату начала вашего события.");
	            System.out.println("Написать нужно в формате dd.MM.yyyy, один за другим");
                    System.out.println("Пожалуйста, пишите только одно число, когда вы пишите день, месяц, и год.");
                
                    System.out.print("Сначала, напишите мне день месяца: ");
	            int day = sc.nextInt();
                    ev.setDay(day);
                    
                    System.out.print("Теперь, напишите сам номер месяца: ");
	            int month = sc.nextInt();
                    ev.setMonth(month);
                    
                    System.out.print("А сейчас, напишите мне год: ");
	            int year = sc.nextInt();
                    ev.setYear(year);

	            Calendar calendar = Calendar.getInstance();// setting the date for program
            
                    dateFormat.setLenient(false);//try to make the date real

	            calendar.set(Calendar.DAY_OF_MONTH, ev.getDay());
	            calendar.set(Calendar.MONTH, ev.getMonth() - 1);//fix of the date, if setLenient didn't help
	            calendar.set(Calendar.YEAR, ev.getYear());

	            try{
                    
                       File dir = new File("SavedData");//initializing of directory
                    
                       if(!dir.exists()){
                    
                          boolean created = dir.mkdir();
                    
                    
                    
                          if (created){
                        
                             System.out.println();
                             System.out.println("Создана папка для сохранения информации");
                        
                          }else{
                        
                             System.err.println("Произошла ошибка во время создания папки для сохранения информации");
                        
                          }
                        
                       }  
                    
	               File file = new File(dir + "\\" +  "" + dateFormat.format(calendar.getTime()) + ".txt");//initialization of file

                   

                       if(!file.exists() ){

                            file.createNewFile();

                        }

                    }catch(FileNotFoundException error){

                        System.err.println("Произошла ошибка во время создания папки для сохранения информации");

                    }catch(IOException err1){

                        System.err.println("Произошла ошибка во время создания папки для сохранения информации");

                    }        

	            System.out.println("Напечатайте команду \"write\", если вы хотите сделать запись.");	

	            System.out.println();

	            System.out.println("Напечатайте команду \"exit\", если вы хотите выйти из данной програмы.");

	            System.out.println();

	            System.out.println("Напечатайте команду \"read all\", если вы хотите просмотреть все записи за день.");

	            System.out.println();

	            System.out.println("Напечатайте команду \"read all at\", если вы хотите посмотреть на определенную запись за день.");

	            System.out.println();

	            System.out.println("Напечатайте команду \"write to file\", если вы хотите сохранить ваши записи."); 
                
                    System.out.println();

	            String command;

	            System.out.println();

	            for(int i = 0; i < k; i++){
                    
                        System.out.println();

	        	System.out.print("Ваша команда: ");

		        command = sc.nextLine();

		        if(command.equals("exit")){
                                
                                System.out.println();
			        System.out.println("Спасибо за  использование программы!");
			        i = 100;
			

		        }

		        if(command.equals("write")){
                            
                                            System.out.println();

                                            System.out.println("Окей! Давайте сделаем запись.");
                                            
                                            System.out.println("Пожалуйста, напечатайте вашу запись здесь: ");
			                    String note = sc.nextLine();
                                            
                                            System.out.println("И давайте напишем ещё время события(в формате hh:mm)");
                                            
                                            System.out.print("Сначала напишите час события(одна цифра, от 00 до 23) : " );
                                            int hour = sc.nextInt();
                                            ev.setHour(hour);
                                           
                                            
                                            System.out.print("Теперь, напишите точные минуты(одна цифра, от 00 до 59) : ");
                                            int minutes = sc.nextInt();
                                            ev.setMinutes(minutes);
                                            
                                            
                                            for(int count = 0; count < counter; count++){
                                                
                                                if(ev.getHour() != hoursArray[count] && ev.getMinutes() != minutesArray[count]){
                                                    
                                                     hoursArray[counter] = ev.getHour();
                                                     minutesArray[counter] = ev.getMinutes();
                                                     
                                                }else{
                                                    
                                                    System.err.println("Вы не можете делать записи на данное время");
                                                    
                                                }                                        
                                            }
                                            
                                            
			                   

			                    ev.setInformation(note);
                                            
                                            Calendar calendar1 = Calendar.getInstance();
                                            
                                            calendar1.set(Calendar.HOUR_OF_DAY, ev.getHour());
                                            calendar1.set(Calendar.MINUTE, ev.getMinutes());

			                    func.add(dateFormatTime.format(calendar1.getTime()) + " : " + ev.getInformation());//adding note to array of strings
                                            i++;
                                       
		        }

		        if(command.equals("write to file")){

                               
                               try{
                               	
                                      File dir = new File("SavedData");
                                      File file = new File(dir + "\\" +  "" + dateFormat.format(calendar.getTime()) + ".txt");

                                   try (PrintWriter pw = new PrintWriter(file.getAbsoluteFile())) {
                                       for(int j = 0; j < func.newSize(); j++){
                                           
                                           pw.println(func.get(j));
                                           
                                       }
                                   } 

                                       }catch(IOException err){

        	                              System.err.println("У вас произошла проблема с файлом");

                                       }

                                   
                               System.out.println("Ваши данные успешно сохранены.");         
                               i++;

		        }

		        if(command.equals("read all")){

		               for(int j = 0; j < func.newSize(); j++){
                                   
                                   System.out.println(func.get(j));
                                   
                               }	
                            
                            
			        System.out.println();
			        i++;

		        }

		        if(command.equals("read all at")){

		        	System.out.println("Пожалуйста, напечатайте индекс вашей записи");
		        	System.out.println("Номерация начинается с 0");

		        	int index = sc.nextInt();

		        	System.out.println(func.get(index));

		        	i++;
		        }
                        
		        else{

		            System.out.println();

                            System.out.println("Помните : нужно писать корректную команду.");

		        }

		        System.out.println();
	        }
           }
                
                else{
                    
                    System.out.println("Пожалуйста, пишите корректную команду.");
                    System.out.println("Для продолжения работы с командой перезапустите её.");
                    
                }     
      }   
}
