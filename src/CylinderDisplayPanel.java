/**
 * Author: Andrew Roney
 * Date: 01/15/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */

import javax.swing.JPanel;

public class CylinderDisplayPanel extends JPanel{
    private String cylinderImage;

    public CylinderDisplayPanel() {

    }

    public void setCylinderImage(String cylinderImage) {
        this.cylinderImage = cylinderImage;
    }

    public String getCylinderImage() {
        return cylinderImage;
    }
}
