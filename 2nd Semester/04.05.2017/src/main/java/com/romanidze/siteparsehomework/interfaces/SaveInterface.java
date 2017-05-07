package com.romanidze.siteparsehomework.interfaces;

import org.json.simple.JSONObject;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public interface SaveInterface {
    //сохранение json - объекта в файл
    void save(JSONObject obj);
    
}
