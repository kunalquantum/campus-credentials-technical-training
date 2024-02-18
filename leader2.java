import java.util.Arrays;
import java.util.Scanner;

public class leader2 {
    public static void findLeaders(int[] arr, int size) {
        int maxR = arr[size - 1];


        // The loop remains the same
        for (int i = size - 2; i >= 0; i--) {
            if (maxR < arr[i]) {
                maxR = arr[i];
                // Print the leader outside the loop
                System.out.print(maxR + " ");
            }

        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        findLeaders(arr, size);
    }
}
