import java.util.Scanner;

class list{

    Scanner sc=new Scanner(System.in);
    class getnode{
        int data;
        getnode next;
        public getnode(){
            next=null;
        }
    }
        getnode head;



        public void append(){
            System.out.println("enter the data ");
            int data=sc.nextInt();
            getnode newnode=new getnode();
            newnode.data=data;
            System.out.println("the data is "+data);
            if(head==null){
                head=newnode;
            }
            else{
                getnode ptr=new getnode();
                ptr=head;
                while(ptr.next!=null){
                    ptr=ptr.next;
                }
                ptr.next=newnode;
                newnode.next=null;
                System.out.println("new node is added with data :"+data);

            }
        }
        public void display(){
            if(head==null){
                System.out.println("linked list is empty");
            }
            else{
                getnode ptr=new getnode();
                ptr=head;
                while(ptr!=null){
                    System.out.print("|"+ptr.data+"||"+ptr.next+"|--->");
                    ptr=ptr.next;
                }

            }
           }
          public void add_at_begin(){
              System.out.println("enter the data ");
              int data=sc.nextInt();
              getnode newnode=new getnode();
              newnode.data=data;
              System.out.println("the data is "+data);
              if(head==null){
                  head=newnode;

              }
              else{
                  getnode ptr=head;
                  newnode.next=ptr;
                  head=newnode;

              }

          }
    public void after_node(){
        System.out.println("enter the data ");
        int data=sc.nextInt();
        System.out.println("enter the data after which you want to add ");
        int data1=sc.nextInt();
        getnode newnode=new getnode();
        newnode.data=data;
        System.out.println("the data is "+data);

        if(head==null){
            head=newnode;

        }
        else{
            getnode ptr=new getnode();

            ptr=head;

            getnode preptr=new getnode();

            while(preptr.data!=data1){
                preptr=ptr;
                ptr=ptr.next;


            }

            preptr.next=newnode;
            newnode.next=ptr;


        }


    }
    public void delete(){
        System.out.println("enter the data ");
        int key=sc.nextInt();
        if(head==null){
            System.out.println("linked list is not empty");
        }
        else{
            getnode ptr=new getnode();
            ptr=head;
            while(ptr.next!=null){
                if(key==ptr.data){
                    break;
                }
                else{
                    ptr=ptr.next;
                }
            }
            if(ptr.next==null){
                System.out.println("the key is not found......");
            }
            else{
                getnode ptr1=new getnode();
                getnode ptr2=new getnode();
                ptr1=ptr.next;
                ptr2=ptr1.next;
                System.out.println("node having the data "+ptr1.data+"is not found..");

            }
        }
    }

    public void delete_after(){
            getnode ptr =new getnode();
            ptr=head;

    }



        }








public class linklist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        list l=new list();
        int choice=0;
        while(choice!=6){
            System.out.println();
            System.out.println("1.insert");
            System.out.println("2.display");
            System.out.println("3.add at begin");
            System.out.println("4.after node");
            System.out.println("5.delete a specfic node ");
            System.out.println("6.exit");



         System.out.println("Enter the choice :");
            choice=sc.nextInt();


            switch (choice){
                case 1:
                    l.append();
                    break;
                case 2:
                    l.display();
                    break;
                case 3:
                    l.add_at_begin();

                    break;
                case 4:
                    l.after_node();
                    break;
                case 5:
                    l.delete();


                    break;
                case 6:
                    System.out.println("you have to choose to exit ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter the valid input");
            }



        }
    }
}
