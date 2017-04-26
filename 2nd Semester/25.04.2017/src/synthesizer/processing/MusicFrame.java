package synthesizer.processing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import synthesizer.functions.MusicImplementation;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MusicFrame extends JFrame {

    private static final long serialVersionUID = 176532525L;   
    
    private JLabel label;
    
    public MusicFrame(){
        
        super("Музыкальный синтезатор");
        createGUI();
        
    }
    
    private void createGUI() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setFocusable(true);
        
        label = new JLabel();
        label.setFont(new Font("Calibri", Font.PLAIN, 20));
        label.setHorizontalAlignment(JLabel.CENTER);
        
        
        
        panel.addKeyListener(new KeyAdapter() {
            
            private final int[] BUTTON_NUMBERS = {67, 68, 69, 70, 71, 65, 66};
            private final int[] NOTE_NUMBERS = {60, 62, 64, 65, 67, 69, 71};
 
            @Override
            public void keyReleased(KeyEvent e) {
                
                Map<Integer, Integer> noteMap = new HashMap<>();
                
                for(int i = 0; i < this.BUTTON_NUMBERS.length; i++){
                    
                    noteMap.put(this.BUTTON_NUMBERS[i], this.NOTE_NUMBERS[i]);
                    
                }
                
                NoteData noteData = new NoteData();
                CurrentNoteNumber currentNote = new CurrentNoteNumber(noteData);
                MusicImplementation player = new MusicImplementation();
                
                int keyCode = 0;
                int note = 0;
                int duration = 1000;
                int volume = 80;
                int type = 0;
                
                keyCode = e.getKeyCode();
                
                noteData.setNumber(noteMap.get(keyCode));
                
                note = currentNote.getNumber();
                
                player.playSound(duration, volume, type, note);
                
                label.setText(KeyEvent.getKeyText(keyCode));
                
                System.out.println(keyCode);
                
                player.close();
            }
             
        });
        
        panel.add(label, BorderLayout.CENTER);
                 
        setPreferredSize(new Dimension(500, 500));
        getContentPane().add(panel);
    }
        
}
