package jv2_labsession3;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = () ->{
            for (int i =10; i >= 0 ; i--) {
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                    if (i==0){
                        System.out.println("chúc mừng");
                    }
                }catch (Exception e){

                }
            }
        };
        Runnable r2 = ()->{

                for(int i=9;i>=0;i--){
                    try {
                        for (int j=59;j>=0;j--){
                            try {
                                if (j<10 && i <10){ System.out.println("0"+i+":"+"0"+j);
                                }else{
                                    System.out.println("0"+i+":"+j);
                                    Thread.sleep(10);
                                }
//                               
                            }catch (Exception e){

                            }
                        }
                    }catch (Exception e){

                    }

                }
            };




//        Thread t1 = new Thread(r1);
//        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
