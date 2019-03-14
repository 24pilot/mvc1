/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1.model;


import java.util.List;
import java.util.Observable;

/**
 *
 * @author user
 */
public class Model extends Observable{
    private List<String> data;
    public void addDatum(String datum){
        data.add(datum);
        setChanged();
        notifyObservers();
    }
    
    public String get(int index){
        return data.get(index);
                
    }
    public void removeDatum(String datum){
        int indexOffElementToRemove = data.indexOf(datum);
        if (indexOffElementToRemove != -1) {
            data.remove(indexOffElementToRemove);
            setChanged();
            notifyObservers();
        }
    }
    
    public int size(){
        return data.size();
    }
    
}

