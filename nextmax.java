import java.util.Scanner;

public class nextmax {
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};

        for(int i=0;i<a.length;i++){
            int j;
            for(j=i+1;j<a.length;j++){
                if(a[i]<=a[j]){
                    break;
                }
                if(j==a.length){
                    System.out.println(a[i]+" ");
                }

            }



        }



    }
}

