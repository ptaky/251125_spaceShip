public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addToEnd(new SpaceShip("AA 0000", "Sun", "0000"));
        list.addToEnd(new SpaceShip("AA 0001", "Merkur", "0001"));
        list.addToEnd(new SpaceShip("AA 0002", "Venus", "0003"));
        System.out.println(list);
        System.out.println(list.getIndex(3));
        System.out.println(list.deleteLast());
        System.out.println(list);
        System.out.println(list.count());
    }
}
