
package main;

/**
 * Handles the connection between the three main classes.
 * @author JD-W
 */
public class Controller {
    
    Model model;
    
    Controller(Model model)
    {
        this.model = model;
    }
    
    public void openFile(String fileName) {
        model.openFile(fileName);
    }
    
}
