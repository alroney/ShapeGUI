/**
 * Author: Andrew Roney
 * Date: 01/15/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */

import javax.swing.JPanel;

public class ConeDisplayPanel extends JPanel{
    private String coneImage;

    public ConeDisplayPanel(){

    }

    public void setConeImage(String coneImage) {
        this.coneImage = coneImage;
    }

    public String getConeImage() {
        return coneImage;
    }
}
