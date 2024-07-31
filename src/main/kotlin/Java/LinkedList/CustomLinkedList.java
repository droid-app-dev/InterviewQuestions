package Java.LinkedList;

public class CustomLinkedList<T>{

    private static class Node<T>{
        T data;
        Node<T> next;
        Node(T data)
        {
            this.data=data;
            this.next=null;
        }

    }
    private Node<T> head;
    private int size=0;
    public void print()
    {
        Node<T> current=head;

        if(current==null)
        {
            System.out.println("List is empty");
        }

        while (current!=null)
        {
            System.out.println("List of "+current.data);
            current=current.next;
        }
    }

    // 10 20 30 40 50 60
    public T remove(int  index)
    {
        if(index < 0 && index >= size)
        {
            throw new IndexOutOfBoundsException("Index out od bound");
        }

        Node<T> removenode ;

        if(index==0)
        {
            removenode=head;
            head=head.next;
        }else {

            Node<T> current =head;
            for(int i=0;i<index-1;i++)
            {
                current=current.next;
            }
            removenode=current.next;
            System.out.println("Item removed "+removenode.data);
            current.next=current.next.next;
        }
        size--;
        return  removenode.data;
    }

    public void add(T data){
        Node<T> new_Node=new Node<>(data);
        if(head==null)
        {
            head=new_Node;
        }else {
            Node<T> current = head;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=new_Node;
        }
        size++;
    }

    public void add(int index,T data)
    {
        if(index<0 && index > size)
        {
            throw  new ArrayIndexOutOfBoundsException("Index out of bound exception ");
        }
        Node<T> new_node=new Node<>(data);
        if(index==0){
            new_node.next=head;
            head=new_node;
        }else {
            Node<T> current = head;
            for(int i=1;i<index;i++)
            {
                current=current.next;
            }
            new_node.next=current.next;
            current.next=new_node;
        }
    }

    public int size() {
        return size;
    }

    // Clear the list
     public void clear() {
        head = null;
        size = 0;
    }
}
