package stream.teams;

import java.util.ArrayList;
import java.util.List;

//zawiera liste graczy
public class Team {
    private final String teamName;
    private final List<Player> playersList = new ArrayList<>();

    public Team(String teamName) {          //????
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public void addPlayer(Player player) {     //po co dlaczego nie dodaje jak normalna pozadna lista !
        playersList.add(player);
    }

}
