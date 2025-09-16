import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CRDeck {
  CRDeck(String[] Cards) {
    List<String> cardsList = Arrays.asList(Cards);
    Collections.shuffle(cardsList);

    for (String cardName : cardsList) {
      Card newCard = new Card(cardName);
      if (headCard == null) {
        headCard = newCard;
      } else {
        Card curr = headCard;
        while (curr.nextCard != null) { // walk to last node
          curr = curr.nextCard;
        }
        curr.nextCard = newCard; // link at the end
      }
    }
  }

  Card headCard; // Declare Head Node

  class Card { // Node Structure with Constructor
    String cardName;
    Card nextCard;

    Card(String cardName) { // Constructor
      this.cardName = cardName;
      this.nextCard = null;
    }
  }

  void printCards() {
    Card currCard = headCard;
    for (; currCard != null;) {
      System.out.print(currCard.cardName);
      currCard = currCard.nextCard;
    }
  }
}
