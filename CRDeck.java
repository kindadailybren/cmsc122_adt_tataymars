import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CRDeck {
  int DECK_SIZE = 8;
  Card headCard; // Declare Head Node

  CRDeck(String[] Cards) {
    List<String> cardsList = Arrays.asList(Cards);
    Collections.shuffle(cardsList);

    for (String cardName : cardsList) {
      Card newCard = new Card(cardName);
      if (headCard == null) {
        headCard = newCard;
      } else {
        newCard.nextCard = headCard;
        headCard = newCard;
      }
    }
  }

  class Card { // Node Structure with Constructor
    String cardName;
    Card nextCard;

    Card(String cardName) { // Constructor
      this.cardName = cardName;
      this.nextCard = null;
    }
  }

  void useCard(int choice) {
    Card currentCard = headCard;
    Card usedCard = null;
    for (int i = 0; i < DECK_SIZE - 1; i++) { // Goes through the list
      if (choice == 0 && i == 0) { // If choice is first card, and iteration is at first card as well
        usedCard = currentCard;
        headCard = headCard.nextCard;
      } else if (i == choice - 1) { // If you are at the previous card of the choice you made
        usedCard = currentCard.nextCard; // Set the usedCard as the next
        currentCard.nextCard = currentCard.nextCard.nextCard; // connects it to the next next, essentially removing the
                                                              // used card from the hand
        continue;
      }
      currentCard = currentCard.nextCard;
    }
    currentCard.nextCard = usedCard; // Now at the end node, push the new card there
    usedCard.nextCard = null;
  }

  void printCards() {
    Card currCard = headCard;
    // For Current hand
    System.out.println("===[ On Hand ]===\n");
    for (int i = 0; i < 4; i++) {
      System.out.println(i + 1 + ": " + currCard.cardName);
      currCard = currCard.nextCard;
    }
    // For next in queue
    System.out.println("\n===[ Next Card ]===\n");
    System.out.println(currCard.cardName);
    System.out.println();
  }
}
