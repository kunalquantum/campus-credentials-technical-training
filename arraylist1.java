import java.util.ArrayList;
import java.util.Iterator;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> ab=new ArrayList<>();
        ab.add(1);
        ab.add(12);
        ab.add(56);
        Iterator<Integer> itr=ab.iterator();


        while(itr.hasNext()){

            System.out.println(itr.next());
        }

        ab.clear();


    }
}
