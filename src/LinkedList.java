public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(){
    }

    @Override
    public String toString() {
        return "" + head;
    }
    /**
     * adds new Node to the end of the list
     * @param value ship specifikacy
     */
    public void addToEnd(SpaceShip value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.setPrev(tail);
        tail.setNext(newNode);
        tail = newNode;
    }

    /**
     *
     * @param index spot in the list you are looking for
     * @return value of ship
     */
    public SpaceShip getIndex(int index) {
        if (index < 0) return null;
        if (index == 0) return head.getValue();

        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null) return null;
            current = current.getNext();
        }
        return current.getValue();
    }

    /**
     * deletes the last Node
     */
    public SpaceShip deleteLast() {
        Node deletedNode = tail;
        tail = tail.getPrev();
        tail.setNext(null);
        return deletedNode.getValue();
    }

    public int count() {
        int count = 0;
        Node currnet = head;

        if (head == null) return count;
        while (currnet.getNext() != null) {
            count++;
            currnet = currnet.getNext();
        }
        return count;
    }
}
