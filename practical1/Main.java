package practical1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean p = true;
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (p){
            System.out.println("1. Add student records");
            System.out.println("2. Display student records ");
            System.out.println("3. Save");
            System.out.println("4. Exit");
            int opt = sc.hasNextInt()? sc.nextInt():7;
            switch (opt){
                case 1:list.add(Main.addStudent());break;
                case 2: displayStudent(list); break;
                case 3 :

            }
        }
    }

    public static Student addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập StudentId:");
        String studentId = sc.nextLine();
        sc.nextLine();
        System.out.println("nhập Student Name:");
        String studentName = sc.nextLine();
        System.out.println("nhập Address:");
        String address = sc.nextLine();
        System.out.println("nhập phone :");
        String phone = sc.nextLine();

        return new Student(studentId,studentName,address,phone);
    }
    public static   void  displayStudent(ArrayList<Student>list){
        for (Student st : list){
            System.out.println(st.studentId+st.studentName+st.address+st.phone);
        }
    }

    public static void save(){
        
        ArrayList<Student> st = new ArrayList<>();
        File f = new File("C:\\Users\\Admin\\Desktop\\demo.txt.txt");
        String ftxt = "";
        if(f.canWrite()){
            try{
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                String s = st.get
                dos.writeBytes(ftxt+s);
                dos.close();
                fos.close();
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

        }
        }
    }

}
