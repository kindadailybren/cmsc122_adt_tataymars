public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.pushNode(1);
    list.pushNode(2);
    list.pushNode(3);
    list.pushNode(4);

    System.out.println(list.countNodes());
    list.printAllNodes();

    System.out.println("");

    list.deleteNode(2);
    list.printAllNodes();

    System.out.println("");

    list.insertNode(2, 1);
    list.printAllNodes();
  }
}
