package music_player.functions;

import music_player.interfaces.MusicInterface;
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
    public void playSound(int channel, int volume, int duration,int type, int... notes) {
            
            for (int note : notes) {
                    
                   this.channels[channel].programChange(type); 
                   this.channels[channel].noteOn(note, volume);
                   
            }
        
            try{               
                
                Thread.sleep(duration);                
                
            }catch (InterruptedException e) {
                
                System.err.println("Произошла ошибка во время проигрывания мелодии");
                
            }
            
            for (int note : notes) {
                    
                this.channels[channel].noteOff(note);
                   
            }
        
    }

    @Override
    public void close() {
        
        this.synth.close();
        
    }
    
}
