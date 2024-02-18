public class static15 {
    public void show(){
        System.out.println("non static show");
    }
    {
        show();
    }
    static{
        System.out.println("i am in non block");
    }

    public static void main(String[] args) {
        static15 s=new static15();
        System.out.println("main");
    }
}
