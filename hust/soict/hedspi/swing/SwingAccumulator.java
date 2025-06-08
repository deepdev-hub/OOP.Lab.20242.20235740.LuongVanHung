package hust.soict.hedspi.swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingAccumulator extends JFrame{
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum= 0;
    
    public JTextField getTfInput() {
        return tfInput;
    }
    public void setTfInput(JTextField tfInput) {
        this.tfInput = tfInput;
    }
    public JTextField getTfOutput() {
        return tfOutput;
    }
    public void setTfOutput(JTextField tfOutput) {
        this.tfOutput = tfOutput;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public SwingAccumulator(){
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2,2));
        cp.add(new JLabel("enter a integer: "));
        tfInput = new JTextField(10);
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener());
        cp.add(new JLabel("the accumulated sum is: "));
        tfOutput = new JTextField(10)        ;
        tfOutput.setEditable(false);
        cp.add(tfOutput);
        setTitle("accumulator");
        setSize(300, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingAccumulator();
    }
    private class TFInputListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum+"");
            
        }
    }


}
