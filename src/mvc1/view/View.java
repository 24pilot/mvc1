/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1.view;

import mvc1.controller.Controller;
import mvc1.model.Model;

/**
 *
 * @author user
 */
public interface View {
    void dispose();
    void setController(Controller controller);
    void setModel(Model model);
    void show();
}
