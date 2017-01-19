import java.util.Calendar;
import java.text.SimpleDateFormat;//all imports, what i need

import java.util.Scanner;

public class DiaryViewer extends Event{

    public static void main(String[] args){

    	Calendar calendar = Calendar.getInstance();	// getting a day, month and year
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);//initializing input

	String[] notes = new String[NUMBER_OF_NOTES];//initializing of array
	int checkRatio = -1;//ratio for checking of null string
	    

    	
    	Functions func = new Functions();//getting the functions

    	System.out.println();

    	System.out.println("Hello, friend!");
        System.out.println("This is a diary, where you can make some notes.");
		

	System.out.print("Try to write something: " );   
	sc.nextLine(); 

	System.out.println("Thank you! Now I need your command, what should I do next.");

	System.out.println();

	System.out.println("Type command \"write\", if you want to make a note.");	

	System.out.println();

	System.out.println("Type command \"exit\", if you want to exit from this app.");

	System.out.print("Your command: ");

	String command = sc.nextLine();

	System.out.println();

	switch(command){//switching between commands

		case "exit":
			   System.out.println("Thank you for using this app!");
			   System.exit(0);
			   break;

		case "write":
			   System.out.println("Okay! Let's make a note.");
			   System.out.println("Please type your note here: ");
			   String note = sc.nextLine();

			   func.setInformation(note);

			   func.add(dateFormat.format(calendar.getTime()) + ": " + func.getInformation(), notes, 0);
			   checkRatio++;

		           break;

		default:

		       System.out.println("Please, write a correct command");
		       break;	      

		}

		System.out.println();

		System.out.println("If you want, you can add another note, or exit from this program.");
		System.out.println("Command for writing a new note : \"write new\" .");

		if(func.checkNullString(checkRatio + 1, notes)){

			System.out.println("You can write 4 more notes");

		}
		
		System.out.println("Besides, you can look at your notes, just type \"read all\" .");
		System.out.print("Your command: ");

		String command1 = sc.nextLine();

		System.out.println();

		switch(command1){

			case "read all":

			     func.readAll(notes);
			     System.out.println();
			     System.out.println("If you see \"null\" - don't panic, it's just mean, that you marked not all free space at one day.");

			     break;

			case "write new":

			     System.out.println("Please type your note here: ");
			     String note = sc.nextLine();

			     func.setInformation(note);

			     func.add(dateFormat.format(calendar.getTime()) + ": " + func.getInformation(), notes, 1);
			     checkRatio++;

			     break;

			case "exit":

			     System.out.println("Thank you for using this app!");
			     System.exit(0);
			     break;

			default:

			     System.out.println("Please, write a correct command");
			     break;

		}
		System.out.println();

		System.out.println("Now you have more, than one note, so you can look at pointly note.");
		System.out.println("Just type number of your note. Remember, the start index is 0. ");

		if(func.checkNullString(checkRatio + 1, notes)){

			System.out.println("You can write 3 more notes");

		}
		System.out.print("Your command: ");
		String command2 = sc.nextLine();

		System.out.println();

		switch(command2){

			case "0" :
			     func.readAllAt(0, notes);
			     break;

			case "1" :
			     func.readAllAt(1, notes);
			     break;      

			case "read all":

			     func.readAll(notes);
			     System.out.println();
			     System.out.println("If you see \"null\" - don't panic, it's just mean, that you marked not all free space at one day.");
			     break;

			case "write new":

			     System.out.println("Please type your note here: ");
			     String note = sc.nextLine();

			     func.setInformation(note);

			     func.add(dateFormat.format(calendar.getTime()) + ": " + func.getInformation(), notes, 2);
			     checkRatio++;

			     break;

			case "exit":

			     System.out.println("Thank you for using this app!");
			     System.exit(0);
			     break;

			default:

			     System.out.println("Please, write a correct command");
			     break;

		}

		System.out.println();

		System.out.println("Now you know all the commands, so choose, what you want to do next");

		if(func.checkNullString(checkRatio + 1, notes)){

			System.out.println("You can write 2 more notes");

		}	
		System.out.print("Your command: ");
		String command3 = sc.nextLine(); 

		System.out.println();

		switch(command3){

			case "0" :
			     func.readAllAt(0, notes);
			     break;

			case "1" :
			     func.readAllAt(1, notes);
			     break; 

			case "2" :
			     func.readAllAt(2, notes);
			     break;          

			case "read all":

			     func.readAll(notes);
			     System.out.println("If you see \"null\" - don't panic, it's just mean, that you marked not all free space at one day.");

			     break;

			case "write new":

			     System.out.println("Please type your note here: ");
			     String note = sc.nextLine();

			     func.setInformation(note);

			     func.add(dateFormat.format(calendar.getTime()) + ": " + func.getInformation(), notes, 3);
			     checkRatio++;

			     break;

			case "exit":

			     System.out.println();
			     System.out.println("Thank you for using this app!");
			     System.exit(0);

			     break;

			default:

			     System.out.println("Please, write a correct command");
			     break; 

		} 

		System.out.println();

		if(func.checkNullString(checkRatio + 1, notes)){

			System.out.println("You can write 1 more note");

		} 

		System.out.println();

		System.out.print("Your command: ");
		String command4 = sc.nextLine(); 

		System.out.println();

		switch(command4){

			case "0" :
			     func.readAllAt(0, notes);
			     break;

			case "1" :
			     func.readAllAt(1, notes);
			     break; 

			case "2" :
			     func.readAllAt(2, notes);
			     break;

			case "3":
			     func.readAllAt(3,notes);
			     break;               

			case "read all":

			     func.readAll(notes);
			     System.out.println("If you see \"null\" - don't panic, it's just mean, that you marked not all free space at one day.");
			     break;

			case "write new":

			     System.out.println("Please type your note here: ");
			     String note = sc.nextLine();

			     func.setInformation(note);

			     func.add(dateFormat.format(calendar.getTime()) + ": " + func.getInformation(), notes, 4);
			     checkRatio++;

			     break;

			case "exit":

			     System.out.println("Thank you for using this app!");
			     System.exit(0);
			     break;

			default:

			     System.out.println("Please, write a correct command");
			     break; 

		}

		System.out.println();

		

		System.out.print("Your command: ");
		String command6 = sc.nextLine();

		System.out.println();

		switch(command6){

			case "0" :
			     func.readAllAt(0, notes);
			     break;

			case "1" :
			     func.readAllAt(1, notes);
			     break; 

			case "2" :
			     func.readAllAt(2, notes);
			     break;

			case "3":
			     func.readAllAt(3,notes);
			     break; 

			case "4":
				 func.readAllAt(4,notes);
				 break;                   

			case "read all":

			     func.readAll(notes);
			     System.out.println("If you see \"null\" - don't panic, it's just mean, that you marked not all free space at one day.");
			     break;

			case "write new":

			 try{//catching the exceptions for array of strings
			 	 System.out.println();
			     System.out.println("Please type your note here: ");
			     String note = sc.nextLine();

			     func.setInformation(note);

			     func.add(dateFormat.format(calendar.getTime()) + ": " + func.getInformation(), notes, 5);
			     checkRatio++;
			     
			    }catch(ArrayIndexOutOfBoundsException e){

			     	System.out.println("You exceed the limit of notes.");

			    }

			    break;

			case "exit":

			     System.out.println("Thank you for using this app!");
			     System.exit(0);
			     break; 

			default:

			     System.out.println("Please, write a correct command");
			     break;

		} 	
    }
}