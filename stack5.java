import java.util.Scanner;

class stack{
    Scanner sc=new Scanner(System.in);
    int data=0;
    int top=-1;
    int stack[]=new int[10];
    public void push(){


        top++;
        if(top!=10){
        System.out.println("enter the data");
        data=sc.nextInt();
        stack[top]=data;
        System.out.println(" || The pushed data : ||"+data);}else{
            System.out.println("stack is full");
        }
    }
    public void pop(){
        if(top!=-1){
        System.out.println("|| you have selected popping ");
        data=stack[top];
        System.out.println("|| popped element is :||"+data);
        top--;}
        else{
            System.out.println("stack is empty");
        }
    }
    public void display(){
        if(top!=-1){
        System.out.println(" || The stack Elements ||");
        for (int i=0;i<top;i++){
            System.out.print("||"+stack[i]+"||");
        }}
        else{
            System.out.println("the stack is empty ");
        }
    }
    public void peek(){
        if(top==-1) {
            data = stack[top];
            System.out.println("|| The current stack top element  ||" + data);
        }else{
            System.out.println("the stack is empty");}
    }
}





public class stack5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack s=new stack();
        int choice=0;
        while(choice!=6){
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.peek");
            System.out.println("5.exit");
            System.out.println("Enter the choice :");
            choice=sc.nextInt();


            switch (choice){
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    s.peek();
                    break;
                case 5:
                    System.out.println("you have to choose to exit ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter the valid input");
            }



        }
    }
}
