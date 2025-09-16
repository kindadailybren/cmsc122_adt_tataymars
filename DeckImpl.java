import java.util.Scanner;

public class DeckImpl {
  public static void main(String[] args) {
    String[] Cards = { "W", "F", "G", "S", "L", "C", "I", "B" };
    CRDeck deck = new CRDeck(Cards);
    Scanner scanner = new Scanner(System.in);

    System.out.println("===DeckImpl===");
    System.out.println("1: Use");

    int action, data, index;
    deck.printCards();
    while (true) {
      System.out.print("Action Number:");
      action = scanner.nextInt();
      switch (action) {
        case 1:
          System.out.print("What Card:");
          index = scanner.nextInt();
          deck.useCard(index);
          break;

        default:
          System.out.println("Command not found");
          break;
      }
      deck.printCards();
    }
  }
}
