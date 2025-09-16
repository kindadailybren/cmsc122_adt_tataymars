class CRDeck {
  CRDeck(String[] Cards) {
    for (String cardName : Cards) {
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
      System.out.println(currCard.cardName);
      currCard = currCard.nextCard;
    }
  }
}
