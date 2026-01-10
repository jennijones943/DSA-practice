class doublelist{
    public class node{
        node next,prev;
        int data;
        node(int data){
           this.data=data;
           this.next=null;
           this.prev=null;
        }
    }
    node temp,head,newnode,current,next,prev;
    void create(int data){
        node newnode=new node(data);
            head=newnode;   
    }
    void insertlast(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newnode.prev=temp;
        temp.next=newnode;
    }
    void insertbig(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void insertpos(int pos,int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        int i=0;
        temp=head;
        while(pos-1>i && temp!=null){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("invalid position");
        }
        else{
          newnode.next=temp.next;
          temp.next.prev=newnode;
          temp.next=newnode;
          newnode.prev=temp;
        }
        
    }
    void deletebig(){
        if(head==null){
            System.out.println("cant delete");
            return;
        }
        head=head.next;
    }
    void deletelast(){
        if(head==null){
            System.out.println("cant delete");
            return;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;  
        }
        temp.prev.next=null;
    }
    void deletepos(int pos){
        if(head==null){
            System.out.println("cant delete");
            return;
        }
        int i=0;
        temp=head;
        while(pos>i){
            temp=temp.next;
            i++;
        }
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
    }
    void reverse(){
        current=next=head;
        prev=null;
        do{
         next=next.next;
         current.prev=current.next;
         current.next=prev;
         prev=current;
         current=next;
        }while(current!=null);
        head=prev;
    }
    void count(){
        int i=0;
        temp=head;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
        System.out.println(i+" ");
    }
    void print(){
        System.out.println("your data");
        temp=head;
        while(temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }
    }
}
class list{
    public static void main(String args[]){
      doublelist no=new doublelist();
      no.create(1);
      no.print();
      no.insertlast(2);
      no.insertlast(3);
      no.insertlast(4);
      no.print();
      no.insertbig(0);
      no.print();
      no.insertpos(2,9);
      no.print();
      no.deletebig();
      no.print();
      no.deletelast();
      no.print();
      no.deletepos(2);
      no.print();
      no.reverse();
      no.print();
   }
}
