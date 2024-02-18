import java.util.Scanner;

class Employee{
    int esal;
    String eno;
    String ename,city;

    Employee(int esal){
        this.esal=esal;
    }
    public void work(){
        System.out.println("working on Ai based speech with emotions {emloyee}");
    }
    public void getsalary(){
        System.out.println("Salary :"+esal);
    }
    public void addempoyee(){

        System.out.println("the employee with then name :"+ ename+"employee number "+eno+"employee current city "+city);
        System.out.println("successfully inducted ");
    }



}
class hr extends Employee{
    hr(){
        super(20000);
    }
    public void work(){
        System.out.println("this is you HR do replay fast");
    }
    public void getsalary(){
        System.out.println("Salary :"+esal);
    }
}
















public class emphr {
    public static void main(String[] args) {
        Employee e= new Employee(2000);
        Scanner sc=new Scanner(System.in);
        String eno="0";
        String name=" ";
        String city=" ";

        System.out.println("enter employee number");
        e.eno=sc.next();



        System.out.println("enter the name of city");
        e.city=sc.next();
        System.out.println("ente the name of the employee");
        e.ename=sc.next();
        e.addempoyee();
        e.getsalary();
        hr h=new hr();
        h.work();
        h.getsalary();
    }

}
