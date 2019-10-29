package assignment7;

import java.util.Scanner;

public class CustomerVN extends Customer {
    private String doituong;

    public CustomerVN() {
        inputCustomer();
        this.tinhtongtien();
    }

    public CustomerVN(int cusID, String ten, String ngayhoadon, float sodien, String doituong) {
        super(cusID, ten, ngayhoadon, sodien);
        this.doituong = doituong;
        this.tinhtongtien();
    }


    public String getDoituong() { return doituong; }
    public void setDoituong(String doituong) { this.doituong = doituong; }

    @Override
    public void inputCustomer() {
        super.inputCustomer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap doi tuong:");
        setDoituong(sc.nextLine());
    }

    @Override
    public void showCustomer() {
        super.showCustomer();
        System.out.println("Doi tuong: "+getDoituong()+" - Tong tien: "+this.tongtien);
    }

    @Override
    public void tinhtongtien() {
        super.tinhtongtien();
    }
}