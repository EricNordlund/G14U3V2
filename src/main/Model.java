
package main;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Contains the main functions.
 * @author G14
 */
public class Model {
    
    /**
     * Opens the a file located in the reports folder.
     * @param filename Name of the file to open.
     */
    public void openFile(String filename) {
        File file = getPath(filename);
        
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Retrieves the absolute path of the reportsfolder and files located within it.
     * @param filename Filename to the path.
     * @return 
     */
    public File getPath(String filename) {
        try {
            String path = "main/reports/" + filename;
            
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            URL url = classLoader.getResource(path);
            File file = new File(url.toURI());
            return file;
        } catch (URISyntaxException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
