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
    for (int i = 0; i < DECK_SIZE - 1; i++) {
      if (choice == 0 && i == 0) {
        usedCard = currentCard;
        headCard = headCard.nextCard;
      } else if (i == choice - 1) {
        usedCard = currentCard.nextCard;
        currentCard.nextCard = currentCard.nextCard.nextCard;
        continue;
      }
      currentCard = currentCard.nextCard;
    }
    currentCard.nextCard = usedCard;
    usedCard.nextCard = null;
  }

  void printCards() {
    Card currCard = headCard;
    for (; currCard != null;) {
      System.out.print(currCard.cardName + ", ");
      currCard = currCard.nextCard;
    }
  }
}
