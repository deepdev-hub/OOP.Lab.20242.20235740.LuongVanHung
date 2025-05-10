import  java.util.Scanner;
public class bai63 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap vao n: ");
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }		
            for(int j=0;j<=i+i-2;j++) {
                System.out.print("*");
            }		
            System.out.println();
        }
		scanner.close();
	}
}
