package Java.LinkedList;

public class LinkedList {
    private Node head;
    public void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }else {

            Node current=head;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
        }
    }

    public void display()
    {   Node current=head;
        while (current.next!=null)
        {
            current=current.next;

            System.out.println("Show values :- "+current.data);
        }
    }
    public boolean find(int data)
    {   Node current =head;
        while (current!=null){
            if(current.next.data==data)
            {
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public int size()
    {
        Node current = head;
        int count=0;

        while (current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }

    public void deletenode(int data){

        Node current =head;

        while (current!=null && current.data!=data)
        {
            current=current.next;
        }
        if(current!=null){

            current.next=current.next.next;
        }

    }

}
