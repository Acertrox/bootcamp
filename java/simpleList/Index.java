package simpleList;

public class Index {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
        System.out.println(sll.find(4)+", en el indice: "+sll.findindex(4));
        sll.removeAt(0);
        sll.printValues();
    }
}
