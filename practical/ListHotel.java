package practical;

import java.util.ArrayList;

public class ListHotel {
       public ArrayList<Hotel> list = new ArrayList<>();
       Hotel h = new Hotel();
       public void newHotel(){
           h.addHotel();
           list.add(h);

       }

       public void showHotel(){
           System.out.println(list);
       }
}
