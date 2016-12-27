package diary.functions;

import java.util.Arrays;
import java.util.Scanner;
/**
 *The {@code Functions}class contains all functions, which this diary need 
 * 
 * @author Andrey Romanov
 * @version 1.0
 */
public class Functions implements FunctionsInterface{
    
        private int size = 0;
        String[] array;
        Scanner sc = new Scanner(System.in);
        
        /**
         * Initializes new array
         */
        public Functions(){
            
            array = new String[20];
            
        }

        /**
         * Method for viewing the pointly note
         * 
         * @param index index of a note
         * @return note with that index
         */
        @Override
	public String get(int index){
            
            if(index < size){
                
                return array[index];
                
            }else{
                
                throw new ArrayIndexOutOfBoundsException();
                
            }
        }
        
        /**
         * Increasing the size of array
         */
        @Override
        public void increaseArraySize(){
            
            array = Arrays.copyOf(array, array.length * 2);
            
        }

        /**
         * Return the actual size of array
         * @return size of array
         */
	@Override
        public int newSize(){
            
            return size;
            
        }

        /**
         * Method for adding the note to array
         * 
         * @param obj String to adding
         */
        @Override
	public void add(String obj){// function for adding a new note

		if(array.length - size <= 10){
                    
                    increaseArraySize();
                    
                }
                
                array[size++] = obj;

	}
        
        /**
         * Method for viewing the meeting for user
         */
        @Override
        public void meeting(){
            
            
            
            System.out.print("+---------------------------------------------------------------------------------------------------------------------------+");
            System.out.println();

    	    System.out.println("|                                                 Привет,друг!                                                            |");
            System.out.println("|                               Вы видите перед собой ежедневник, где вы можете делать некоторые записи.                                             |");
		

	    System.out.print("|                                     Попробуйте что-нибудь написать: ");   
	    sc.nextLine(); 
           
            
            System.out.println("+---------------------------------------------------------------------------------------------------------------------------+");

	    System.out.println("|                              Спасибо! Теперь мне нужна ваша команда для того, чтобы понять, что делать дальше.                     |");

	        
                
            System.out.println("|                                  Если вы хотите делать новые записи, напишите \"make a new note\" .                                 |");
            System.out.println("|                             Если вы хотите прочесть прошлые записи, напишите \"read past notes\" .                                     |");
            System.out.println("| ВНИМАНИЕ! Если вы хотите после того, как, например, прочли старые записи, сделать новые записи, вам для этого нужно перезапускать программу.    |");
            System.out.println("|              Кроме этого, пишите ваши записи на английском языке, или на транслите,для избежания ошибок кодировки(пример: proverka)                                  |");
            
            System.out.println("+---------------------------------------------------------------------------------------------------------------------------+");
                
            System.out.print("Ваша команда: ");
            
        }
        
      
    
}
