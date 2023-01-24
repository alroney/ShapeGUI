/**
 * Author: Andrew Roney
 * Date: 01/24/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */

import javax.swing.*;

public class SphereDisplayPanel extends JPanel{
    private String sphereImage;

    public SphereDisplayPanel() {
    }

    public void setSphereImage(String sphereImage) {
        this.sphereImage = sphereImage;
    }

    public String getSphereImage() {
        return sphereImage;
    }

}
