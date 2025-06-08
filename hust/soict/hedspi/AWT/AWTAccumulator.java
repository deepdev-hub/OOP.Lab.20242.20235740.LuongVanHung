package hust.soict.hedspi.AWT;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame{
    private TextField tfInput;
    private TextField tfOutput;
    public TextField getTfOutput() {
        return tfOutput;
    }
    public void setTfOutput(TextField tfOutput) {
        this.tfOutput = tfOutput;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    private int sum=0;

    public AWTAccumulator (){
        setLayout(new GridLayout(2,2));
        add(new Label ("enter a integer"));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());
        add(new Label("the accumulator is: "));
        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);
        setTitle("AWTAccumulator");
        setSize(320,150);
        setVisible(true);

    }
    public static void main(String[] args) {
        new AWTAccumulator();
    }

    public TextField getTfInput() {
        return tfInput;
    }

    public void setTfInput(TextField tfInput) {
        this.tfInput = tfInput;
    }
    private class TFInputListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            int numberIn = Integer.parseInt(tfInput.getText());
            sum+=numberIn;
            tfInput.setText("");
            tfOutput.setText(sum+"");
        }
    }
}

