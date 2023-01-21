/**
 * Author: Andrew Roney
 * Date: 01/15/2023
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

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();//Get the width of the panel
        int height = getHeight();//Get the height of the panel

        //Calculate the center of the panel
        int xCenter = width/2;
        int yCenter = height/2;

        g.setColor(Color.red);
        g.fillPolygon(new int[] {xCenter, xCenter - base/2, xCenter + base/2}, new int[] {yCenter - height/2, yCenter + height/2, yCenter + height/2}, 3);
    }
}
