package assignment7;

import java.util.Scanner;

public class Customer {
    protected int CusID;
    protected String ten;
    protected String ngayhoadon;
    protected float sodien;
    protected static int[] dongia = {1000,1200,1500,2000};
    protected static int[] dinhmuc = {0,50,100,200};
    protected float tongtien;

    public Customer() {
        tinhtongtien();
    }
    public Customer(int cusID, String ten, String ngayhoadon, float sodien) {
        CusID = cusID;
        this.ten = ten;
        this.ngayhoadon = ngayhoadon;
        this.sodien = sodien;
        tinhtongtien();
    }
    public int getCusID() { return CusID; }
    public void setCusID(int cusID) { CusID = cusID; }
    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }
    public String getNgayhoadon() { return ngayhoadon; }
    public void setNgayhoadon(String ngayhoadon) { this.ngayhoadon = ngayhoadon; }
    public float getSodien() { return sodien; }
    public void setSodien(float sodien) { this.sodien = sodien; }

    public void inputCustomer(){
        System.out.println("Nhap thong tin khach hang: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID khach hang: ");
        setCusID(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        setTen(sc.nextLine());
        System.out.println("Nhap ngay in hoa don: ");
        setNgayhoadon(sc.nextLine());
        System.out.println("Nhap so luong dien tieu thu (kW): ");
        setSodien(sc.nextInt());
    }

    public void showCustomer(){
        System.out.println("ID: "+getCusID()+" - Ten KH: "+getTen()
                +" - Ngay in hoa don: "+getNgayhoadon()+" - So luong dien tieu thu (kW): "+getSodien());
    }

    public void tinhtongtien(){
        if(getSodien()<50){
            tongtien = getSodien() * dongia[0];
        }
        else if(getSodien()>50&getSodien()<100){
            tongtien = 50*dongia[0] + (getSodien()-50)*dongia[1];
        }
        else if(getSodien()>100&getSodien()<200){
            tongtien = 50*dongia[0] + 50*dongia[1] + (getSodien()-100)*dongia[2];
        }
        else {
            tongtien = 50*dongia[0] + 50*dongia[1] + 100*dongia[2] + (getSodien()-200)*dongia[3];
        }
    }
}