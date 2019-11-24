package jv2_labsession4;

public class Main  {
    public static void main(String[] args) {



        SoNT s = new SoNT();
        new Thread(() -> {
            for (int i = 0; i <100 ; i++) {

                s.soNguyenToTiepTheo();
                try {

                    Thread.sleep(100);
                }catch (Exception E){

                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i <100 ; i++) {

                s.binhPhuong();
                try {
                    Thread.sleep(100);
                }catch (Exception e){

                }
            }
        }).start();
    }

}
