package processing;

import interfaces.Command;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {
    //функция запуска программы
    public static void launch(){
        
        Command command;        
        Path path = null;        
        Properties p = new Properties();        
        Scanner sc = new Scanner(System.in);        
        command = p.getCurrentDirectory();        
        path =  command.executePath(System.getProperty("user.home"));
        boolean exit = false;
        
        System.out.println("Список возможных команд: exit, ls, cd, rm, mv, cp");
        
        String userCommand, userNextCommand;
        String firstPath, secondPath;
        
        while(!exit){
            
            System.out.println();
            
            System.out.println("Текущая директория: " + path);
            
            System.out.print("Ваша команда: ");
            
            userCommand = sc.nextLine();
            
            System.out.println();
            
            switch(userCommand){
                
                case "exit":
                    
                    System.out.println("Спасибо вам за использование этой программы!");
                    exit = true;
                    break;
                    
                case "ls":
                    
                    command = CommandGenerator.getCommand("ls");
                    
                    System.out.println("Список исходных опций: ls, ls -l, ls -a, ls -la");
                    
                    System.out.print("Выберите следующую опцию для дальнейшего "
                            + "взаимодействия: ");
                    
                    userNextCommand = sc.nextLine();
                    
                    switch(userNextCommand){
                        
                        case "ls":  
                            
                            command.execute(path.toString());
                            break;
                            
                        case "ls -l":
                            
                            command.executeAdded(path.toString());
                            break;
                            
                        case "ls -a":
                            
                            command.executeAddedMore(path.toString());
                            break;
                            
                        case "ls -la":
                            
                            command.executeFull(path.toString());
                            break;
                            
                        default:
                            
                            System.err.println("Неверная команда");
                            break;
                        
                    }
                    
                    break;
                    
                case "cd":
                    
                    command = CommandGenerator.getCommand("cd");
                    System.out.print("Введите путь, в который вы хотите перейти: ");
                    userNextCommand = sc.nextLine();
                    
                    if(userNextCommand.equals("~")){
                        
                        path = command.executePath(System.getProperty("user.home"));
                        
                    }
                    
                    if(path.toString().contains(userNextCommand)){
                        
                        Path path1 = Paths.get(userNextCommand).toAbsolutePath();
                        
                        path = command.executePath(path.relativize(path1).toString());
                        
                    }else{
                        
                        path = command.executePath(userNextCommand);
                        
                    }
                    
                    break;
                
                case "rm":
                    
                    command = CommandGenerator.getCommand("rm");
                    
                    System.out.println("Список исходных опций: rm, rm -r, rm -f, rm -rf");
                    
                    System.out.print("Выберите следующую опцию для дальнейшего "
                            + "взаимодействия: ");
                    
                    userNextCommand = sc.nextLine();
                    
                    switch(userNextCommand){
                        
                        case "rm":
                            
                            command.execute(path.toString());
                            break;
                        
                        case "rm -r":
                            
                            command.executeAdded(path.toString());
                            break;
                        
                        case "rm -f":
                            
                            command.executeAddedMore(path.toString());
                            break;
                        
                        case "rm -rf":
                            
                            command.executeFull(path.toString());
                            break;
                        
                        default:
                            
                            System.err.println("Неверная команда");
                            break;
                        
                    }
                    
                    break;
                
                case "mv":
                    
                    command = CommandGenerator.getCommand("mv");
                    
                    System.out.println("Пожалуйста, введите пути до файлов, "
                            + "с которыми вы хотите работать");
                    
                    firstPath = sc.nextLine();
                    secondPath = sc.nextLine();
                    
                    command.executeMore(firstPath, secondPath);
                    
                    break;
                    
                case "cp":
                    
                    command = CommandGenerator.getCommand("cp");
                    
                    System.out.println("Пожалуйста, введите пути до файлов, "
                            + "с которыми вы хотите работать");
                    
                    firstPath = sc.nextLine();
                    secondPath = sc.nextLine();
                    
                    command.executeMore(firstPath, secondPath);
                    
                    break;
                    
                default:
                    System.err.println("Неверная команда");
            }
            
        }
        
    }
    
}
