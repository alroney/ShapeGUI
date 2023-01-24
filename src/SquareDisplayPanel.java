/**
 * Author: Andrew Roney
 * Date: 01/24/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */

import java.awt.*;
import javax.swing.*;

public class SquareDisplayPanel extends JPanel {
    private int side;

    public SquareDisplayPanel() {
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override//Override the paintComponent method to draw a square. The override annotation is used to ensure that the method is actually overriding a method in the superclass.
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        //Calculate the center of the panel
        int xCenter = width/2;
        int yCenter = height/2;

        g.setColor(Color.black);
        g.fillRect(xCenter - side/2, yCenter - side/2, side, side);
    }
}
