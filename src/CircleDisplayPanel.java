/**
 * Author: Andrew Roney
 * Date: 01/15/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */

import java.awt.*;
import javax.swing.*;


public class CircleDisplayPanel extends JPanel {
    private int radius;

    public CircleDisplayPanel() {

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        //Calculate the center of the panel
        int xCenter = width/2;
        int yCenter = height/2;

        g.setColor(Color.red);
        g.fillOval(xCenter - radius, yCenter - radius, 2*radius, 2*radius);
    }
}
