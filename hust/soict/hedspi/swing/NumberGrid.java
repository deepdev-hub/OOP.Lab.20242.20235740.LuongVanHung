package hust.soict.hedspi.swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class NumberGrid extends JFrame{
    private JButton[] buttonNumbers = new JButton[10];
    private JButton buttonDelete, buttonReset;
    private JTextField textFieldDisplay;
    
    void addButtons(JPanel jPanel){
        ButtonListener buttonListener = new ButtonListener();

        for (int i = 1; i < 10; i++) {
            buttonNumbers[i] = new JButton(""+ i);
            jPanel.add(buttonNumbers[i]);
            buttonNumbers[i].addActionListener(buttonListener);
        }
        buttonNumbers[0]= new JButton(""+0);
        jPanel.add(buttonNumbers[0]);
        buttonDelete = new JButton("DEL");
        jPanel.add(buttonDelete);
        buttonDelete.addActionListener(buttonListener);
        buttonReset = new JButton("C");
        jPanel.add(buttonReset);
        buttonReset.addActionListener(buttonListener);

    }
    public NumberGrid(){
        textFieldDisplay = new JTextField("0");
        textFieldDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        JPanel jPanel = new JPanel(new GridLayout(4,3));
        addButtons(jPanel);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(textFieldDisplay, BorderLayout.NORTH);
        container.add(jPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("NumberGrid");
        setSize(200, 200);
        setVisible(true);
    }
    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            String button = actionEvent.getActionCommand();
            String currentText = textFieldDisplay.getText();

            if(button.equals("C")){
                textFieldDisplay.setText("0");
                return;
            } else if(button.equals("DEL")){
                if(currentText.isEmpty()){
                    return;
                } else{
                    textFieldDisplay.setText(currentText.substring(0, currentText.length()-1));
                }
                
            }else{
                textFieldDisplay.setText(currentText+button);
            }
            
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NumberGrid());    }

}
