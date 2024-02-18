class person{
    String name;
    int age;
    String gender;

    person(){
        System.out.println("this is  default contructor ");
        this.name="kunal";
        this.age=23;
        this.gender="Male";
    }



}

class oop1 {
    public static void main(String[] args) {
        person p=new person();
        p.age=12;
        System.out.println(p.age);
    }
}
