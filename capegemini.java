import java.util.Scanner;

class capegeminnni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no_Sem;
        System.out.println("Enter the number of semesters:");
        no_Sem = sc.nextInt();

        int[] no_subs = new int[no_Sem];

        for (int j = 0; j < no_Sem; j++) {
            System.out.println("Enter the number of subjects in semester " + (j + 1) + ":");
            no_subs[j] = sc.nextInt();
        }
//no of parameter is equal to no of axis
        int[][] marks = new int[no_Sem][];// since the no of the dependencies are 2 subject and semes

        for (int k = 0; k < no_Sem; k++) {
            marks[k] = new int[no_subs[k]];
            System.out.println("Enter the marks in semester " + (k + 1) + ":");
            for (int j = 0; j < no_subs[k]; j++) {
                marks[k][j] = sc.nextInt();
            }
        }

        for (int k = 0; k < no_Sem; k++) {
            int max = marks[k][0];  // Initialize max with the first element in the array
            for (int j = 1; j < no_subs[k]; j++) {
                if (marks[k][j] > max) {
                    max = marks[k][j];
                }
            }
            System.out.println("The maximum marks in semester " + (k + 1) + " is: " + max);
        }
    }
}
