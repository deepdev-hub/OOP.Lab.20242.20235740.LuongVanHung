import java.util.Stack;  
public class PhongBan{
    Stack<NhanVien> stk = new Stack<>();
    private String tenPhongBan;
    private int soNhanVien=0;
    static final int SO_NV_MAX = 100;




    public boolean themNV(NhanVien NhanVien){
        if(soNhanVien+1== SO_NV_MAX){
            System.out.println("so nhan vien da dat toi da khong the them nua");
            return false;
        }
        this.stk.push(NhanVien);
        this.soNhanVien++;
        return true;
    }
    public  NhanVien xoaNV(){
        if(this.soNhanVien<=0){
            System.out.println("phong nay rong khong co nhan vien de xoa");
            return null;
        }
        this.soNhanVien--;
        return this.stk.pop();
    }
    public double tinhTongLuong(){
        double tongLuong = 0;
        for(NhanVien temp : stk){
            //NhanVien temp = new NhanVien();
            tongLuong+= temp.tinhLuong();
        }
        return tongLuong;
    }
    public void inTTin(){
        System.out.println("ten phong ban: "+ this.getTenPhongBan() );
        System.out.println("so nhan vien: "+ this.getSoNhanVien() );
        System.out.println("tong luong la: "+ this.tinhTongLuong());
        System.out.println("Hien thi thong tin cac nhan vien trong phong nay: ");
        for (NhanVien temp : stk) {
            //NhanVien temp = new NhanVien();
            temp.inTTin();
        }
    }

    public Stack<NhanVien> getStk() {
        return stk;
    }

    public void setStk(Stack<NhanVien> stk) {
        this.stk = stk;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

}