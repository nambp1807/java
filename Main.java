package Assignment4;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(1,"Tivi",2,20000);
        Product p2 = new Product(2,"Loa",23,10000);
        Product p3 = new Product(3,"Dien thoai",3,50000);
        Cart c1 = new Cart(1,"nguyen van a",0,"HN");
        Cart c2 = new Cart(2,"nguyen van b",0,"DN");


        c1.themSp(p1);
        c1.themSp(p2);


        c2.themSp(p2);
        c2.themSp(p3);

        System.out.println("so tien gio hang 1 :" +c1.checkOut());
        System.out.println("so tien gio hang 2 :" +c2.checkOut());


    }
}
