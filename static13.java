public class static13 {
    {
        System.out.println("i am in static block");
    }
    static {
        System.out.println("i M in static block");
    }

    public static void main(String[] args) {
        System.out.println("i am in main");
        static13 s=new static13();

    }

}
