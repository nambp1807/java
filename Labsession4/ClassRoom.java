package Labsession4;

import java.util.ArrayList;

public class ClassRoom {
    public String TenPhong;
    public String ViTriPhong;
    public ArrayList<User> dsUser;

    public ClassRoom(){
        dsUser = new ArrayList<>();
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public String getViTriPhong() {
        return ViTriPhong;
    }

    public void setViTriPhong(String viTriPhong) {
        ViTriPhong = viTriPhong;
    }

    public ArrayList<User> getDsUser() {
        return dsUser;
    }

    public void setDsUser(ArrayList<User> dsUser) {
        this.dsUser = dsUser;
    }

    public void themUser(User a ){
        this.dsUser.add( a );
    }
    public void  xoaUser(User a){
        this.dsUser.remove(a);
    }

    public void showInfo(){
        System.out.println("ten phong"+getTenPhong());
        System.out.println("vi tri"+getViTriPhong());
//        for (int i = 0;i<this.dsUser.size();i++){
//            System.out.println(this.dsUser.get(i).getTen());
//            System.out.println(this.dsUser.get(i).getTuoi());
//            System.out.println(this.dsUser.get(i).getCmnd());
//        }

        for (User a :this.dsUser){
            System.out.println(a.getTen());
            System.out.println(a.getTuoi());
            System.out.println(a.getCmnd());
        }

    }

}
