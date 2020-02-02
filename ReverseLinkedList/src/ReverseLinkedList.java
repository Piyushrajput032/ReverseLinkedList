import org.w3c.dom.Node;

import java.io.Console;
//Linked List Program
public class ReverseLinkedList {
   private Node head;// head of list

    //linked list node
    private class Node{
        private   int data;
        private Node next;
        private Node(int d){
            data=d;
            next=null;
        }
    }
    private Node reverse(Node head,int k){
        Node current=head;
        Node next=null;
        Node prev=null;

        int count=0;

        //Reverse first k node of the linked list

        while(count<k&&current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        if(next!=null){
            head.next=reverse(next,k);

        }
        return prev;
    }

    private  void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    private void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }



    public static void main(String[] args){

        ReverseLinkedList ob=new ReverseLinkedList();
           /* Constructed Linked List is 1->2->3->4->5->6->
        7->8->8->9->null */
           ob.push(9);
           ob.push(8);
           ob.push(7);
           ob.push(6);
           ob.push(5);
           ob.push(4);
           ob.push(3);
           ob.push(2);
           ob.push(1);
           System.out.println("Given linked list");
           ob.printlist();
           ob.head=ob.reverse(ob.head,3);
           System.out.println("reveredl list");
           ob.printlist();
    }

}
