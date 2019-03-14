/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1.controller;

import mvc1.model.Model;
import mvc1.view.View;

/**
 *
 * @author user
 */
public abstract class AbstractController implements Controller{
    protected Model model;
    protected View view;

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void start() {
        view.show();//To change body of generated methods, choose Tools | Templates.
    }
    
    

    

    
    
   
            
}
