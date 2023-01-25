/**
 * Author: Andrew Roney
 * Date: 01/24/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */

import java.awt.*;
import javax.swing.*;

public class TriangleDisplayPanel extends JPanel {
    private int base;
    private int height;

    public TriangleDisplayPanel() {
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();//Get the width of the panel
        int pHeight = getHeight();//Get the height of the panel

        //Calculate the center of the panel
        int xCenter = width/2;
        int yCenter = pHeight/2;

        g.setColor(Color.black);
        g.fillPolygon(new int[] {xCenter - base/2, xCenter + base/2, xCenter}, new int[] {yCenter + height/2, yCenter + height/2, yCenter - height/2}, 3);
    }
}
