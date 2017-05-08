package com.romanidze.siteparsehomework.processing;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class RegularExpressions {
    //описание данных регулярных выражений смотреть в файле 
    //src/main/resources/RegularExpressionsExplanation.txt
    private final String PRICE_REGEXP_FIRST = "(?<=\\<div class=\\\"lead pull-right"
            + " el-product-full-price\\\"\\>"
            + "<!--price-->)(.+?)(?=\\<!--\\/price--><\\/div\\>)";
    private final String NAME_REGEXP_FIRST = "(?<=\\<h1 class=\\\"h2 el-product-full-title\\\"\\>)"
            + "(.+?)(?=\\<\\/h1\\>)";
    
    private final String OTHER_PRICE_REGEXP = "(?<=\\<p class=\\\"lead el-product-list-price\\\"\\>)"
            + "(.+?)(?=\\<\\/p\\>)";
    
    private final String OTHER_NAME_REGEXP = "(?<=\\<div class=\\\"h4 el-product-list-title\\\"\\>)"
            + "(.+?)(?=\\<\\/div\\>)";
    
    private final String REPLACE_ALL_ATTRIBUTES = "<(\\w+)(?:([\\'\"]).*?\\2|.)*?>";
    
    private final String GET_HREF = "\\s*(?i)data-url\\s*=\\s*(\\\"([^\"]*\\\")|'[^']*'|([^'\">\\s]+))";
    
    public String getPriceRegexpFirst(){
        
        return this.PRICE_REGEXP_FIRST;
        
    }
    
    public String getNameRegexpFirst(){
        
        return this.NAME_REGEXP_FIRST;
        
    }
    
    public String getOtherPriceRegexp(){
        
        return this.OTHER_PRICE_REGEXP;
        
    }
    
    public String getOtherNameRegexp(){
        
        return this.OTHER_NAME_REGEXP;
        
    }
    
    public String getReplacingRegexp(){
        
        return this.REPLACE_ALL_ATTRIBUTES;
        
    }
    
    public String getHrefRegexp(){
        
        return this.GET_HREF;
        
    }
    
}
