public class Main{
    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVien("Luong Van Hung", 5.0);
        NhanVien nhanvien2 = new NhanVien();
        nhanvien1.inTTin();
        System.out.println(".()");
        nhanvien1.tangHeSoLuong(2.5);
        nhanvien1.inTTin();
        System.out.println(".()");
        nhanvien2.inTTin();
        System.out.println(".()");
        PhongBan phong1 = new  PhongBan();
        phong1.inTTin();
        System.out.println(".()");
        phong1.themNV(nhanvien2);
        phong1.inTTin();
        System.out.println(".()");
        phong1.themNV(nhanvien1);
        System.out.println("tong luong: "+ phong1.tinhTongLuong());
        phong1.inTTin();
        System.out.println(".()");
        phong1.xoaNV();
        phong1.xoaNV();
        phong1.xoaNV();
        System.out.println("tong luong "+ phong1.tinhTongLuong());
        phong1.inTTin();
        System.out.println(".()");

     }
}