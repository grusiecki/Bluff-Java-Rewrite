import Cards.PlayerHand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SettingPlayers {
    Player player1 = new Player();
    Player player2 = new Player();
    Player player3 = new Player();
    Player player4 = new Player();
    int numberOfPlayers = 0;

    public void settingPlayers() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String response = "n";
        boolean responseValidator = false;
        System.out.println("Write player1 name: ");
        setsName(player1);
        System.out.println("Write player2 name: ");
        setsName(player2);
        numberOfPlayers = 2;

        while(!responseValidator) {
            System.out.println("Do you want to add more players (maximum 4) y/n ?");
            response = reader.readLine();
            responseValidator = responseValidator(response);
        }
        if (response.equals("y")){
            System.out.println("Write player3 name: ");
            setsName(player3);
            numberOfPlayers = 3;
            responseValidator = false;
            while(!responseValidator) {
                System.out.println("One more? y/n");
                response = reader.readLine();
                responseValidator = responseValidator(response);
            }
            if (response.equals("y")){
                System.out.println("Write player4 name: ");
                setsName(player4);
                numberOfPlayers = 4;
            }
        }
        System.out.println("Zaczynamy!");
    }
    Boolean responseValidator (String response){
        boolean responseValidator;
        if( response.equals("y") || response.equals("n")){
            responseValidator = true;
        }else{
            responseValidator = false;
            System.out.println("You need to answer 'y' or 'n'");
        }
        return responseValidator;
    }
    void setsName(Player player) throws IOException {
        player.setName();
        player.setActive(true);
        player.setNumberOfCards(1);
    }
    void setHand(Player player){
        PlayerHand hand = new PlayerHand();
        player.setHand(hand.hand(player.getNumberOfCards()));
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Player getPlayer3() {
        return player3;
    }

    public Player getPlayer4() {
        return player4;
    }
}
