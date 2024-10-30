package Day1;
//we need data and

public class LinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }


    }
    private Node head;

    public void add(int data){
        Node newNode=new Node(data);

        if (head==null){

            head=newNode;

        }
        else{
            Node current =head;
            while(current.next!=null)
            {
                current=current.next;

            }
            current.next=newNode;

        }

    }

    public void display(){

        if (head==null){
            System.out.println("list is empty");
            return;

        }
        Node current=head;

        while(current!=null){
            //System.out.print(current+"-->");
            System.out.print(current.data +"-->");
            current=current.next;

        }

        System.out.println("null");
    }


    public static void main(String[] args){

        LinkedList list=new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();
    }



}
