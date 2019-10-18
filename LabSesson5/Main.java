package LabSesson5;

public class Main {
    public static void main(String[] args) {
        String birthday = "2001-02-22";
        String[] arr = birthday.split("-");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int year = Integer.parseInt(arr[0]);
        System.out.println("Year: "+year);


        Student s1 = new Student();
        s1.InputInfo();
        s1.KiemTraTuoi();

    }
}
