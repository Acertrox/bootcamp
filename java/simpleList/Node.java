package simplelist;

public class Node {
    public int value;
    public Node next;
    public Node(){
        this(0);
    }
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
