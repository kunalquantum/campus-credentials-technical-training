import java.util.Arrays;
import java.util.Scanner;

public class missingno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the 4 number ");
        boolean check=false;
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int mim=0;
        int temp=0;
        for (int k=0;k<a.length-1;k++){
            mim=a[k];
            for(int p=k+1;p<a.length;p++){
                if(a[p]<mim){
                    temp=a[p];
                    a[p]=mim;
                    mim=temp;

                }
            }
        }
        System.out.println("sorted :"+Arrays.toString(a));

//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
        int j=1;
        int i=0;
        int  miss=0;
        for( i=0,j=1;i<a.length;i++,j++){

            if(a[i]!=j){
                miss=j;
                break;
            }
        }
        System.out.println(miss);

    }
}
