
package ownstring;

import java.util.Arrays;

/**
 *
 * The {@code MyString} class shows overwritten methods of
 * overwritten {@code String} class.
 * 
 * @author Andrey Romanov 
 * @version 1.0
 */
public class MyString {
    
    /** Array for saving data. */
    private char[] stringData;
   
    /**
     * Initializes a new constructor, which make possible not to
     * change this class
     */
    public MyString(){
        
    }
    /**
     * 
     * @param changeableString
     *        An original {@code MyString}
     */
    public MyString(String changeableString){
        
        this.stringData = changeableString.toCharArray();
        
        
    }
    /**
     * Method for concating the strings
     * Prints the concatened string 
     * 
     * @param string the string, which is need to be concatened
     *        
     */
    protected void concat(MyString string){
        
        for(int i = 0; i < this.stringData.length; i++){
            
            System.out.print(this.stringData[i]);
            
        }
        System.out.print(string);
        
    }
    /**
     * Method for getting the array of chars
     * 
     * @return char array
     */
    protected String toCharArray(){
        
        return Arrays.toString(this.stringData);
        
    }
    /**
     * Getting the char by index, index is a parameter
     * 
     * @param index number of findable element
     * 
     * @return element with that index
     */
    protected char charAt(int index){
        
        return this.stringData[index];
        
    }
    /**
     * Getting the index of element, symbol is a parameter
     * 
     * @param symbol the findable element
     * @return index of that element
     */
    protected int indexOf(char symbol){
        
        int index = 0;
        boolean flag = false;
        
        for(int i = 0; i < this.stringData.length && !flag; i++){
            
            if(this.stringData[i] == symbol){
                
                index = i;
                flag = true;
                
            }
            
        }
        return index;
    }
    
    /**
     * Print the substring with the pointly length from the start position
     * 
     * @param start place, where to begin the substring
     * @param length length of substring
     * @return string, which will be the substring of original string
     */
    protected char[] substr(int start, int length){
        
        int limit = this.stringData.length - length;
        char[] newStringData = new char[length];
        int k = 0;
        
        for(int i = start; i < limit; i++){
            
            newStringData[k] = this.stringData[start];
            k++;
            i++;
            
        }
        
        return newStringData;
        
    }
    
    /**
     * Overriden method, which returns the string
     * 
     * @return changed string
     */
    @Override
    public String toString(){
        
        String finalString = "";
        
        for(int i = 0; i < this.stringData.length; i++){
            
            finalString += this.stringData[i];
            
        }
        
        return finalString;
        
    }
    
    /**
     * Checking, if the string equal to the object, which is a parameter
     * 
     * @param obj checkable object
     * @return result of checking
     */
    @Override
    public boolean equals(Object obj){
        
        if(obj == null){
            
            return false; 
            
        } 
        
        if(obj instanceof String){
            
            String string = (String) obj;
            char[] newString = string.toCharArray();
            int size1 = newString.length;
            int counter = 0;
            
            if(this.stringData.length == size1){
                
                for(int i = 0; i < size1; i++){
                    
                    if(this.stringData[i] == newString[i]){
                        
                        counter++;
                        
                    }
                    
                }
                
                if(counter == size1){
                    
                    return true;
                    
                }
                
            }else{
                
                return false;
                
            }
            
        }          
        
        return false;
    }
    
    /**
     * Returns the length of string
     * 
     * @return number, which is a length of string
     */
    protected int length(){
        
        return this.stringData.length;
        
    }
    
    /**
     * This method making the two or more strings from one,
     * by the special symbl, which is a parameter.
     * It prints the result of this action
     * 
     * @param symbol tag for dividing the strings
     */
    protected void split(char symbol){
        
        int coun = 0;
        
        char[] newStringData = new char[this.stringData.length];
        
        for(int i = 0; i < this.stringData.length; i++){
            
            if(this.stringData[i] != symbol){
                
                newStringData[i] = this.stringData[i];
                coun++;
                
            }
            
        }
        
        for(int j = 0; j <= coun; j++){
            
            System.out.print(newStringData[j]);
            
        }
    }
}
