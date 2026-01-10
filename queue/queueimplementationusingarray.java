import java.util.*;
class queue{
    int size;
    int[] queue;
    int rare=-1;
    int front=-1;
    queue(int size){
        this.size=size;
        queue=new int[size];
    }
    void enqueue(int data){
        if(rare==size-1){
            System.out.println("overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        queue[++rare]=data;
    }
    void dequeue(){
        if(front==-1 || front>rare){
            System.out.println("underflow");
            return;
        }
        front++;
    }
    void peek(){
        if(front==-1 || front>rare){
            System.out.println("empty queue");
            return;
        }
        System.out.println(queue[front]+" is the peek element");
    }
    void print(){
        System.out.println("queue contains:");
        if(front==-1 || front>rare){
            System.out.println("empty queue");
            return;
        }
        for(int i=front;i<=rare;i++){
            System.out.println(queue[i]+"");
        }
    }
}
class java{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter MaxSize:");
        int size=sc.nextInt();
        int choice;
        queue obj=new queue(size);
        do{
            System.out.println("select the choice 1.enqueue 2.dequeue 3.peek");
            int function=sc.nextInt();
            switch(function){
                case 1:
                    System.out.println("enter the data:");
                    int data=sc.nextInt();
                    obj.enqueue(data);
                    break;

                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.peek();
                    break;
                default:
                    System.out.println("invalid number");
            }
            System.out.println("wanna continue press 1 else 0");
            choice=sc.nextInt();
        }while(choice!=0);
        obj.print();
    }
}
