package stream.teams;

import java.util.List;

//zawiera liste Teams
public class Teams {
    private List<Team> teamsList;

    public Teams(List<Team> teamsList) {
        this.teamsList = teamsList;
    }

    public List<Team> getTeamsList() {
        return teamsList;
    }

    public void addTeam(Team team) {
        teamsList.add(team);
    }

    public Team retriveTeamByPlayer(String playerName) {
        return teamsList.stream()
                .filter(team -> team.getPlayersList().stream()
                        .anyMatch(player -> player.getName().equals(playerName)))
                .findFirst()
                .orElse(null);
    }

    public Team retriveTeamByPlayerLoop(String playerName) {
        for (Team team : teamsList) {
            for (Player pl : team.getPlayersList() ) {
                if (pl.getName().equals(playerName)) {
                    return team;
                }
            }
        }
        return null;
    }

    public Team retriveTeamByPlayerMikaelIdea(String playerName) {
        for (Team team : teamsList) {
            boolean playerExists = team.getPlayersList().stream()
                    .anyMatch(player -> player.getName().equals(playerName));

            if (playerExists) {
                return team;
            }
        }

        return null;
    }

//    public void retriveTeamByPlayer(String inputName, List<Team> inputList) {
//        return teamsList.stream()
//                .flatMap(v -> v.getPlayersList().stream())
//                .filter(v -> v.getName().equals(inputName))
//                . // czy da sie wrocic poziom wyzej ??? gdyby w graczyu była lista gdzie gra było bu prosciej
//
//
//    }
//
//    public String teamRetrive( List<Team> teamsList, String inputName) {
//       //lista zeby nie posuć
//        List<Team> list = new ArrayList(teamsList);
//
//        for ( Team value: list ) {
//            for(String v: )
//
//
//        }
//    }

}
