/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1.controller;

/**
 *
 * @author user
 */
public class DefaultController extends AbstractController{

    @Override
    public void addAction(String text) {
        model.addDatum(text); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAction(String text) {
        model.removeDatum(text); //To change body of generated methods, choose Tools | Templates.
    }
    
}
