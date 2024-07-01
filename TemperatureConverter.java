import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class TemperatureConverter extends JFrame { 
 
    private JTextField celsiusTextField; 
    private JTextField fahrenheitTextField; 
 
    public TemperatureConverter() { 
        // Set the title of the JFrame 
        setTitle("Temperature Converter"); 
 
        // Create JLabels for Celsius and Fahrenheit 
        JLabel celsiusLabel = new JLabel("Celsius:"); 
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:"); 
 
        // Create JTextFields for Celsius and Fahrenheit 
        celsiusTextField = new JTextField(10); 
        fahrenheitTextField = new JTextField(10); 
        fahrenheitTextField.setEditable(false); // Set as non-editable 
 
        // Create JButton for conversion 
        JButton convertButton = new JButton("Convert"); 
 
        // Add ActionListener to the convertButton 
        convertButton.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                // Perform the conversion when the button is clicked 
                convertTemperature(); 
            } 
        }); 
 
        // Set the layout manager for the JFrame 
        setLayout(new FlowLayout()); 
 
        // Add components to the JFrame 
        add(celsiusLabel); 
        add(celsiusTextField); 
        add(fahrenheitLabel); 
        add(fahrenheitTextField); 
        add(convertButton); 
 
        // Set the default close operation, size, and visibility 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(300, 150); 
        setLocationRelativeTo(null); // Center the frame on the screen 
        setVisible(true); 
    } 
 
    // Method to convert temperature from Celsius to Fahrenheit 
    private void convertTemperature() { 
        try { 
            // Get the Celsius temperature from the input 
            double celsius = Double.parseDouble(celsiusTextField.getText()); 
 
            // Perform the conversion 
            double fahrenheit = (celsius * 9 / 5) + 32; 
 
            // Display the result in the fahrenheitTextField 
            fahrenheitTextField.setText(String.format("%.2f", fahrenheit)); 
        } catch (NumberFormatException ex) { 
            // Handle the case where the input is not a valid number 
            JOptionPane.showMessageDialog(this, 
                    "Invalid input. Please enter a valid number.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE); 
        } 
    } 
 
    public static void main(String[] args) { 
        // Create an instance of the JFrame 
        new TemperatureConverter(); 
    } 
}
