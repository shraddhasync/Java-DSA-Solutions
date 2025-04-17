package linklist;

public class linkedlist {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

        
    }
    Node head;
    Node tail;

    public void addfirst(int data){

            //step1- create node
            Node newnode =new Node(data);

            if(head == null){  //what if linkedlist is empty
                head=tail=newnode;
                return;

            } 
           
            //step2- give link from newnode to exsisitng head
            newnode.next=head;

            //step3- consider head as newnode
            head=newnode;
    }

    public void addlast(int data){

        //step1- create a newnode
        Node newnode=new Node(data);

        if(head == null){
            head=tail=newnode;
            return;
        }

        //step2- make exisitng tail points to newnode rather null
        tail.next=newnode;

        //step3- make ntail as newnode
        tail=newnode;
    }

    public void print(){

        if(head == null){
            System.out.println(" ll id empty");
        }

        Node temp=head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();

        
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();


        
    }
    
}
