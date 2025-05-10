import javax.swing.JOptionPane;
public class bai226{
    public static void main(String[] args) {
        int control;
        double a1, a2, b1, b2, c1, c2;
        control = Integer.parseInt( JOptionPane.showInputDialog("nhap vao dang pt muon giai\n1. bac nhat 1 an\n2. bac nhat 2 an\n3. bac hai 1 an: "));
        switch (control) {
            case 1:
                a1 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: ax+b=0\na="));
                b1 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: ax+b=0\nb="));
                JOptionPane.showMessageDialog(null, "x = " +(-b1/a1));
                break;
            case 2:
                a1 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: a1x+b1y=c1\na2x+b2y-c2\na1="));
                b1 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: a1x+b1y=c1\na2x+b2y-c2\nb1="));
                c1 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: a1x+b1y=c1\na2x+b2y-c2\nc1="));
                a2 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: a1x+b1y=c1\na2x+b2y-c2\na2="));
                b2 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: a1x+b1y=c1\na2x+b2y-c2\nb2="));
                c2 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: a1x+b1y=c1\na2x+b2y-c2\nc2="));
                double d0= a1*b2-a2*b1;
                double d1= c1*b2-c2*b1;
                double d2= a1*c2-a2*c1;
                JOptionPane.showMessageDialog(null, "x = " +(d1/d0)+"\ny = "+(d2/d0));
                break;
            case 3:
                a1 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: ax^2+bx=c\na="));
                b1 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: ax^2+bx=c\nb="));
                c1 = Integer.parseInt( JOptionPane.showInputDialog("dang pt: ax^2+bx=c\nc="));
                double denta = b1*b1-4*a1*c1;
                JOptionPane.showMessageDialog(null, "x1 = " +(-b1+Math.sqrt(denta))/(2*a1));
                break;
            default:
                break;
        }
        System.exit(0);
    }
}