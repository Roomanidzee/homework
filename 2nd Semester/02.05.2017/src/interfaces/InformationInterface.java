package interfaces;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface InformationInterface {
    
    void showAllDomains(String original);//выводит через запятую все домены сайта
    boolean checkString(String original);//проверяет строку на нахождение домена в ней
    boolean checkEmail(String original);//проверяет корректность email - адреса
    
    
}
