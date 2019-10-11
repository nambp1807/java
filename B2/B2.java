package b2;
 public class B2{
    public static void main(String[] args) {
        
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("Lam", 20, "Pho Hue", 150, 2000);
        NhanVien nv3 = new NhanVien("Long", 20, "Sai Dong", 210, 3000);
        nv1.inputInfo();
        nv1.printInfo();
        System.out.println(nv1.tinhThuong());
        System.out.println(nv2.tinhThuong());
        System.out.println(nv3.tinhThuong());
    }
    
}