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
  int DECK_SIZE = 8;

  class Card { // Node Structure with Constructor
    String cardName;
    Card nextCard;

    Card(String cardName) { // Constructor
      this.cardName = cardName;
      this.nextCard = null;
    }
  }

  void useCard(int index) {
    Card currentCard = headCard;
    Card usedCard;
    for (int i = 0; i < DECK_SIZE; i++) {
      if (index == 0) {
        currentCard.nextCard.nextCard.nextCard.nextCard.nextCard.nextCard.nextCard = currentCard;
        return;
      } else if (i == index - 1) {
        usedCard = currentCard.nextCard;
        currentCard.nextCard = currentCard.nextCard.nextCard;
      }
      if (i == DECK_SIZE - 2) {
        currentCard.nextCard = usedCard;
      }
      currentCard = currentCard.nextCard;
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
