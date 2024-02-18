import java.util.Scanner;

class queue1{
    Scanner sc=new Scanner(System.in);
    int rear;
    int front;
    int data;
    int quc[]=new int[10];
    queue1(){
        rear=-1;
        front=0;
        data=0;
    }
    public void insert(){
        if(rear<=10){
        System.out.println("enter the data ");
        data=sc.nextInt();
        System.out.println("|| the data inserted is ||"+data);

        quc[++rear]=data;
            System.out.println("|| current value of rear ||"+rear);

        }
        else{
            System.out.println("|| The Queue is already full sorry ||");

        }
    }
    public void delete(){
        if(rear==-1){
            System.out.println("the queue is empty ");


        }
        else{
            data=quc[front];
            System.out.println("|| the data is deleted ||"+data);
            for (int i=0;i<rear;i++){

                quc[i]=quc[i+1];
            }
            rear--;
        }
    }
    public void display(){
        if(front==rear){
            System.out.println("there is only single value present "+quc[front]);

        } else if (rear==-1) {
            System.out.println("The quuee is empty");

        }
        else{
            for (int i=0;i<rear;i++){
                System.out.print("->"+quc[i]+"->");
            }
        }
    }

}










public class queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queue1 q=new queue1();
        int choice=0;
        while(choice!=6){
            System.out.println();
            System.out.println("1.insert a element in the queue");
            System.out.println("2.delete element");
            System.out.println("3.display");
            System.out.println("4.exit");
//            System.out.println("5.exit");
            System.out.println("Enter the choice :");
            choice=sc.nextInt();


            switch (choice){
                case 1:
                    q.insert();
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("thank you for using this ,:)");
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("you have to choose to exit ");
                    System.out.println();
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter the valid input");
            }



        }
    }
}
