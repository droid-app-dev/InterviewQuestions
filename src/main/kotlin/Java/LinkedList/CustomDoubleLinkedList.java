package Java.LinkedList;

public class CustomDoubleLinkedList<T> {

    private static class Node<T> {
        Node<T> prev;
        Node<T> next;
        T data;
        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

   private int size;
    private Node<T> head;
   private Node<T> tail;
    public CustomDoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> new_node = new Node<>(data);
        if (head == null) {
            head = tail=new_node;
        } else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;

        }

        size++;
    }

    public void add(int index, T data) {
        if (index < 0 && index > size) {
            throw new ArrayIndexOutOfBoundsException("Array out of bound exception");
        }
        Node<T> new_Node = new Node<>(data);
        if (index == 0) {
            if (head == null) {
                head = tail = new_Node;
            } else {
                new_Node.next = head;
                head.prev = new_Node;
                head = new_Node;
            }
        } else if (index == size) {
            tail.next = new_Node;
            new_Node.prev = tail;
            tail = new_Node;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            new_Node.next = current.next;
            new_Node.prev = current;
            current.next.prev = new_Node;
            current.next = new_Node;
        }
        size++;
    }

    public void removeatSpecificpos(int index) {
        if (index < 0 && index > size) {
            throw new ArrayIndexOutOfBoundsException("Array out of bound exception");
        }
        Node<T> removenode;
        if (index == 0) {
            removenode = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (index == size - 1) {
            removenode = tail;
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removenode = current;
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        System.out.println("Position " + index + " data deleted " + removenode.data);
    }


    // Print the elements of the list from head to tail
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    // Print the elements of the list from tail to head
    public void printReverseList() {
        Node<T> current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

}
