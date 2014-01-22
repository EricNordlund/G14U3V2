/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author JD-W
 */
public class Controller {
    
    Model model;
    
    Controller()
    {
        this.model = new Model();
    }
    
    public void openFile(String fileName) {
        model.openFile(fileName);
    }
    
}
