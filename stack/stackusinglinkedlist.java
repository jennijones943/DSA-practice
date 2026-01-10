class stack{
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node top,newnode;
    void push(int data){
        node newnode=new node(data);
        newnode.next=top;
        top=newnode;
        System.out.println(top.data+"  pushed");
    }
    void pop(){
        if(top==null){
            System.out.println("cant pop");
            return;
        }
        System.out.println(top.data+"  popped");
        top=top.next;
    }
    void peek(){
        if(top==null){
            System.out.println("empty list");
        }
        System.out.println(top.data+" is the peek element ");
    }
    void print(){
        System.out.println("your stack contains:");
        if(top==null){
            System.out.println("empty list");
        }
        node temp=top;
        while(temp!=null){
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
    }
}
class stackk{
    public static void main(String args[]){
        stack no=new stack();
        no.push(1);
        no.push(2);
        no.push(3);
        no.print();
        no.pop();
        no.peek();
        no.print();
        no.pop();
        no.pop();
        no.print();
    }
}
