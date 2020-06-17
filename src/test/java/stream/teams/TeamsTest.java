package stream.teams;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TeamsTest {

    @Test
    void retriveTeamByPlayerTest() {
        //given
        Player player1 = new Player("Muminek");
        Player player2 = new Player("Rumcajs");
        Player player3 = new Player("Cypisek");
        Player player4 = new Player("Włóczykij");

        Team team = new Team("Muminki");
        Team team2 = new Team("Rumcajsy");
        Team team3 = new Team("Nielojalni");

        team.addPlayer(player1);
        team.addPlayer(player4);

        team2.addPlayer(player2);
        team2.addPlayer(player3);

        team3.addPlayer(player1);
        team3.addPlayer(player2);

        List<Team> teamsList = Arrays.asList(team, team2, team3);

        Teams teams = new Teams(teamsList);

        //when
        Team playersTeam = teams.retriveTeamByPlayer("Cypisek");

        //then
        assertThat(playersTeam.getTeamName()).isEqualTo("Rumcajsy");

    }

    @Test
    void retriveTeamByPlayerLoop() {
        //given
        Player player1 = new Player("Muminek");
        Player player2 = new Player("Rumcajs");
        Player player3 = new Player("Cypisek");
        Player player4 = new Player("Włóczykij");

        Team team = new Team("Muminki");
        Team team2 = new Team("Rumcajsy");
        Team team3 = new Team("Nielojalni");

        team.addPlayer(player1);
        team.addPlayer(player4);

        team2.addPlayer(player2);
        team2.addPlayer(player3);

        team3.addPlayer(player1);
        team3.addPlayer(player2);

        List<Team> teamsList = Arrays.asList(team, team2, team3);

        Teams teams = new Teams(teamsList);

        //when
        Team playersTeam = teams.retriveTeamByPlayerLoop("Cypisek");

        //then
        assertThat(playersTeam.getTeamName()).isEqualTo("Rumcajsy");
    }
}