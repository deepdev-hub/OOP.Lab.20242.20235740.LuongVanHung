import javax.swing.JOptionPane;

public class DisplayTriangle {
	public static void main(String args[]) {
		
		int n = Integer.parseInt( JOptionPane.showInputDialog("Enter n: "));
		for(int i=0;i<n;i++) {
			for(int u=0;u<n-i;u++) {
				System.out.print(" ");
			}
			for(int j=0;j<=2*i;j++) {
				
				System.out.print( "*");
			}
			System.out.println();
		}
	}
}
