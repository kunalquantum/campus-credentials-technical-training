public class static14 {
    {
        System.out.println("I am non static block");
    }
    static{
        System.out.println(" i am in the static block");
    }

    public static void main(String[] args) {
        static14 s=new static14();
        System.out.println("I m in main");
    }
}
