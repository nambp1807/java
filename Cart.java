package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    public int Id;
    public String Customer;
    public double GrandTotal;
    public String City;
    public ArrayList<Product> ProductList ;


    public Cart(){
        ProductList = new ArrayList<>();
    }

    public Cart(int id, String customer, double grandTotal, String city) {
        Id = id;
        Customer = customer;
        GrandTotal = grandTotal;
        City = city;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public double getGrandTotal() {
        return GrandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        GrandTotal = grandTotal;
    }

    public ArrayList<Product> getProductList() {
        return ProductList;
    }

    public void setProductList(ArrayList<Product> productList) {
        ProductList = productList;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public boolean themSp(Product product){
         if (product.KiemTra()){
             this.ProductList.add(product);
             product.setQty(product.getQty()-1);
             this.setGrandTotal(this.getGrandTotal()+product.getPrice());
             return  true;
         }
         return false;
      }


    public boolean removeProductFromCart (Product product){
        if (this.ProductList.contains(product)){
            this.ProductList.remove(product);
            product.setQty(product.getQty()+1);
            this.setGrandTotal(this.getGrandTotal()-product.getPrice());
            return true;
        }
        return false;
    }

//    public void Inputinfo(){
//        Scanner s = new Scanner(System.in);
//        System.out.println("nhập City");
//        setCity(s.nextLine());
//    }

    public double checkOut(){
        if (this.getCity().equals("HN")||this.getCity().equals("HCM")){
            return this.getGrandTotal()*1.01;
        }else {
            return this.getGrandTotal()*1.02;

        }
    }


}
