import java.util.Scanner;

public class QueueImp {
  public static void main(String[] args) {
    Queue queue = new Queue();
    Scanner scanner = new Scanner(System.in);

    System.out.println("===QueueImpl===");
    System.out.println("1: Enqueue");
    System.out.println("2: Dequeue");
    System.out.println("3: Peek");

    int action, data;
    while (true) {
      System.out.print("Action Number:");
      action = scanner.nextInt();
      switch (action) {
        case 1:
          System.out.print("Queue Value:");
          data = scanner.nextInt();
          queue.enqueue(data);
          break;

        case 2:
          queue.dequeue();
          break;

        case 3:
          queue.peek();
          break;

        case 0:
          scanner.close();
          return;

        default:
          System.out.println("Command not found");
          break;
      }
    }
  }
}
