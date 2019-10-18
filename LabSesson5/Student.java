package LabSesson5;

import java.time.LocalDate;

public class Student extends Person {

    @Override
    public void InputInfo() {
        super.InputInfo();
    }

    public void KiemTraTuoi(){
        LocalDate now = LocalDate.now();
        String[] arrS = this.getNgaySinh().split("-");
        if(now.getYear() - Integer.parseInt(arrS[2])>=18) System.out.println("Du 18");
        else System.out.println("Khong du 18");
    }


}
