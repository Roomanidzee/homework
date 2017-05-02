package processing;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class RegularExpressions {
    //регулярное выражение для поиска всех доменов сайта
    private final String domainRegex = "([a-z0-9\\.-]*)\\.([a-z0-9\\.-]*)\\.([a-z\\.]{1,})";
    //регулярное выражение для проверки домена
    private final String checkDomainRegex = "([a-z0-9\\\\.-]*)\\.(?:[a-z\\\\.]{1,})";
    //регулярные выражения для проверки email - адресов(вместе с mailto)
    private final String emailRegex1 = "([a-z0-9\\\\.-]*)@([a-z0-9\\\\.-]*)\\.([a-z\\.]{1,})";
    private final String emailRegex2 = "mailto:([a-z0-9\\\\.-]*)@([a-z0-9\\\\.-]*)\\.([a-z\\.]{1,})";
    //геттеры для получения выражений
    public String getDomainRegex(){
        
        return domainRegex;
        
    }
    
    public String getDomainChecker(){
        
        return checkDomainRegex;
        
    }
    
    public String getEmailRegex1(){
        
        return emailRegex1;
        
    }
    
    public String getEmailRegex2(){
        
        return emailRegex2;
        
    }
}
