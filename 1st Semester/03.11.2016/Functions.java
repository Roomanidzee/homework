

public class Functions extends Event{

	

	protected void readAll(String[] notes){//function for viewing all the notes

		for(int i = 0; i < NUMBER_OF_NOTES; i++){

			System.out.println(notes[i]);

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