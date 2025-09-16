import java.util.Scanner;

public class DeckImpl {
  public static void main(String[] args) {
    String[] Cards = { "Sparky", "Goblin Giant", "Cannon", "Witch", "Baby Dragon", "Snowball", "Skeleton Army",
        "Barbarrel" };
    CRDeck deck = new CRDeck(Cards);
    Scanner scanner = new Scanner(System.in);

    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.println("======DeckImpl======");
    int action, data, index;
    while (true) {
      deck.printCards();
      System.out.print("What Card:");
      index = scanner.nextInt();
      System.out.println();
      deck.useCard(index - 1);
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }
  }
}
