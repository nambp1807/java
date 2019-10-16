package Assignment4;

import java.util.Scanner;

public class Product {
    public int id;
    public String ProductName;
    public int Qty;
    public double Price;

    public  Product(){

    }
    public Product(int id,String ProductName,int Qty,double Price){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void InputInfo(){
         System.out.println("nhập thông tin :");
         Scanner sc = new Scanner(System.in);
         System.out.println("nhập ID:");
         setId(sc.nextInt());
         sc.nextLine();
         System.out.println("ProductName :");
         setProductName(sc.nextLine());
         System.out.println("nhập số lượng:");
         setQty(sc.nextInt());
         System.out.println("nhập giá");
         setPrice(sc.nextInt());

    }
    public void showInfo(){
        System.out.println("thông tin :");
        System.out.println("id :"+id);
        System.out.println("Name :"+ProductName);
        System.out.println("Qty:"+Qty);
        System.out.println("Price :"+Price);
    }

    public boolean  KiemTra(){
        if (Qty>0){
            return true;

        }else {
            return false;

        }
    }

}
