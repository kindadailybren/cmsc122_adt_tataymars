import java.util.Scanner;

public class StackImpl {
  public static void main(String[] args) {
    Stack stack;
    Scanner scanner = new Scanner(System.in);
    int choice, element;

    System.out.println("===[ Stack ]===\n");
    System.out.print("Enter max size for stack: ");
    choice = scanner.nextInt();
    stack = new Stack(choice);
    clearScreen();
    choice = 0;

    while (choice != 4) {
      System.out.println("===[ Stack ]===\n");
      System.out.println("1: Push");
      System.out.println("2: Pop");
      System.out.println("3: Peek");
      System.out.println("4: Quit");
      System.out.print(">> ");
      choice = scanner.nextInt();
      clearScreen();
      System.out.println("===[ Stack ]===\n");

      switch (choice) {
        case 1:
          System.out.print("Push value: ");
          element = scanner.nextInt();
          clearScreen();
          System.out.println("===[ Stack ]===\n");
          stack.push(element);
          break;
        case 2:
          stack.pop();
          break;
        case 3:
          stack.peek();
          break;
        case 4:
          break;
        default:
          System.out.println("Invalid choice!");
          break;
      }
      System.out.println("Press enter to continue...");
      scanner.nextLine();
      scanner.nextLine();
      clearScreen();
    }
    scanner.close();
  }

  static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
