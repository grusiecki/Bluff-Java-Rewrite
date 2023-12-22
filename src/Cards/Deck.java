package Cards;

import Cards.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck() {
        this.deck = deckCreate();
    }


    private final String[] cardsValues = new String[]{"ace", "king", "queen", "jack", "10", "9"};
    private final String[] cardsColors = new String[]{" heart", " diamond", " spade", " club"};

   public ArrayList<Card> deckCreate(){
        int i = 0;
        for (String cardsValue : cardsValues) {
            for (String cardsColor : cardsColors) {
                Card card = new Card(cardsValue, cardsColor);
                deck.add(card);
                i = i + 1;
            }
        }
            return deck;
    }
    ArrayList<Card> shuffle(ArrayList<Card> deck){
        Collections.shuffle(deck);
        return deck;
    }

}
