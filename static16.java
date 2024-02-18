public class static16 {
    public void show(){
        System.out.println("non static");
    }
    public void show1(){
        System.out.println("non static");
    }
    {
        show();
    }

    public static void main(String[] args) {
        static16 s=new static16();
        System.out.println("main");
    }

}
