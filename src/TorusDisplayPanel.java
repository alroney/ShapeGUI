/**
 * Author: Andrew Roney
 * Date: 01/15/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */

import javax.swing.JPanel;

public class TorusDisplayPanel extends JPanel{
    private String torusImage;
    public TorusDisplayPanel() {
    }

    public void setTorusImage(String torusImage) {
        this.torusImage = torusImage;
    }

    public String getTorusImage() {
        return torusImage;
    }
}
