import org.w3c.dom.ls.LSOutput;

interface rbi{
     void interest();

}

class sbi implements  rbi{
    public void interest(){
        System.out.println("interest in sbi");
    }

}
class maharashtra implements rbi{
    public void interest(){
        System.out.println("interest in maharashtra");
    }

}





public class interface1 {
    public static void main(String[] args) {
        rbi i,i2;
        i=new sbi();
        i.interest();
        i2=new maharashtra();
        i2.interest();
    }
}
