import java.util.Calendar;
import java.text.SimpleDateFormat;//all imports, what i need

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Functions extends Event{

	Calendar calendar = Calendar.getInstance();	// getting a day, month and year
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	FileWriter writer;
	File file = new File("" + dateFormat.format(calendar.getTime()) + ".txt");//generating name of file
	


	protected void readAll(String[] notes){//function for viewing all the notes

		for(int i = 0; i < NUMBER_OF_NOTES; i++){

			System.out.println(notes[i]);

		}

	}

	

	protected void writeToFile(String[] notes){//this function writes to file

		PrintWriter pw = new PrintWriter(file.getAbsoluteFile());

		
		try{

                 if(!file.exists() ){

                    file.createNewFile();

                 }

                 pw.print(notes);

                 }catch(IOException err){

        	     System.err.println("You have some error with file");

                 }

                 catch(FileNotFoundException e1){

        	  System.err.println("You have some error with file");

                 }

		finally{

                   pw.close();

                 }     

	}

	protected void readAllAt(int index, String[] notes){//function for viewing pointly note

		System.out.println(notes[index]);
		
	}

	protected boolean checkNullString(int checkRatio, String[] notes){// function for checking an empty string

		if (notes[checkRatio++] == null){

			return true;

		}else{

			return false;

		}

	}

	protected String add(String note, String[] notes, int index){// function for adding a new note

		notes[index] = note;

		return notes[index];

	}
}