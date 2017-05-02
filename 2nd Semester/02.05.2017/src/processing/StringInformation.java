package processing;

import interfaces.InformationInterface;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class StringInformation implements InformationInterface{
    //реализация данного интерфейса
    private RegularExpressions re = new RegularExpressions();
    
    @Override
    public void showAllDomains(String original){
        
        Pattern pattern = Pattern.compile(this.re.getDomainRegex());
        Matcher matcher = pattern.matcher(original);
        
        System.out.print("Домены: ");
        
        while(matcher.find()){
            
            for(int i = 1; i < matcher.groupCount() + 1; i++){
                
                System.out.print(matcher.group(i) + ", ");
                
            }
            
        }
        
    }
    
    @Override
    public boolean checkString(String original){
        
        Pattern pattern = Pattern.compile(this.re.getDomainChecker());
        Matcher matcher = pattern.matcher(original);
        
        return matcher.matches();        
        
    }
    
    @Override
    public boolean checkEmail(String original){
        
        Pattern pattern1 = Pattern.compile(this.re.getEmailRegex1());
        Pattern pattern2 = Pattern.compile(this.re.getEmailRegex2());
        
        Matcher matcher1 = pattern1.matcher(original);
        Matcher matcher2 = pattern2.matcher(original);
        
        return (matcher1.matches() || matcher2.matches());
        
    }
}
