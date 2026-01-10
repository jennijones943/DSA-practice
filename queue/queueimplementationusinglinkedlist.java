class queue{
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node front,rear;
    void enqueue(int data){
        node newnode=new node(data);
        if(rear==null && front==null){
            rear=newnode;
            front=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }
    void dequeue(){
        if(front==null){
            System.out.println("underflow!");
            return;
        }
        if(rear==front){
            rear=null;
            front=null;
            return;
        }
            front=front.next;
    }
    void peek(){
         if(front==null){
            System.out.println("empty queue");
            return;
        }
        System.out.println(front.data+" is the peeked element");
    }
    void print(){
        System.out.println("your data");
        node temp=front;
         if(front==null){
            System.out.println("empty queue");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }
    }
}
class java{
    public static void main(String args[]){
        queue obj=new queue();
        obj.enqueue(2);
        obj.enqueue(3);
        obj.print();
        obj.dequeue();
        obj.print();
        obj.peek();
    }
}
