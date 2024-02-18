import java.util.Scanner;

public class reverse1 {
    public static void main(String[] args) {
        int ar[]=new int[5];
        int rev[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int k=0;k<ar.length;k++){
            ar[k]=sc.nextInt();
        }

        int left=ar.length;
        int right=0;
        int j=left;
        int i=right;

        for(left=j-1,right=i;left>=0;left--,right++){
            rev[left]=ar[right];

        }
        for(int k=0;k<ar.length;k++){
            System.out.println(rev[k]);
        }



    }
}
