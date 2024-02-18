class student{
    String name="kunal";
    int age=23;
    public void show(){
        System.out.println("Name :"+name+"age"+age);
    }

}


public class studentmain {
    public static void main(String[] args) {
        student s=new student();
        s.show();
    }
}
