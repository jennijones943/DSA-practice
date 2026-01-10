class linkedlist{
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node temp,head,newnode,prev,current,next;
    void create(int data){
        node newnode=new node(data);
        head=newnode;
        newnode.next=head;
    }
    void insertlast(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            newnode.next=head;
            return;
        }
        temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
    }
    void insertbig(int data){
        node newnode=new node(data);
        if(head==null){
            newnode.next=head;
            head=newnode;
            return;
        }
        temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
        head=newnode;
    }
    void deletebig(){
        temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head=head.next;
    }
    void deletelast(){
        temp=head;
        while(temp.next!=head){
            prev=temp;
            temp=temp.next;
        }
        prev.next=head;
    }
    void reverse(){
        current=next=head;
        prev=null;
        do{
            next=next.next;
            current.next=prev;
            prev=current;
            current=next;
        }while(current!=head);
        current.next=prev;
        head=prev;
    }
    void print(){
        System.out.println("your data");
        temp=head;
        do{
            System.out.println(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
    }
}
class list{
    public static void main(String args[]){
        linkedlist no=new linkedlist();
        no.create(1);
        no.insertlast(2);
        no.insertlast(3);
        no.print();
        no.insertbig(0);
        no.print();
        no.deletebig();
        no.deletelast();
        no.print();
        no.insertlast(3);
        no.insertlast(4);
        no.reverse();
        no.print();
    }
}
