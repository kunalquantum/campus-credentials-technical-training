class fb{
    final int data;
    fb(){
        System.out.println("blank initialized ");
        data=12;
    }
    void me(){
        System.out.println(data);
    }

}



public class blankfinalmain {
    public static void main(String[] args) {
        fb ob=new fb();
        ob.me();
    }
}
