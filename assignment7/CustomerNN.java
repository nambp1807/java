package assignment7;

import java.util.Scanner;

public class CustomerNN extends Customer {
    private String quoctich;

    public CustomerNN() {
        inputCustomer();
        this.tinhtongtien();
    }

    public CustomerNN(int cusID, String ten, String ngayhoadon, float sodien, String quoctich) {
        super(cusID, ten, ngayhoadon, sodien);
        this.quoctich = quoctich;
        this.tinhtongtien();
    }

    public String getQuoctich() { return quoctich; }
    public void setQuoctich(String quoctich) { this.quoctich = quoctich; }

    @Override
    public void inputCustomer() {
        super.inputCustomer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Quoc tich:");
        setQuoctich(sc.nextLine());
    }

    @Override
    public void showCustomer() {
        super.showCustomer();
        System.out.println("Quoc tich: "+getQuoctich()+" - Tong tien: "+this.tongtien);
    }

    @Override
    public void tinhtongtien() {
        tongtien = this.getSodien() * this.dongia[3];
    }
}