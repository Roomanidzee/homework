package synthesizer.processing;

import java.util.LinkedList;
import java.util.List;
import synthesizer.interfaces.Observable;
import synthesizer.interfaces.Observer;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class NoteData implements Observable{
    
    private List<Observer> observers;
    private int noteNumber;
    
    public NoteData(){
        
        this.observers = new LinkedList<>();
        
    }
    
    @Override
    public void registerObserver(Observer o) {
        
        this.observers.add(o);
        
    }

    @Override
    public void removeObserver(Observer o) {
        
        this.observers.remove(o);
        
    }

    @Override
    public void notifyObservers() {
        
        this.observers.forEach((observer) -> {
            
            observer.update(noteNumber);
            
        });
        
    }

    @Override
    public void setNumber(int noteNumber) {
        
        this.noteNumber = noteNumber;
        notifyObservers();
        
    }
    
}
