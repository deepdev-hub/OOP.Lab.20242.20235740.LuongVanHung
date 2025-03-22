import javax.swing.JOptionPane;

public class LinearEquation {
	public static void main(String args[]) {
		String aStr, bStr;
		aStr = JOptionPane.showInputDialog(null, "Input a: ", "Phuong trinh dang ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
		bStr = JOptionPane.showInputDialog(null, "Input b: ", "Phuong trinh dang ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
		
		double a = Double.parseDouble(aStr);
		double b = Double.parseDouble(bStr);
	
		if(a == 0) {
			if(b != 0) {
				JOptionPane.showMessageDialog(null, "Vo Nghiem");
			}
			else {
				JOptionPane.showMessageDialog(null, "Vo So Nghiem");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Nghiem cua phuong trinh la x = " + String.format("%.2f", -b/a));
		}
		
		System.exit(0);
	}
}
