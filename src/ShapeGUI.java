/**
 * Author: Andrew Roney
 * Date: 01/15/2023
 * Description: This program creates a GUI that allows the user to select a shape from a dropdown menu and display the shape in the GUI.
 * 
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeGUI {

    //Method: create the GUI
    public static void createGUI() {
        //region - FRAME - Create the frame (window)
            JFrame frame = new JFrame("Shape GUI");//This is the window that the GUI will be displayed in.
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//This will close the window when the user clicks the X button
            frame.setSize(800, 600);//This is the size of the window
            frame.setPreferredSize(new Dimension(500, 500));
            frame.setLayout(new GridBagLayout());//This is the layout of the window
            frame.setVisible(true);//This makes the window visible

        //endregion
        
        //region - MAIN PANEL - Create the panel
            JPanel mainPanel = new JPanel();//This is the main panel
            mainPanel.setLayout(new GridBagLayout());//This is the layout of the main panel
            mainPanel.setPreferredSize(new Dimension(500, 500));
            GridBagConstraints gbc_mainPanel = new GridBagConstraints();//This is the constraints of the main panel
            //gbc_mainPanel.insets = new Insets(5, 5, 5, 5);//This is the spacing between the components of the main panel
            gbc_mainPanel.fill = GridBagConstraints.BOTH;//This is the fill of the main panel
            gbc_mainPanel.gridx = 0;//This is the x position of the main panel
            gbc_mainPanel.gridy = 0;//This is the y position of the main panel
            gbc_mainPanel.gridwidth = 3;//This is the width of the main panel
            gbc_mainPanel.gridheight = 3;//This is the height of the main panel
            frame.add(mainPanel, gbc_mainPanel);//This adds the main panel to the frame
        //endregion

        //region - TITLE LABEL - Create the title label
            JLabel titleLabel = new JLabel("Shape GUI");//This is the label for the dropdown menu
            titleLabel.setLayout(new GridBagLayout());//This is the layout of the title label
            GridBagConstraints gbc_titleLabel = new GridBagConstraints();//This is the constraints of the title label
            //gbc_titleLabel.insets = new Insets(5, 5, 5, 5);//This is the spacing between the components of the title label
            gbc_titleLabel.gridx = 1;//This is the x position of the title label
            gbc_titleLabel.gridy = 1;//This is the y position of the title label
            gbc_titleLabel.gridwidth = 1;//This is the width of the title label
            gbc_titleLabel.gridheight = 1;//This is the height of the title label
            gbc_titleLabel.weightx = 1;//This is the weight of the title label
            //gbc_titleLabel.weighty = 1;//This is the weight of the title label
            mainPanel.add(titleLabel, gbc_titleLabel);//This adds the title label to the main panel
            
        //endregion

        //region - DROPDOWN MENU - Create the dropdown menu, with Select Shape as the default option
            String[] shapes = {"Select Shape", "Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cylinder", "Cube", "Cone", "Torus"};//This is the array of shapes that will be displayed in the dropdown menu
            JComboBox<String> dropdownCB = new JComboBox<String>(shapes);//This is the dropdown menu
            dropdownCB.setLayout(new GridBagLayout());//This is the layout of the dropdown menu
            GridBagConstraints gbc_dropdownCB = new GridBagConstraints();//This is the constraints of the dropdown menu
            gbc_dropdownCB.insets = new Insets(5, 5, 5, 5);//This is the spacing between the components of the dropdown menu

            gbc_dropdownCB.gridx = 1;//This is the x position of the dropdown menu
            gbc_dropdownCB.gridy = 2;//This is the y position of the dropdown menu
            gbc_dropdownCB.gridwidth = 1;//This is the width of the dropdown menu
            gbc_dropdownCB.gridheight = 1;//This is the height of the dropdown menu
            mainPanel.add(dropdownCB, gbc_dropdownCB);//This adds the dropdown menu to the main panel
        //endregion

        //region - INPUT PANEL - Create the input panel for the users input for the shapes. This will also hold the error message and the button to display the shape
            JPanel inputPanel = new JPanel();//This is the panel for the users input for the shapes
            inputPanel.setLayout(new GridBagLayout());//This is the layout of the input panel
            inputPanel.setPreferredSize(new Dimension(100, 100));
            GridBagConstraints gbc_inputPanel = new GridBagConstraints();//This is the constraints of the input panel
            gbc_inputPanel.insets = new Insets(5, 5, 5, 5);//This is the spacing between the components of the input panel
            gbc_inputPanel.gridx = 0;//This is the x position of the input panel
            gbc_inputPanel.gridy = 3;//This is the y position of the input panel
            mainPanel.add(inputPanel, gbc_inputPanel);//This adds the input panel to the main panel

        //endregion

        //region - ERROR MESSAGE - Create the error message
            JLabel errorMessage = new JLabel("");//This is the error message
            errorMessage.setLayout(new GridBagLayout());//This is the layout of the error message
            GridBagConstraints gbc_errorMessage = new GridBagConstraints();//This is the constraints of the error message
            gbc_errorMessage.insets = new Insets(5, 5, 5, 5);//This is the spacing between the components of the error message
            gbc_errorMessage.gridx = 0;//This is the x position of the error message
            gbc_errorMessage.gridy = 0;//This is the y position of the error message
            gbc_errorMessage.gridwidth = 1;//This is the width of the error message
            gbc_errorMessage.gridheight = 1;//This is the height of the error message
            inputPanel.add(errorMessage, gbc_errorMessage);//This adds the error message to the input panel
        //endregion

        //region - DISPLAY BUTTON - Create the button to display the shape
            JButton displayShapeButton = new JButton("Display Shape");//This is the button to display the shape
            displayShapeButton.setLayout(new GridBagLayout());//This is the layout of the button to display the shape
            GridBagConstraints gbc_displayShapeButton = new GridBagConstraints();//This is the constraints of the button to display the shape
            gbc_displayShapeButton.insets = new Insets(5, 5, 5, 5);//This is the spacing between the components of the button to display the shape
            gbc_displayShapeButton.gridx = 1;//This is the x position of the button to display the shape
            gbc_displayShapeButton.gridy = 0;//This is the y position of the button to display the shape
            gbc_displayShapeButton.gridwidth = 1;//This is the width of the button to display the shape
            gbc_displayShapeButton.gridheight = 1;//This is the height of the button to display the shape
            inputPanel.add(displayShapeButton, gbc_displayShapeButton);//This adds the button to display the shape to the input panel


        //endregion

        //region - 2D SHAPES INPUT - Create the input panels for each 2-dimensional shapes
            //region - CIRCLE INPUT PANEL - Create the input panel for the circle
                JPanel circleInputPanel = new JPanel();//This is the panel for the users input for the circle
                    circleInputPanel.setLayout(new GridBagLayout());//This is the layout of the panel for the users input for the circle
                    GridBagConstraints gbc_circleInputPanel = new GridBagConstraints();//This is the constraints of the panel for the users input for the circle
                    gbc_circleInputPanel.insets = new Insets(5, 5, 5, 5);//This is the spacing between the components of the panel for the users input for the circle
                    gbc_circleInputPanel.gridx = 0;//This is the x position of the panel for the users input for the circle
                    gbc_circleInputPanel.gridy = 0;//This is the y position of the panel for the users input for the circle
                    gbc_circleInputPanel.gridwidth = 1;//This is the width of the panel for the users input for the circle
                    gbc_circleInputPanel.gridheight = 1;//This is the height of the panel for the users input for the circle
                    gbc_circleInputPanel.weightx = 1;//This is the weight of the panel for the users input for the circle
                    gbc_circleInputPanel.weighty = 1;//This is the weight of the panel for the users input for the circle
                    inputPanel.add(circleInputPanel, gbc_circleInputPanel);//This adds the panel for the users input for the circle to the input panel
                    
                    //region - CIRCLE INPUT LABEL - Create the label for the users input for the circle
                        JLabel circleInputLabel = new JLabel("Enter the radius of the circle: ");//This is the label for the users input for the circle

                    //endregion

                    //region - CIRCLE INPUT TEXT FIELD - Create the text field for the users input for the circle
                        JTextField circleInputTextField = new JTextField(10);//This is the text field for the users input for the circle
                    //endregion
            //endregion

            //region - SQUARE INPUT PANEL - Create the input panel for the square
                JPanel squareInputPanel = new JPanel();//This is the panel for the users input for the square

                    //region - SQUARE INPUT LABEL - Create the label for the users input for the square
                        JLabel squareInputLabel = new JLabel("Enter the length of the square: ");//This is the label for the users input for the square
                        
                    //endregion

                    //region - SQUARE INPUT TEXT FIELD - Create the text field for the users input for the square
                        JTextField squareInputTextField = new JTextField(10);//This is the text field for the users input for the square
                    //endregion
            //endregion

            //region - RECTANGLE INPUT PANEL - Create the input panel for the rectangle
                JPanel rectangleInputPanel = new JPanel();//This is the panel for the users input for the rectangle
                    //region - RECTANGLE INPUT LABEL - Create the label for the users input for the rectangle
                        JLabel rectangleInputLabelL = new JLabel("Enter the length of the rectangle: ");//This is the label for the users input for the rectangle length
                        
                        JLabel rectangleInputLabelW = new JLabel("Enter the width of the rectangle: ");//This is the label for the users input for the rectangle width
                    //endregion

                    //region - RECTANGLE INPUT TEXT FIELD - Create the text field for the users input for the rectangle
                        JTextField rectangleInputTextFieldL = new JTextField(10);//This is the text field for the users input for the rectangle length

                        JTextField rectangleInputTextFieldW = new JTextField(10);//This is the text field for the users input for the rectangle width
                    //endregion
            //endregion

            //region - TRIANGLE INPUT PANEL - Create the input panel for the triangle
                JPanel triangleInputPanel = new JPanel();//This is the panel for the users input for the triangle
                //region - TRIANGLE INPUT LABEL - Create the label for the users input for the triangle
                    JLabel triangleInputLabelB = new JLabel("Enter Base length of the triangle: ");//This is the label for the users input for the triangle
                    
                    JLabel triangleInputLabelH = new JLabel("Enter Height of the triangle: ");//This is the label for the users input for the triangle
                //endregion

                //region - TRIANGLE INPUT TEXT FIELD - Create the text field for the users input for the triangle
                    JTextField triangleInputTextFieldB = new JTextField(10);//This is the text field for the users input for the triangle
                    
                    JTextField triangleInputTextFieldH = new JTextField(10);//This is the text field for the users input for the triangle
                //endregion
            //endregion
        //endregion
       
        //region - SHAPE PANEL - Create the panel for the shape
            JPanel shapeInputPanel = new JPanel(new CardLayout());//This is the panel for the shape
                CardLayout cl_shapeInputPanel = (CardLayout)(shapeInputPanel.getLayout());//This is the layout of the panel for the shape
                shapeInputPanel.setPreferredSize( new Dimension( 300, 300 ) );//This is the size of the panel for the shape
        //endregion

        //region - SHAPE DISPLAY - Create the panel for the shape display
            JPanel shapeDisplayPanel = new JPanel(new CardLayout());//This is the panel for the shape display
                CardLayout cl_shapeDisplayPanel = (CardLayout)(shapeDisplayPanel.getLayout());//This is the layout of the panel for the shape display
                shapeDisplayPanel.setPreferredSize( new Dimension( 300, 300 ) );//This is the size of the panel for the shape display

            //region -SHAPE DISPLAY INSTANCES - Create the instances of the shapes
                //region - 2D SHAPES - Create the instances of the 2-dimensional shapes
                    CircleDisplayPanel circleDisplay = new CircleDisplayPanel();//This is the instance of the circle display
                    SquareDisplayPanel squareDisplay = new SquareDisplayPanel();//This is the instance of the square display
                    RectangleDisplayPanel rectangleDisplay = new RectangleDisplayPanel();//This is the instance of the rectangle display
                    TriangleDisplayPanel triangleDisplay = new TriangleDisplayPanel();//This is the instance of the triangle display
                //endregion
                //region - 3D SHAPES - Create the instances of the 3-dimensional shapes
                    SphereDisplayPanel sphereDisplay = new SphereDisplayPanel();//This is the instance of the sphere display
                    CubeDisplayPanel cubeDisplay = new CubeDisplayPanel();//This is the instance of the cube display
                    ConeDisplayPanel coneDisplay = new ConeDisplayPanel();//This is the instance of the cone display
                    CylinderDisplayPanel cylinderDisplay = new CylinderDisplayPanel();//This is the instance of the cylinder display
                    TorusDisplayPanel torusDisplay = new TorusDisplayPanel();//This is the instance of the torus display
                //endregion
            //endregion
        //endregion
        
        //region - DEFAULT SETTINGS - Set the default settings for the GUI
            frame.setVisible(true);//This makes the frame visible to start with
                mainPanel.setVisible(true);//This makes the main panel visible to start with
                    titleLabel.setVisible(true);//This makes the title label visible to start with
                    dropdownCB.setVisible(true);//This makes the dropdown menu visible to start with
                    dropdownCB.setSelectedIndex(0);//This is the default option in the dropdown menu
                    inputPanel.setVisible(false);//This makes the input panel invisible to start with
                        errorMessage.setVisible(false);//This makes the error message invisible to start with
                        displayShapeButton.setVisible(false);//This makes the display shape button visible to start with
                    shapeInputPanel.setVisible(false);//This makes the panel for the shape input visible to start with
        //endregion

        dropdownCB.addActionListener(comboBoxListener -> {
            if (comboBoxListener.getSource() instanceof JComboBox) {
                //Get the selected item from the dropdown menu.
                String selectedShape = (String) dropdownCB.getSelectedItem();
                displayShapeButton.setVisible(false);

                //region - SWITCH STATEMENT - This is the switch statement for the dropdown menu
                    switch(selectedShape) {
                        case "Circle":
                            inputPanel.setVisible(true);
                            shapeInputPanel.setVisible(true);
                            displayShapeButton.setVisible(true);
                            circleInputPanel.setVisible(true);
                            cl_shapeInputPanel.show(shapeInputPanel, "circleInputPanel");
                            cl_shapeDisplayPanel.show(shapeDisplayPanel, "circleDisplay");
                            break;
                    }
                //endregion
            }
        });
        frame.revalidate();
        frame.repaint();
        frame.pack();
    }


    


    //Method: main
    public static void main(String[] args) {
        //Create the GUI
        createGUI();
    }
}

