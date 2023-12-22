import Cards.Card;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Player {
    private String name;
    private Boolean active;
    private int numberOfCards;
    private ArrayList<Card> hand;

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public String getName() {
        return name;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setName() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        this.name = reader.readLine();
    }
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
