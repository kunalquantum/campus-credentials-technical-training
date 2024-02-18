public class static7 {
    static int n=1;
    static {
        System.out.println(n);
    }

    public static void main(String[] args) {
        n++;
        System.out.println(n);
    }
}
