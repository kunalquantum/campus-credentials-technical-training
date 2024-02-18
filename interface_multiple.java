import org.w3c.dom.ls.LSOutput;

interface abc2{
    void display();
    void display2();
}

class myself{
  public void display(){
        System.out.println("inside the myself class ");
    }
     public void display2(){
        System.out.println("inside the myself class method display2");
    }
}



public class interface_multiple extends myself implements abc2 {
    public void display(){
        System.out.println("in the interface ");
    }
    public void display2(){
        System.out.println("inside the interface ");
    }

    public static void main(String[] args) {
        myself m=new myself();
        m.display();
        m.display2();
        abc2 a;
        a=new interface_multiple();
        a.display();
        a.display2();


    }


}
