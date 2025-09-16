import java.util.Scanner;

public class DeckImpl {
  public static void main(String[] args) {
    String[] Cards = { "Sparky", "Goblin Giant", "Cannon", "Witch", "Baby Dragon", "Snowball", "Skeleton Army",
        "Barbarrel" };
    CRDeck deck = new CRDeck(Cards);
    Scanner scanner = new Scanner(System.in);

    System.out.print("\033[H\033[2J");
    System.out.flush();

    int index;
    while (true) {
      System.out.println("======[ DeckImpl ]======\n");
      System.out.println("Enter 0 to exit\n");
      deck.printCards();
      System.out.print("Choose Card: ");
      index = scanner.nextInt();
      if (index == 0)
        break;
      System.out.println();
      deck.useCard(index - 1);
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }
    scanner.close();
  }
}
