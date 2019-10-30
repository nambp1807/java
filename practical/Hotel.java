package practical;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    public String name;
    public String location;
    public String ownerName;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

     public void addHotel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập thông tin :");

             System.out.println("nhập tên Hotel :");
             setName(sc.nextLine());
             System.out.println("nhập vị trí :");
             setLocation(sc.nextLine());
             System.out.println("nhập tên chủ sở hữu :");
             setOwnerName(sc.nextLine());


     }



}
