class linked{
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head,temp;
    node prev,current,next;
    void create(int data){
        node newnode=new node(data);
        head=newnode;
    }
    void instertlast(int data){
        node newnode=new node(data);
         if(head==null){
            head=newnode;
            return;
         }
         temp=head;
         while(temp.next!=null){
            temp=temp.next;
         }
         temp.next=newnode;
    }
    void insertbegin(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        temp=head;
        head=newnode;
        newnode.next=temp;

    }
    void insertpos(int pos,int data){
        node newnode=new node(data);
        temp=head;
        if(head==null){
            head=newnode;
            return;
        }
        int i=0;
        while(pos-1>i){
        temp=temp.next;
        i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    void deletebig(){
        temp=head;
        head=temp.next;
    }
    void deletelast(){
        temp=head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    void deletepos(int pos){
        int i=0;
        temp=head;
        prev=head;
        if(head==null){
            System.out.println("invalid position to delete");
            return;
        }
        while(pos-1>i){
          prev=temp;
          temp=temp.next;
          i++;
        }
        prev.next=temp.next;
        
    }
    void search(int data){
        temp=head;
        int i=0;
        while(temp!=null){ 
            if(temp.data==data){
                System.out.println("data found at index:" +i);
                break;
            }
            else{
            temp=temp.next;
            i++;
            }
        }
        if(temp==null){
            System.out.println("data not found: -1");
        }
    }
    void reverse(){
        System.out.println("reversed list");
        prev=null;
        current=next=head;
        while(current!=null){
           next=next.next;
           current.next=prev;
           prev=current;
           current=next;
        }
        head=prev;
    }
    void print(){
        System.out.println("your list");
    temp=head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
    }

}
class list{
    public static void main(String args[]){
        linked no=new linked ();
        no.create(2);
        no.instertlast(4);
        no.print();
        no.insertpos(1,3);
        no.print();
        no.insertbegin(1);
        no.print();
        no.deletebig();
        no.print();
        no.deletelast();
        no.print();
        no.instertlast(5);
        no.instertlast(7);
        no.print();
        no.deletepos(2);
         no.print();
         no.search(99);
         no.reverse();
         no.print();
}
}
