package Cards;

import java.util.ArrayList;

public class PlayerHand{
    ArrayList<Card> playerHand;


    public void setPlayerHand(ArrayList<Card> playerHand) {
        this.playerHand = playerHand;
    }
    public ArrayList<Card> getPlayerHand() {
        return playerHand;
    }

        public ArrayList<Card> hand(int numberOfCards){
        ArrayList<Card> hand = new ArrayList<>();
        ArrayList<Card> shuffleDeck;
        Deck deck = new Deck();
        deck.setDeck();
        shuffleDeck = deck.getDeck();
        shuffleDeck = deck.shuffle(shuffleDeck);
        for (int i = 0; i < numberOfCards; i++){
        hand.add(shuffleDeck.get(0));
        //shuffleDeck.add(shuffleDeck.get(0));
        shuffleDeck.remove(0);
        }
        return hand;
    }


}
