/**
 * Author: Andrew Roney
 * Date: 01/15/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */

import java.awt.*;
import javax.swing.*;

public class RectangleDisplayPanel extends JPanel {
    private int width;
    private int height;

    public RectangleDisplayPanel() {
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        //Calculate the center of the panel
        int xCenter = panelWidth/2;
        int yCenter = panelHeight/2;

        g.setColor(Color.red);
        g.fillRect(xCenter - width/2, yCenter - height/2, width, height);
    }
}
