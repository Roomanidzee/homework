package synthesizer.functions;

import synthesizer.interfaces.MusicInterface;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MusicImplementation implements MusicInterface{
    
    private Synthesizer synth = null;
    private MidiChannel[] channels = null;
    private final int CHANNEL = 0;
    
    public MusicImplementation(){
        
        try{
            
            this.synth = MidiSystem.getSynthesizer();
            
            this.synth.open();
                
            this.channels = this.synth.getChannels();
            
        }catch(MidiUnavailableException e){
            
            System.err.println("Ошибка при воспроизведении звука");
            
        }       
        
    }
    
    @Override
    public void playSound(int duration, int volume, int type, int note) {
        
        this.channels[this.CHANNEL].programChange(type); 
        this.channels[this.CHANNEL].noteOn(note, volume);
        
        try{               
                
            Thread.sleep(duration);                
                
        }catch (InterruptedException e) {
                
            System.err.println("Произошла ошибка во время проигрывания мелодии");
                
        }
        
        this.channels[this.CHANNEL].noteOff(note);
        
    }

    @Override
    public void close() {
        
        this.synth.close();
        
    }
    
}
