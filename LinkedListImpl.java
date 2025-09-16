import java.util.Scanner;

public class LinkedListImpl {
  static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    Scanner scanner = new Scanner(System.in);

    int action, data, index;

    while (true) {
      System.out.println();
      System.out.println("===LinkedListImpl===");
      System.out.println("1: Push");
      System.out.println("2: Insert");
      System.out.println("3: Append");
      System.out.println("4: Delete");
      System.out.println("5: Print at index");
      System.out.println("6: Print Nodes");

      System.out.print("Action Number:");
      action = scanner.nextInt();
      switch (action) {
        case 1:
          System.out.print("Push Value:");
          data = scanner.nextInt();
          clearScreen();
          list.pushNode(data);
          break;

        case 2:
          System.out.print("Push Value:");
          data = scanner.nextInt();
          System.out.print("Index Value:");
          index = scanner.nextInt();
          clearScreen();
          list.insertNode(data, index);
          break;

        case 3:
          System.out.print("Push Value:");
          data = scanner.nextInt();
          clearScreen();
          list.appendNode(data);
          break;

        case 4:
          System.out.print("Index Value:");
          index = scanner.nextInt();
          clearScreen();
          list.deleteNode(index);
          break;

        case 5:
          System.out.print("Index Value:");
          index = scanner.nextInt();
          clearScreen();
          list.printNodeAtIndex(index);
          break;

        case 6:
          clearScreen();
          list.printAllNodes();
          break;

        default:
          System.out.println("Command not found");
          clearScreen();
          break;
      }
    }
  }
}
