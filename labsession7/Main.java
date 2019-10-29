package labsession7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean p = true;
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (p){
            System.out.println("1. Add student");
            System.out.println("2. Edit student by ID");
            System.out.println("3. Delete student by ID");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");
            int opt = sc.hasNextInt()? sc.nextInt():7;
            switch (opt){
                case 1:studentList.add(Main.addStudent());break;
                case 2:editStudent(studentList); break;
                case 3:deleteStudent(studentList); break;
            }
        }
    }

    public static Student addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID :");
        int id = sc.hasNextInt() ?sc.nextInt() :0;
        sc.nextLine();
        System.out.println("nhập tên :");
        String name = sc.nextLine();
        System.out.println("nhập tuổi :");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập địa chỉ :");
        String address = sc.nextLine();
        System.out.println("nhập GPA:");
        double gpa = sc.nextDouble();
        return new Student(id,name,age,address,gpa);
    }

    public static void editStudent(ArrayList<Student>studentList){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID muốn sửa:");
        int id = sc.hasNextInt() ?sc.nextInt() :0;
        sc.nextLine();
        for (Student s: studentList){
            if (s.getId()==id){
                System.out.println("nhập tên :");
                String name = sc.nextLine();

                System.out.println("nhập tuổi :");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.println("nhập địa chỉ :");
                String address = sc.nextLine();

                System.out.println("nhập GPA:");
                double gpa = sc.nextDouble();
            }
        }
    }

    public static void deleteStudent(ArrayList<Student>studentList){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID muốn xóa :");
        int id = sc.hasNextInt() ?sc.nextInt() :0;
        sc.nextLine();
        for (Student s: studentList){
            if (s.getId()==id){
                studentList.remove(s);
                return;
            }
        }

    }


}
