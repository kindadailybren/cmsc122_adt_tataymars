import java.util.Scanner;

public class LinkedListImpl {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    Scanner scanner = new Scanner(System.in);

    System.out.println("===LinkedListImpl===");
    System.out.println("1: Push");
    System.out.println("2: Insert");
    System.out.println("3: Append");
    System.out.println("4: Delete");
    System.out.println("5: Print at index");
    System.out.println("6: Print Nodes");

    int action, data, index;
    while (true) {
      System.out.print("Action Number:");
      action = scanner.nextInt();
      switch (action) {
        case 1:
          System.out.print("Push Value:");
          data = scanner.nextInt();
          list.pushNode(data);
          break;

        case 2:
          System.out.print("Push Value:");
          data = scanner.nextInt();
          System.out.print("Index Value:");
          index = scanner.nextInt();
          list.insertNode(data, index);
          break;

        case 3:
          System.out.print("Push Value:");
          data = scanner.nextInt();
          list.appendNode(data);
          break;

        case 4:
          System.out.print("Index Value:");
          index = scanner.nextInt();
          list.deleteNode(index);
          break;

        case 5:
          System.out.print("Index Value:");
          index = scanner.nextInt();
          list.printNodeAtIndex(index);
          break;

        case 6:
          list.printAllNodes();
          break;

        default:
          System.out.println("Command not found");
          break;
      }
    }
  }
}
