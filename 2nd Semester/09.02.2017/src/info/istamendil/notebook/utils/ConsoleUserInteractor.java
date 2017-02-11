package info.istamendil.notebook.utils;

import java.util.Scanner;

/**
 *
 * @author Андрей Романов
 */
public class ConsoleUserInteractor implements UserInteractor{
    
    private Scanner sc = new Scanner(System.in);
    
    public ConsoleUserInteractor() throws UserInteractorException{}
    
    @Override
    public String readCommand() throws UserInteractorReadException {
        
        String command = sc.nextLine();
        return command;
        
    }
    
    @Override
    public void print(String output) throws UserInteractorWriteException{
        
        System.out.println(">> " + output);
        
    }
    
}
