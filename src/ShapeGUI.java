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
    private static String input;

    //Method: create the GUI
    public static void createGUI() {
        //region - FRAME - Create the frame (window)
            JFrame frame = new JFrame("Shape GUI");//This is the window that the GUI will be displayed in.
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//This will close the window when the user clicks the close button
            frame.setSize(500, 500);//This is the size of the window
            frame.setVisible(true);//This will make the window visible

        //endregion
        
        //region - MAIN PANEL - Create the panel
            JPanel mainPanel = new JPanel();//This is the main panel
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));//This will set the layout of the main panel to be vertical
            frame.add(mainPanel);//This will add the main panel to the frame
        //endregion

        //region - TITLE LABEL - Create the title label
            JLabel titleLabel = new JLabel("Shape GUI");//This is the label for the dropdown menu
            titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the label to the center of the panel
            titleLabel.setAlignmentY(Component.TOP_ALIGNMENT);//This will align the label to the top of the panel
        //endregion

        //region - DROPDOWN MENU - Create the dropdown menu, with Select Shape as the default option
            String[] shapes = {"Select Shape", "Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cylinder", "Cube", "Cone", "Torus"};//This is the array of shapes that will be displayed in the dropdown menu
            JComboBox<String> dropdownCB = new JComboBox<String>(shapes);//This is the dropdown menu
            dropdownCB.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the dropdown menu to the center of the panel
            dropdownCB.setAlignmentY(Component.TOP_ALIGNMENT);//This will align the dropdown menu to the top of the panel
            dropdownCB.setMaximumSize(new Dimension(100, 25));//This will set the size of the dropdown menu
            
        //endregion

        //region - INPUT PANEL - Create the input panel for the users input for the shapes. This will also hold the error message and the button to display the shape
            JPanel inputPanel = new JPanel();//This is the panel for the users input for the shapes
            inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));//This will set the layout of the input panel to be vertical
            inputPanel.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the input panel to the center of the panel
            inputPanel.setMinimumSize(new Dimension(200, 100));//This will set the size of the input panel
            inputPanel.setMaximumSize(new Dimension(400, 150));//This will set the size of the input panel
            
        //endregion

        //region - ERROR MESSAGE - Create the error message
            JLabel errorMessage = new JLabel("");//This is the error message
            errorMessage.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the error message to the center of the panel
            errorMessage.setAlignmentY(Component.TOP_ALIGNMENT);//This will align the error message to the top of the panel
            
        //endregion

        //region - DISPLAY BUTTON - Create the button to display the shape
            JButton displayShapeButton = new JButton("Display Shape");//This is the button to display the shape
            displayShapeButton.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the button to the center of the panel
            displayShapeButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);//This will align the button to the top of the panel
            
        //endregion

        //region - 2D SHAPES INPUT - Create the input panels for each 2-dimensional shapes
            //region - CIRCLE INPUT PANEL - Create the input panel for the circle
                JPanel circleInputPanel = new JPanel();//This is the panel for the users input for the circle
                    Box cipBox = Box.createHorizontalBox();//This will create a horizontal box
                    circleInputPanel.setLayout(new BoxLayout(circleInputPanel, BoxLayout.Y_AXIS));//This will set the layout of the panel to be vertical
                    circleInputPanel.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the panel to the center of the panel
                    circleInputPanel.setAlignmentY(Component.CENTER_ALIGNMENT);//This will align the panel to the top of the panel
                    circleInputPanel.setMaximumSize(new Dimension(300, 150));//This will set the size of the panel
                    
                    //region - CIRCLE INPUT LABEL - Create the label for the users input for the circle
                        JLabel circleInputLabel = new JLabel("Enter the radius of the circle: ");//This is the label for the users input for the circle
                            circleInputLabel.setAlignmentX(Component.LEFT_ALIGNMENT);//This will align the label to the left of the panel
                            circleInputPanel.add(circleInputLabel);//This will add the label to the panel
                    //endregion

                    //region - CIRCLE INPUT TEXT FIELD - Create the text field for the users input for the circle
                        JTextField circleInputTextField = new JTextField();//This is the text field for the users input for the circle
                            circleInputTextField.setMinimumSize(new Dimension(100, 25));//This will set the size of the text field
                            circleInputTextField.setMaximumSize(new Dimension(100, 25));//This will set the size of the text field
                            circleInputPanel.add(circleInputTextField);//This will add the text field to the panel
                    //endregion
                cipBox.add(circleInputLabel);//This will add the label to the horizontal box
                cipBox.add(circleInputTextField);//This will add the text field to the horizontal box
                circleInputPanel.add(cipBox);//This will add the horizontal box to the panel
            //endregion

            //region - SQUARE INPUT PANEL - Create the input panel for the square
                JPanel squareInputPanel = new JPanel();//This is the panel for the users input for the square
                    Box sipBox = Box.createHorizontalBox();//This will create a horizontal box
                    squareInputPanel.setLayout(new BoxLayout(squareInputPanel, BoxLayout.Y_AXIS));//This will set the layout of the panel to be vertical
                    squareInputPanel.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the panel to the center of the panel
                    squareInputPanel.setAlignmentY(Component.CENTER_ALIGNMENT);//This will align the panel to the top of the panel
                    squareInputPanel.setMaximumSize(new Dimension(300, 150));//This will set the size of the panel

                    //region - SQUARE INPUT LABEL - Create the label for the users input for the square
                        JLabel squareInputLabel = new JLabel("Enter the length of the square: ");//This is the label for the users input for the square
                            squareInputLabel.setAlignmentX(Component.LEFT_ALIGNMENT);//This will align the label to the left of the panel
                            squareInputPanel.add(squareInputLabel);//This will add the label to the panel
                    //endregion

                    //region - SQUARE INPUT TEXT FIELD - Create the text field for the users input for the square
                        JTextField squareInputTextField = new JTextField(10);//This is the text field for the users input for the square
                            squareInputTextField.setMinimumSize(new Dimension(100, 25));//This will set the size of the text field
                            squareInputTextField.setMaximumSize(new Dimension(100, 25));//This will set the size of the text field
                            squareInputPanel.add(squareInputTextField);//This will add the text field to the panel
                    //endregion
                sipBox.add(squareInputLabel);//This will add the label to the horizontal box
                sipBox.add(squareInputTextField);//This will add the text field to the horizontal box
                squareInputPanel.add(sipBox);//This will add the horizontal box to the panel
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
            JPanel shapeInputPanel = new JPanel();//This is the panel for the shape
            shapeInputPanel.setLayout(new BoxLayout(shapeInputPanel, BoxLayout.Y_AXIS));//This will set the layout of the panel to be vertical
            shapeInputPanel.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the panel to the center of the panel
            shapeInputPanel.setAlignmentY(Component.CENTER_ALIGNMENT);//This will align the panel to the top of the panel
            shapeInputPanel.setMaximumSize(new Dimension(300, 150));//This will set the size of the panel
            
        //endregion

        //region - SHAPE DISPLAY - Create the panel for the shape display
            //region - SHAPE DISPLAY PANEL - Create the panel for the shape display
                JPanel shapeDisplayPanel = new JPanel();//This is the panel for the shape display
                shapeDisplayPanel.setLayout(new BoxLayout(shapeDisplayPanel, BoxLayout.Y_AXIS));//This will set the layout of the panel to be vertical
            //endregion


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
        
        //region - ADDING COMPONENTS - Add the components to the panel
            mainPanel.add(titleLabel);//This will add the title label to the panel
            mainPanel.add(dropdownCB);//This will add the dropdown box to the panel
            mainPanel.add(inputPanel);//This will add the input panel to the panel
                inputPanel.add(errorMessage);//This will add the error message to the panel
                inputPanel.add(shapeInputPanel);//This will add the shape input panel to the panel
                    shapeInputPanel.add(circleInputPanel);//This will add the circle input panel to the panel
                    shapeInputPanel.add(squareInputPanel);//This will add the square input panel to the panel
                    shapeInputPanel.add(rectangleInputPanel);//This will add the rectangle input panel to the panel
                    shapeInputPanel.add(triangleInputPanel);//This will add the triangle input panel to the panel
                inputPanel.add(displayShapeButton);//This will add the display shape button to the panel
            mainPanel.add(shapeDisplayPanel);//This will add the shape display panel to the panel
        //endregion

        //region - DEFAULT SETTINGS - Set the default settings for the GUI
            frame.setVisible(true);//This makes the frame visible to start with
                mainPanel.setVisible(true);//This makes the main panel visible to start with
                    titleLabel.setVisible(true);//This makes the title label visible to start with
                    dropdownCB.setVisible(true);//This makes the dropdown menu visible to start with
                    dropdownCB.setSelectedIndex(0);//This is the default option in the dropdown menu
                    inputPanel.setVisible(false);//This makes the input panel invisible to start with
                        errorMessage.setVisible(false);//This makes the error message invisible to start with
                        shapeInputPanel.setVisible(false);//This makes the shape input panel invisible to start with
                            circleInputPanel.setVisible(false);//This makes the circle input panel invisible to start with
                            squareInputPanel.setVisible(false);//This makes the square input panel invisible to start with
                            rectangleInputPanel.setVisible(false);//This makes the rectangle input panel invisible to start with
                            triangleInputPanel.setVisible(false);//This makes the triangle input panel invisible to start with

        //endregion
        ActionListener[] dropdownCBListeners = dropdownCB.getActionListeners();
        for (ActionListener listener : dropdownCBListeners) {
            dropdownCB.removeActionListener(listener);
        }
        
        dropdownCB.addActionListener(ShapeSelectionListener -> {
            
            if (ShapeSelectionListener.getSource() instanceof JComboBox) {
                ActionListener[] displayShapeButtonListeners = displayShapeButton.getActionListeners();
                for (ActionListener listener : displayShapeButtonListeners) {
                    displayShapeButton.removeActionListener(listener);
                }
                String selectedShape = (String) dropdownCB.getSelectedItem();
                inputPanel.setVisible(false);//This will make the input panel invisible
                errorMessage.setVisible(false);//This will make the error message invisible
                shapeInputPanel.removeAll();//This will remove all the components from the shape input panel
                circleInputPanel.setVisible(false);//This will make the circle input panel invisible
                squareInputPanel.setVisible(false);//This will make the square input panel invisible
                rectangleInputPanel.setVisible(false);//This will make the rectangle input panel invisible
                triangleInputPanel.setVisible(false);//This will make the triangle input panel invisible
                displayShapeButton.setVisible(false);//This will make the display shape button invisible
                shapeDisplayPanel.setVisible(false);//This will make the shape display panel invisible
                shapeDisplayPanel.removeAll();//This will remove all the components from the shape display panel

                //region - SWITCH STATEMENT - This is the switch statement for the dropdown menu
                    switch(selectedShape) {
                        case "Circle":
                            inputPanel.setVisible(true);//This will make the input panel visible
                            shapeInputPanel.setVisible(true);//This will make the shape input panel visible
                            shapeInputPanel.add(circleInputPanel);//This will add the circle input panel to the shape input panel
                            circleInputPanel.setVisible(true);//This will make the circle input panel visible
                            displayShapeButton.setVisible(true);//This will make the display shape button visible
                            displayShapeButton.addActionListener(CircleListener -> {//This is the action listener for the display shape button
                                if (CircleListener.getSource() instanceof JButton) {
                                    try{
                                        input = circleInputTextField.getText();//This is the input from the text field
                                        int inputChecked = checkInput(input);//This is the checked input from the text field
                                        switch(inputChecked){
                                            case 0:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e1"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 1:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e2"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 2:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e3"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 3:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e4"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 4:
                                                errorMessage.setVisible(false);
                                                shapeDisplayPanel.setVisible(true);
                                                shapeDisplayPanel.removeAll();//This removes all the components from the shape display panel
                                                shapeDisplayPanel.add(circleDisplay);//This adds the circle display to the shape display panel
                                                circleDisplay.setRadius(Integer.parseInt(input));//This sets the radius of the circle display
                                                circleDisplay.revalidate();//This revalidates the circle display
                                                circleDisplay.repaint();//This repaints the circle display
                                                break;
                                            default:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e5"));
                                                errorMessage.setVisible(true);
                                                break;
                                        }
                                    }catch(Exception e){
                                        errorMessage.setText(getErrorMessage("e5"));
                                        errorMessage.setVisible(true);
                                    }
                                }
                                
                            });
                            break;

                        case "Square":
                            inputPanel.setVisible(true);
                            shapeInputPanel.setVisible(true);
                            shapeInputPanel.add(squareInputPanel);
                            squareInputPanel.setVisible(true);
                            displayShapeButton.setVisible(true);
                            //Create the button listener for the display shape button
                            displayShapeButton.addActionListener(SquareListener -> {
                                if (SquareListener.getSource() instanceof JButton) {

                                    try{
                                        input = squareInputTextField.getText();//This is the input from the text field
                                        int inputChecked = checkInput(input);//This is the checked input from the text field
                                        switch(inputChecked){
                                            case 0:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e1"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 1:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e2"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 2:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e3"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 3:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e4"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 4:
                                                errorMessage.setVisible(false);
                                                shapeDisplayPanel.setVisible(true);
                                                shapeDisplayPanel.removeAll();//This removes all the components from the shape display panel
                                                shapeDisplayPanel.add(squareDisplay);//This adds the square display to the shape display panel
                                                squareDisplay.setSide(Integer.parseInt(input));//This sets the side of the square display
                                                squareDisplay.revalidate();//This revalidates the square display
                                                squareDisplay.repaint();//This repaints the square display
                                                break;
                                            default:
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e5"));
                                                errorMessage.setVisible(true);
                                                break;
                                        }
                                    }catch(Exception e){
                                        errorMessage.setText(getErrorMessage("e5"));
                                        errorMessage.setVisible(true);
                                    }
                                }
                                
                            });
                            break;

                            default:
                                inputPanel.setVisible(false);
                                shapeInputPanel.setVisible(false);
                                circleInputPanel.setVisible(false);
                                squareInputPanel.setVisible(false);
                                displayShapeButton.setVisible(false);
                                shapeDisplayPanel.setVisible(false);
                                errorMessage.setVisible(false);
                                break;
                            
                    }
                //endregion
            }
        });
        frame.revalidate();
        frame.repaint();
    }


    private static String getErrorMessage(String eCode){
        switch(eCode){
            case "e1": return "Error: Cannot use non-numeric values.";
            case "e2": return "Error: Cannot leave field empty.";
            case "e3": return "Error: Number must be greater than 0.";
            case "e4": return "Error: Number must be less than 200.";
            default: return "Error: Unknown error.";
        }
    }

    //Create method to check if a string is non-numeric (contains alphabetical characters), empty, less than 0 (contains a '-' or is 0), or greater than 200. Reuturn a int to indicate which error it is.
    private static int checkInput(String input){
        if(input.isEmpty()) return 1;
        if(!input.matches("-?\\d+(\\.\\d+)?")) return 0;
        if(Integer.parseInt(input) <= 0) return 2;
        if(Integer.parseInt(input) > 200) return 3;
        return 4;
    }
    


    //Method: main
    public static void main(String[] args) {
        //Create the GUI
        createGUI();
    }
}

