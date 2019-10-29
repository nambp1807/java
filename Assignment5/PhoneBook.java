package Assignment5;

import java.util.ArrayList;

public class PhoneBook extends Phone {

    public ArrayList<PhoneNumber> PhoneList;

    public PhoneBook(ArrayList<PhoneNumber> phoneList) {
        PhoneList = phoneList;
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p : PhoneList){
            if (p.getName().equals(name)){
              if (p.getPhone().(phone)){
                  p.setPhone(p.getPhone()+":"+);
              }

            }
            PhoneNumber PhoneNumber = new PhoneNumber(name,phone);
            PhoneList.add(PhoneNumber);
        }
    }

    @Override
    public void removePhone(String name) {
            for (PhoneNumber p:PhoneList){
                if (p.getName().equals(name)){
                    PhoneList.remove(p);
                    return;
                }
            }
    }

    @Override
    public void updatePhone(String name, String newphone) {
            for (PhoneNumber p : PhoneList){
                if (p.getName().equals(name)){
                    p.setPhone(newphone);
                    return;
                }
            }
    }

    @Override
    public void searchPhone(String name) {
           for (PhoneNumber p :PhoneList){
               if (p.getName().equals(name)){
                   System.out.println(p.getPhone());
                   return;
               }
           }
    }

    @Override
     void sort()
    }
}
