package synthesizer.processing;

import synthesizer.interfaces.Observer;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class CurrentNoteNumber implements Observer{
    
    private int noteNumber;
    private NoteData noteData;
    
    public CurrentNoteNumber(NoteData noteData){
        
        this.noteData = noteData;
        noteData.registerObserver(this);
        
    }
    
    @Override
    public void update(int noteNumber) {
        
        this.noteNumber = noteNumber;
        
    }

    @Override
    public int getNumber() {
        
        return this.noteNumber;
        
    }
    
}
