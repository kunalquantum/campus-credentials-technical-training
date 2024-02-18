import java.util.Arrays;
import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array 1");
        int n[]=new int[5];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("enter the array 2");
        int n1[]=new int[5];
        for(int i=0;i<n.length;i++){
            n1[i]=sc.nextInt();
        }
        if(Arrays.equals(n1,n)){
            System.out.println("you both entered the same array");
        }
        else{
            System.out.println("not same ");
        }
    }
}
