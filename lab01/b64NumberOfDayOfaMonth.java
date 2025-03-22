import javax.swing.JOptionPane;
public class b64NumberOfDayOfaMonth {
	static int leepYearOrNot(int y) {
		if((y%4==0)&&!((y%100==0)&&(!(y%400==0))))		return 1;
		return 0;
	}
	public static void main(String args[]) {
		int m = Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Enter year"));
		
		switch(m) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12:
				JOptionPane.showMessageDialog(null, "This month have "+ 31+ "days");
				break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
		
				JOptionPane.showMessageDialog(null, "This month have "+ 31+ "days");
				break;
		case 2 :
			
			JOptionPane.showMessageDialog(null, "This month have "+ (28 + leepYearOrNot(y)) + "days");
			break;
		
			default:
				break;
		}
	
	}
}
