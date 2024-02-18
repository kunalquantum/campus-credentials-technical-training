import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int K = scanner.nextInt();
        rotateArray(arr, K);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateArray(int[] arr, int K) {
        reverseArray(arr, 0, arr.length - K - 1);
        reverseArray(arr, arr.length - K, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
