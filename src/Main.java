import Cards.Card;
import Cards.PlayerHand;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
          SettingPlayers settingPlayers = new SettingPlayers();
          settingPlayers.settingPlayers();

          Player player1 = settingPlayers.getPlayer1();
          Player player2 = settingPlayers.getPlayer2();

    }
}
