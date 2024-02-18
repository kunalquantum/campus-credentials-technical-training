class person1{
    private String name;
    private int age;
    private String gender;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    public person1(){
        System.out.println("the default is called");
        this.name="nothing";
        this.age=50;
        this.gender="male";
    }
    public person1(String name,int age,String gender){
        System.out.println("parameterized constructor called");
        this.name=name;
        this.age=age;
        this.gender=gender;

    }

    public String toString(){
        return "person name {name }"+name+"person age :"+age+"person gender"+gender;
    }


}




public class oop2 {
    public static void main(String[] args) {
        person1 p=new person1();
        person1 p2=new person1("kunal",89,"male");

    }
}
