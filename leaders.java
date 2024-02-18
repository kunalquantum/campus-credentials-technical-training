import java.util.Arrays;
import java.util.Scanner;

class leader {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {16,17,4,3,5,2};
        int size=arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        int maxR = arr[size - 1];

        for (int i = size - 2; i >= 0; i--) {
            if (maxR < arr[i]) {
                maxR = arr[i];
                System.out.print(maxR + " ");
            }

        }


        System.out.print(maxR + " ");

    }
}
