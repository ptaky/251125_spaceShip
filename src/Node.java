public class Node {
    private SpaceShip value;
    private Node next;
    private Node prev;

    public Node(SpaceShip value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + value + "] >> "+ next;
    }

    public SpaceShip getValue() {
        return value;
    }

    public void setValue(SpaceShip value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
