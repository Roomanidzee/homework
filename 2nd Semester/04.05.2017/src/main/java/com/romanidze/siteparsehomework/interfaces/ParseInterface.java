package com.romanidze.siteparsehomework.interfaces;

import org.json.simple.JSONObject;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface ParseInterface {
    //получение содержимого страницы в строковом виде
    String getPage(String url);
    JSONObject getJSONObject(String url);
    
}
