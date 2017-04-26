package synthesizer.launcher;

import javax.swing.SwingUtilities;
import synthesizer.processing.MusicFrame;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class SynthesizerLauncher {
    
    public static void main(String[] args){
        
        System.out.println("C - нота До");
        System.out.println("D - нота Ре");
        System.out.println("E - нота Ми");
        System.out.println("F - нота Фа");
        System.out.println("G - нота Соль");
        System.out.println("A - нота Ля");
        System.out.println("B - нота Си");
        
        SwingUtilities.invokeLater(() -> {
            
            MusicFrame frame = new MusicFrame();
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
        });
        
    }
    
}
