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
    private static String input1;
    private static String input2;

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
                        JTextField squareInputTextField = new JTextField();//This is the text field for the users input for the square
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
                    Box ripBox1 = Box.createHorizontalBox();//This will create a horizontal box
                    Box ripBox2 = Box.createHorizontalBox();//This will create a horizontal box
                    rectangleInputPanel.setLayout(new BoxLayout(rectangleInputPanel, BoxLayout.Y_AXIS));//This will set the layout of the panel to be vertical
                    rectangleInputPanel.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the panel to the center of the panel
                    rectangleInputPanel.setAlignmentY(Component.CENTER_ALIGNMENT);//This will align the panel to the top of the panel
                    rectangleInputPanel.setMaximumSize(new Dimension(300, 150));//This will set the size of the panel

                    //region - RECTANGLE INPUT LABEL - Create the label for the users input for the rectangle
                        JLabel rectangleInputLabelL = new JLabel("Enter the length of the rectangle: ");//This is the label for the users input for the rectangle length
                            rectangleInputLabelL.setAlignmentX(Component.LEFT_ALIGNMENT);//This will align the label to the left of the panel
                            rectangleInputPanel.add(rectangleInputLabelL);//This will add the label to the panel
                        
                        JLabel rectangleInputLabelW = new JLabel("Enter the width of the rectangle: ");//This is the label for the users input for the rectangle width
                            rectangleInputLabelW.setAlignmentX(Component.LEFT_ALIGNMENT);//This will align the label to the left of the panel
                            rectangleInputPanel.add(rectangleInputLabelW);//This will add the label to the panel
                    //endregion

                    //region - RECTANGLE INPUT TEXT FIELD - Create the text field for the users input for the rectangle
                        JTextField rectangleInputTextFieldL = new JTextField();//This is the text field for the users input for the rectangle length
                            rectangleInputTextFieldL.setMinimumSize(new Dimension(100, 25));//This will set the size of the text field
                            rectangleInputTextFieldL.setMaximumSize(new Dimension(100, 25));//This will set the size of the text field
                            rectangleInputPanel.add(rectangleInputTextFieldL);//This will add the text field to the panel

                        JTextField rectangleInputTextFieldW = new JTextField();//This is the text field for the users input for the rectangle width
                            rectangleInputTextFieldW.setMinimumSize(new Dimension(100, 25));//This will set the size of the text field
                            rectangleInputTextFieldW.setMaximumSize(new Dimension(100, 25));//This will set the size of the text field
                            rectangleInputPanel.add(rectangleInputTextFieldW);//This will add the text field to the panel
                    //endregion
                ripBox1.add(rectangleInputLabelL);//This will add the label to the horizontal box
                ripBox1.add(rectangleInputTextFieldL);//This will add the text field to the horizontal box
                ripBox2.add(rectangleInputLabelW);//This will add the label to the horizontal box
                ripBox2.add(rectangleInputTextFieldW);//This will add the text field to the horizontal box
                rectangleInputPanel.add(ripBox1);//This will add the horizontal box to the panel
                rectangleInputPanel.add(ripBox2);//This will add the horizontal box to the panel

            //endregion

            //region - TRIANGLE INPUT PANEL - Create the input panel for the triangle
                JPanel triangleInputPanel = new JPanel();//This is the panel for the users input for the triangle
                    Box tipBox1 = Box.createHorizontalBox();//This will create a horizontal box
                    Box tipBox2 = Box.createHorizontalBox();//This will create a horizontal box
                    triangleInputPanel.setLayout(new BoxLayout(triangleInputPanel, BoxLayout.Y_AXIS));//This will set the layout of the panel to be vertical
                    triangleInputPanel.setAlignmentX(Component.CENTER_ALIGNMENT);//This will align the panel to the center of the panel
                    triangleInputPanel.setAlignmentY(Component.CENTER_ALIGNMENT);//This will align the panel to the top of the panel
                    triangleInputPanel.setMaximumSize(new Dimension(300, 150));//This will set the size of the panel

                    //region - TRIANGLE INPUT LABEL - Create the label for the users input for the triangle
                        JLabel triangleInputLabelB = new JLabel("Enter Base length of the triangle: ");//This is the label for the users input for the triangle
                            triangleInputLabelB.setAlignmentX(Component.LEFT_ALIGNMENT);//This will align the label to the left of the panel
                            triangleInputPanel.add(triangleInputLabelB);//This will add the label to the panel
                        
                        JLabel triangleInputLabelH = new JLabel("Enter Height of the triangle: ");//This is the label for the users input for the triangle
                            triangleInputLabelH.setAlignmentX(Component.LEFT_ALIGNMENT);//This will align the label to the left of the panel
                            triangleInputPanel.add(triangleInputLabelH);//This will add the label to the panel
                    //endregion

                    //region - TRIANGLE INPUT TEXT FIELD - Create the text field for the users input for the triangle
                        JTextField triangleInputTextFieldB = new JTextField();//This is the text field for the users input for the triangle
                            triangleInputTextFieldB.setMinimumSize(new Dimension(100, 25));//This will set the size of the text field
                            triangleInputTextFieldB.setMaximumSize(new Dimension(100, 25));//This will set the size of the text field
                            triangleInputPanel.add(triangleInputTextFieldB);//This will add the text field to the panel

                        JTextField triangleInputTextFieldH = new JTextField();//This is the text field for the users input for the triangle
                            triangleInputTextFieldH.setMinimumSize(new Dimension(100, 25));//This will set the size of the text field
                            triangleInputTextFieldH.setMaximumSize(new Dimension(100, 25));//This will set the size of the text field
                            triangleInputPanel.add(triangleInputTextFieldH);//This will add the text field to the panel
                    //endregion
                tipBox1.add(triangleInputLabelB);//This will add the label to the horizontal box
                tipBox1.add(triangleInputTextFieldB);//This will add the text field to the horizontal box
                tipBox2.add(triangleInputLabelH);//This will add the label to the horizontal box
                tipBox2.add(triangleInputTextFieldH);//This will add the text field to the horizontal box
                triangleInputPanel.add(tipBox1);//This will add the horizontal box to the panel
                triangleInputPanel.add(tipBox2);//This will add the horizontal box to the panel
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
                    //region - CIRCLE CASE - This is the case for the circle
                        case "Circle":
                            inputPanel.setVisible(true);//This will make the input panel visible
                            shapeInputPanel.setVisible(true);//This will make the shape input panel visible
                            shapeInputPanel.add(circleInputPanel);//This will add the circle input panel to the shape input panel
                            circleInputPanel.setVisible(true);//This will make the circle input panel visible
                            displayShapeButton.setVisible(true);//This will make the display shape button visible
                            displayShapeButton.addActionListener(CircleListener -> {//This is the action listener for the display shape button
                                if (CircleListener.getSource() instanceof JButton) {
                                    try{
                                        input1 = circleInputTextField.getText();//This is the input from the text field
                                        input2 = circleInputTextField.getText();//This is the input from the text field
                                        int inputChecked = checkInput(input1, input2);//This is the checked input from the text field
                                        switch(inputChecked){
                                            case 0://This is the case for when the input is non-numeric
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e1"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 1://This is the case for when the input is empty
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e2"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 2://This is the case for when the input is less than or = to 0
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e3"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 3://This is the case for when the input is greater than 199
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e4"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 4://This is the case for when the input is not an integer
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e5"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 5://This is the case for when the input is valid
                                                errorMessage.setVisible(false);
                                                shapeDisplayPanel.setVisible(true);
                                                shapeDisplayPanel.removeAll();//This removes all the components from the shape display panel
                                                shapeDisplayPanel.add(circleDisplay);//This adds the circle display to the shape display panel
                                                circleDisplay.setRadius(Integer.parseInt(input1));//This sets the radius of the circle display
                                                circleDisplay.revalidate();//This revalidates the circle display
                                                circleDisplay.repaint();//This repaints the circle display
                                                break;
                                            default://This is the default case. This should never be reached
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e6"));
                                                errorMessage.setVisible(true);
                                                break;
                                        }
                                    }catch(Exception e){
                                        errorMessage.setText(getErrorMessage("e7"));
                                        errorMessage.setVisible(true);
                                    }
                                }
                                
                            });
                            break;//End of case "Circle"
                        //endregion

                    //region - SQUARE CASE - This is the case for the square
                        case "Square":
                            inputPanel.setVisible(true);//This will make the input panel visible
                            shapeInputPanel.setVisible(true);//This will make the shape input panel visible
                            shapeInputPanel.add(squareInputPanel);//This will add the square input panel to the shape input panel
                            squareInputPanel.setVisible(true);//This will make the square input panel visible
                            displayShapeButton.setVisible(true);//This will make the display shape button visible
                            displayShapeButton.addActionListener(SquareListener -> {//This is the action listener for the display shape button
                                if (SquareListener.getSource() instanceof JButton) {

                                    try{
                                        input1 = squareInputTextField.getText();//This is the input from the text field
                                        input2 = squareInputTextField.getText();//This is the input from the text field
                                        int inputChecked = checkInput(input1, input2);//This is the checked input from the text field
                                        switch(inputChecked){
                                            case 0://This is the case for when the input is not a numeric value
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e1"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 1://This is the case for when the input is empty
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e2"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 2://This is the case for when the input is less than = to 0
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e3"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 3://This is the case for when the input is greater than 199
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e4"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 4://This is the case for when the input is not an integer
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e5"));
                                                errorMessage.setVisible(true);
                                                break;
                                            case 5://This is the case for when the input is valid
                                                errorMessage.setVisible(false);
                                                shapeDisplayPanel.setVisible(true);
                                                shapeDisplayPanel.removeAll();//This removes all the components from the shape display panel
                                                shapeDisplayPanel.add(squareDisplay);//This adds the square display to the shape display panel
                                                squareDisplay.setSide(Integer.parseInt(input1));//This sets the side of the square display
                                                squareDisplay.revalidate();//This revalidates the square display
                                                squareDisplay.repaint();//This repaints the square display
                                                break;
                                            default://This is the default case, this should never be reached
                                                shapeDisplayPanel.setVisible(false);
                                                errorMessage.setText(getErrorMessage("e6"));
                                                errorMessage.setVisible(true);
                                                break;
                                        }
                                    }catch(Exception e){
                                        errorMessage.setText(getErrorMessage("e6"));
                                        errorMessage.setVisible(true);
                                    }
                                }
                            });
                            break;//End of case "Square"
                    //endregion

                    //region - RECTANGLE CASE - This is the case for the rectangle
                            case "Rectangle":
                                inputPanel.setVisible(true);//This will make the input panel visible
                                shapeInputPanel.setVisible(true);//This will make the shape input panel visible
                                shapeInputPanel.add(rectangleInputPanel);//This will add the rectangle input panel to the shape input panel
                                rectangleInputPanel.setVisible(true);//This will make the rectangle input panel visible
                                displayShapeButton.setVisible(true);//This will make the display shape button visible
                                displayShapeButton.addActionListener(RectangleListener -> {//This is the action listener for the display shape button
                                    if (RectangleListener.getSource() instanceof JButton) {
                                        try{
                                            input1 = rectangleInputTextFieldL.getText();//This is the input from the text field
                                            input2 = rectangleInputTextFieldW.getText();//This is the input from the text field
                                            int inputChecked = checkInput(input1, input2);//This is the checked input from the text field
                                            switch(inputChecked){
                                                case 0://This is the case for when the input is not a numeric value
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e1"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 1://This is the case for when the input is empty
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e2"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 2://This is the case for when the input is less than = to 0
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e3"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 3://This is the case for when the input is greater than 199
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e4"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 4://This is the case for when the input is not an integer
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e5"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 5://This is the case for when the input is valid
                                                    errorMessage.setVisible(false);
                                                    shapeDisplayPanel.setVisible(true);
                                                    shapeDisplayPanel.removeAll();//This removes all the components from the shape display panel
                                                    shapeDisplayPanel.add(rectangleDisplay);//This adds the rectangle display to the shape display panel
                                                    rectangleDisplay.setLength(Integer.parseInt(input1));//This sets the length of the rectangle display
                                                    rectangleDisplay.setWidth(Integer.parseInt(input2));//This sets the width of the rectangle display
                                                    rectangleDisplay.revalidate();//This revalidates the rectangle display
                                                    rectangleDisplay.repaint();//This repaints the rectangle display
                                                    break;
                                                default://This is the default case, this should never be reached
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e6"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                            }
                                        }catch(Exception e){
                                            errorMessage.setText(getErrorMessage("e6"));
                                            errorMessage.setVisible(true);
                                        }
                                    }
                                });
                                break;//End of case "Rectangle"
                    //endregion
                                
                    //region - TRIANGLE CASE - This is the case for the triangle
                            case "Triangle":
                                inputPanel.setVisible(true);//This will make the input panel visible
                                shapeInputPanel.setVisible(true);//This will make the shape input panel visible
                                shapeInputPanel.add(triangleInputPanel);//This will add the triangle input panel to the shape input panel
                                triangleInputPanel.setVisible(true);//This will make the triangle input panel visible
                                displayShapeButton.setVisible(true);//This will make the display shape button visible
                                displayShapeButton.addActionListener(TriangleListener -> {//This is the action listener for the display shape button
                                    if (TriangleListener.getSource() instanceof JButton) {
                                        try{
                                            input1 = triangleInputTextFieldB.getText();//This is the input from the text field
                                            input2 = triangleInputTextFieldH.getText();//This is the input from the text field
                                            int inputChecked = checkInput(input1, input2);//This is the checked input from the text field
                                            switch(inputChecked){
                                                case 0://This is the case for when the input is not a numeric value
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e1"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 1://This is the case for when the input is empty
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e2"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 2://This is the case for when the input is less than = to 0
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e3"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 3://This is the case for when the input is greater than 199
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e4"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 4://This is the case for when the input is not an integer
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e5"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                                case 5://This is the case for when the input is valid
                                                    errorMessage.setVisible(false);
                                                    shapeDisplayPanel.setVisible(true);
                                                    shapeDisplayPanel.removeAll();//This removes all the components from the shape display panel
                                                    shapeDisplayPanel.add(triangleDisplay);//This adds the triangle display to the shape display panel
                                                    triangleDisplay.setBase(Integer.parseInt(input1));//This sets the length of the triangle display
                                                    triangleDisplay.setHeight(Integer.parseInt(input2));//This sets the width of the triangle display
                                                    triangleDisplay.revalidate();//This revalidates the triangle display
                                                    triangleDisplay.repaint();//This repaints the triangle display
                                                    break;
                                                default://This is the default case, this should never be reached
                                                    shapeDisplayPanel.setVisible(false);
                                                    errorMessage.setText(getErrorMessage("e6"));
                                                    errorMessage.setVisible(true);
                                                    break;
                                            }
                                        }catch(Exception e){
                                            errorMessage.setText(getErrorMessage("e6"));
                                            errorMessage.setVisible(true);
                                        }
                                    }
                                });
                                break;//End of case "Triangle"
                    //endregion

                    //region - DEFAULT CASE - This is the default case, this should never be reached
                            default:
                                inputPanel.setVisible(false);
                                shapeInputPanel.setVisible(false);
                                circleInputPanel.setVisible(false);
                                squareInputPanel.setVisible(false);
                                displayShapeButton.setVisible(false);
                                shapeDisplayPanel.setVisible(false);
                                errorMessage.setVisible(false);
                                break;
                    //endregion
                    }
                //endregion
            }
        });
        frame.revalidate();
        frame.repaint();
    }

    //Method: get the error message based on the error code
    private static String getErrorMessage(String eCode){
        switch(eCode){
            case "e1": return "Error: Cannot use non-numeric values.";
            case "e2": return "Error: Cannot leave field empty.";
            case "e3": return "Error: Number must be greater than 0.";
            case "e4": return "Error: Number must be less than 200.";
            case "e5": return "Please use a whole number.";
            case "e7": return "Went to catch block.";
            default: return "Error: Unknown error.";
        }
    }

    //Method: check if a string is non-numeric (contains alphabetical characters), empty, less than 0 (contains a '-' or is 0), or greater than 200. Reuturn a int to indicate which error it is.
    private static int checkInput(String input1, String input2){
        if(input2.equals("null")) input2 = null;

        if(input1.isEmpty() || ((input2.isEmpty()) && (input2 != null))) return 1;//This is the case for when the input is empty
        if(!input1.matches("-?\\d+(\\.\\d+)?") || ((!input2.matches("-?\\d+(\\.\\d+)?")) && (input2 != null))) return 0;//This is the case for when the input is not a numeric value
        if(!input1.matches("-?(\\d+)?") || ((!input2.matches("-?(\\d+)?")) && (input2 != null))) return 4;//This is the case for when the input is not an integer
        if(Integer.parseInt(input1) <= 0 || ((Integer.parseInt(input2) <= 0) && (input2 != null))) return 2;//This is the case for when the input is less than or equal to 0
        if(Integer.parseInt(input1) > 199 || ((Integer.parseInt(input2) > 199) && (input2 != null))) return 3;//This is the case for when the input is greater than 199
        return 5;//This is the case for when the input is valid
    }
    


    //Method: main
    public static void main(String[] args) {
        //Create the GUI
        createGUI();
    }
}

