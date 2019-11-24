package jv2_assignment1;

public class AddProduct implements Comparable<AddProduct> {
     public String name;
     public String masp;
     public String price;
     public String amount;

    public static String sortBy = "name";
    public static String sortOrder = "ASC";

    public AddProduct() {
    }

    public AddProduct(String name, String masp, String price, String amount) {
        this.name = name;
        this.masp = masp;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(AddProduct o) {
        if (AddProduct.sortBy.equals("name")){
            if (AddProduct.sortOrder.equals("ASC")){
                return this.getName().compareTo(o.getName());
            }else {
                return -this.getName().compareTo(o.getName());
            }
        }else {
            if (AddProduct.sortOrder.equals("ASC")){
                return this.getName().compareTo(o.getName());
            }else {
                return -this.getName().compareTo(o.getName());
            }
        }
    }
}

