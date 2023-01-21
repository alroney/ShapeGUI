/**
 * Author: Andrew Roney
 * Date: 01/15/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */

import javax.swing.JPanel;

public class CubeDisplayPanel extends JPanel{
    private String cubeImage;

    public CubeDisplayPanel(){

    }

    public void setCubeImage(String cubeImage) {
        this.cubeImage = cubeImage;
    }

    public String getCubeImage() {
        return cubeImage;
    }
}
