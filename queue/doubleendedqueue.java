class deque{
    int size;
    int[] queue;
    int front=-1;
    int rear=-1;
    deque(int size){
        this.size=size;
        queue=new int[size];
    }
    void insertfront(int data){
        if((front==0 && rear==size-1) || (front==rear+1)){
            System.out.println("overflow");
            return;
        }
       else if(front==-1){
            rear=front=0;
        }
        else if(front==0){
            front=size-1;
        }
        else{
            --front;
        }
        queue[front]=data;
    }
    void deleterear(){
        if(front==-1){
            System.out.println("underflow");
            return;
        }
        else if(front==rear){
            front=-1;
            rear=-1;
        }
        else if(rear==0){
            rear=size-1;
        }
        else{
            rear=rear-1;
        }

    }
    void deletefront(){
        if(front==-1){
            System.out.println("underflow");
            return;
        }
        else if(front==size-1){
            front=0;
        }
        else if(front==rear){
            front=rear=0;
        }
        else{
            front++;
        }
    }
    void insertrear(int data){
        if((rear==front-1) || (rear==size-1 && front==0)){
           System.out.println("overflow");
            return;
        }
        else if(front==-1){
            rear=front=0;
        }
        else if(rear==size-1){
            rear=0;
        }
        else{
            rear++;
        }
        queue[rear]=data;
    }
    void print(){
        System.out.println("your data");
        int i=front;
        do{ 
            System.out.println(queue[i]+" is at index:"+i);
            i=(i+1)%size;
        }while(i!=rear);
        System.out.println(queue[i]+" is at index:"+i);
    }
}
class java{
    public static void main(String args[]){
        deque obj=new deque(5);
        obj.insertfront(1);
        obj.insertfront(2);
        obj.insertfront(3);
        obj.insertfront(4);
        obj.print();
        obj.deleterear();
        obj.deleterear();
        obj.print();
        obj.insertrear(1);
        obj.insertfront(2);
        obj.print();
    }
}
