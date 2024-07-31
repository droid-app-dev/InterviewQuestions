package Java.LinkedList;


public class LinkedListExample {

    public static void main(String args[]) {

        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(" Linked list size:- "+list.size());

        list.print();
        list.add(2,25);
        list.print();


        CustomDoubleLinkedList<Integer> customDoubleLinkedList = new CustomDoubleLinkedList<>();


        customDoubleLinkedList.add(1000);
        customDoubleLinkedList.add(2000);
        customDoubleLinkedList.add(3000);
        customDoubleLinkedList.add(4000);

        customDoubleLinkedList.printList();

        customDoubleLinkedList.removeatSpecificpos(2);

        customDoubleLinkedList.printList();

    }
}
