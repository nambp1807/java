package LabSesson5;

import java.util.Scanner;

public class Person {

    public String ten;
    public String Gioitinh;
    public  String NgaySinh;
    public String DiaChi;

    public Person() {
    }

    public Person(String ten, String gioitinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        Gioitinh = gioitinh;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void InputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên :");
        setTen(sc.nextLine());
        System.out.println("nhập giới tính :");
        setGioitinh(sc.nextLine());
        System.out.println("nhập ngày sinh :");
        setNgaySinh(sc.nextLine());
        System.out.println("nhập địa chỉ :");
        setDiaChi(sc.nextLine());
    }

    public void ShowInfo(){
        System.out.println(" tên"+this.ten);
        System.out.println(" giới tính"+this.Gioitinh);
        System.out.println("ngày sinh"+this.NgaySinh);
        System.out.println("địa chỉ"+this.DiaChi);
    }
}
