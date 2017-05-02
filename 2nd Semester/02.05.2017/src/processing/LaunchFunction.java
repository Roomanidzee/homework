package processing;

import java.util.Scanner;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class LaunchFunction {
    
    public static void launch(){
        
        StringInformation stringFunctions = new StringInformation();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Список команд: view_domains, check_domain, check_email, exit");
        
        String command = "";
        String input = "";
        
        boolean exit = false;
        
        while(!exit){
            
            System.out.println();
            
            System.out.print("Ваша команда: ");
            command = sc.nextLine();
            System.out.println();
            
            switch(command){
                
                case "exit":
                    
                    System.out.println("Спасибо за использование программы!");
                    exit = true;
                    break;
                    
                case "view_domains":
                    
                    System.out.print("Введите адрес сайта: ");
                    input = sc.nextLine();
                    System.out.println();
                    
                    stringFunctions.showAllDomains(input);
                    
                    break;
                    
                case "check_domain":
                    
                    System.out.print("Введите строку для проверки: ");
                    input = sc.nextLine();
                    System.out.println();
                    
                    if(stringFunctions.checkString(input)){
                        
                        System.out.println("Данная строка - домен");
                        
                    }else{
                        
                        System.out.println("Данная строка - не домен");
                        
                    }
                
                    break;
                
                case "check_email":
                    
                    System.out.print("Введите почтовый адрес для проверки: ");
                    input = sc.nextLine();
                    System.out.println();
                    
                    if(stringFunctions.checkEmail(input)){
                        
                        System.out.println("Данная строка - почтовый адрес");
                        
                    }else{
                        
                        System.out.println("Данная строка - не почтовый адрес");
                        
                    }
                    
                    break;
            }            
        }
    }    
}