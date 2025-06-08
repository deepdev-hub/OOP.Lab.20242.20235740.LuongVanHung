package hust.soict.hedspi.swing;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberGridTest extends JFrame {
    // Attributes
    private JButton[] btnNumbers; // Array for digit buttons (0-9)
    private JButton btnDelete;    // DEL button
    private JButton btnReset;     // C (Clear) button
    private JTextField tfDisplay; // Display text field

    public NumberGridTest() {
        // Set up the JFrame
        super("Number Grid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        tfDisplay = new JTextField("0", 20); // Initial text is "0"
        tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
        tfDisplay.setEditable(false); // Read-only

        btnNumbers = new JButton[10]; // Buttons for digits 0-9
        for (int i = 0; i < 10; i++) {
            btnNumbers[i] = new JButton(String.valueOf(i));
        }
        btnDelete = new JButton("DEL");
        btnReset = new JButton("C");

        // Create content pane with BorderLayout
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());

        // Add display to the NORTH
        pane.add(tfDisplay, BorderLayout.NORTH);

        // Create panel for buttons with GridLayout (4x3)
        JPanel panelButtons = new JPanel(new GridLayout(4, 3, 5, 5));
        addButtons(panelButtons);

        // Add panel to the CENTER
        pane.add(panelButtons, BorderLayout.CENTER);

        // Set frame properties
        setSize(300, 400);
        setVisible(true);
    }

    // Method to add buttons to the panel
    private void addButtons(JPanel panel) {
        // Create listener
        ButtonListener btnListener = new ButtonListener();

        // Add buttons 1-9
        for (int i = 1; i <= 9; i++) {
            panel.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(btnListener);
        }
        // Add DEL, 0, and C buttons
        panel.add(btnDelete);
        panel.add(btnNumbers[0]);
        panel.add(btnReset);

        // Attach listener to DEL and C
        btnDelete.addActionListener(btnListener);
        btnReset.addActionListener(btnListener);
    }

    // Inner class for handling button events
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the source of the event
            Object source = e.getSource();

            // Case 1: Digit button (0-9)
            for (int i = 0; i < 10; i++) {
                if (source == btnNumbers[i]) {
                    String currentText = tfDisplay.getText();
                    // Avoid leading zeros unless the current text is "0"
                    if (currentText.equals("0")) {
                        tfDisplay.setText(String.valueOf(i));
                    } else {
                        tfDisplay.setText(currentText + i);
                    }
                    return;
                }
            }

            // Case 2: DEL button
            if (source == btnDelete) {
                String currentText = tfDisplay.getText();
                if (currentText.length() > 1) {
                    // Remove the last character
                    tfDisplay.setText(currentText.substring(0, currentText.length() - 1));
                } else {
                    // If only one character or empty, set to "0"
                    tfDisplay.setText("0");
                }
                return;
            }

            // Case 3: C (Reset) button
            if (source == btnReset) {
                tfDisplay.setText("0"); // Clear to "0"
                return;
            }
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NumberGridTest());
    }
}

