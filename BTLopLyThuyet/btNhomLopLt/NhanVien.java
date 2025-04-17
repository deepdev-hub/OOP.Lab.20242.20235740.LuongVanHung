public class NhanVien {

    public static double getLuongCoBan() {
        return luongCoBan;
    }

    public static void setLuongCoBan(double luongCoBan) {
        if(luongCoBan<=0) {
            System.out.println("luong co ban phai >0");
            return;
        }
        NhanVien.luongCoBan = luongCoBan;
    }
   private String tenNhanVien;// noname
   static double luongCoBan = 1.2;
   static final double LUONG_MAX = 10.0;
   private double heSoLuong =1;

   public NhanVien() {
      this.tenNhanVien = "NONAME";
      this.heSoLuong = 1.0;
   }

   public NhanVien(String tenNhanVien, double heSoLuong) {
      this.tenNhanVien = tenNhanVien;
      this.heSoLuong = heSoLuong;
   }

   public double tinhLuong() {
      return this.heSoLuong * NhanVien.luongCoBan;
   }

   boolean tangHeSoLuong(double heSoTang) {
    if(this.heSoLuong + heSoTang<=0) {
        System.out.println("he so luong phai >0");
        return false;
    }
      if ((this.heSoLuong + heSoTang) * NhanVien.luongCoBan<= LUONG_MAX) {
         this.heSoLuong += heSoTang;
         return true;
      } else {
         System.out.println("Luong vuot muc toi da khong the tang them");
         return false;
      }
   }

   public void inTTin() {
      System.out.println("Ten nhan vien: " + this.tenNhanVien);
      System.out.println("He so luong: " + this.heSoLuong);
      System.out.println("Luong: " + this.tinhLuong() + " tr vnd.");
   }



    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getHeSoLuong() {
        
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        if(heSoLuong<=0) {
            System.out.println("he so luong phai >0");
            return;
        }
        this.heSoLuong = heSoLuong;
    }
}
