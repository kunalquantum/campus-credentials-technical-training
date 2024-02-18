
import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[2][2];
        int sum=0;
        int mul=1;
        int div=1;
        int diff=0;

        System.out.println("enter the elements of array ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
                mul*=arr[i][j];
                div/=arr[i][j];
                diff-=arr[i][j];


            }



        }
        System.out.println("the elements are :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();


        }
        System.out.println("the addition :"+sum);
        System.out.println("the multiplication :"+mul);
        System.out.println("the division :"+div);
        System.out.println("the substraction :"+diff);
    }
}
