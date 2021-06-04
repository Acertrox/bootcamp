package simplelist;

/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {

    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
        if (head != null) {
            if (head.next == null) {
                head = null;
            }
            else{
                Node runner = head;
                while (runner.next.next != null) {
                    runner = runner.next;
                }
                runner.next = null;
            }
            
        }
    }
    public void printValues(){
        System.out.print("[");
        if (head != null) {
            System.out.print(head.value);
            Node runner = head;
            while (runner.next!=null) {
                runner = runner.next;
                System.out.print(", "+runner.value);
            }
        }
        System.out.println("]");
    }
    public Node find(int value){
        if (head != null){
            Node runner = head;
            while (runner.value != value && runner.next != null) {
                runner = runner.next;
            }
            if (runner.value == value) {
                return runner;
            }
        }
        return null;
    }
    public int findindex(int value){
        int index = -1;
        if (head != null){
            index = 0;
            Node runner = head;
            while (runner.value != value && runner.next != null) {
                runner = runner.next;
                index += 1;
            }
            if (runner.value == value) {
                return index;
            }
        }
        return -1;
    }

    public void removeAt(int index){
        if (head != null) {
            if (index == 0) {
                head = head.next;
            }
            else{
                Node runner = head;
                for (int i = 1; i < index; i++) {
                    if (runner.next.next!=null) {
                        runner = runner.next;
                    }
                    else{
                        return;
                    }
                }
                runner.next = runner.next.next;

            }
            
            
            
        }
    }
}