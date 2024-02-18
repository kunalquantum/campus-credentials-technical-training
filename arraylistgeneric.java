import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraylistgeneric {
    public static void main(String[] args) {
        ArrayList<String> st=new ArrayList<>();
        System.out.println("enter the  number of busses you want to add ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            System.out.println("enter the element ");
            String s=sc.nextLine();
            st.add(s);
        }
        Iterator<String> itr=st.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
