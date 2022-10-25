import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joel = new FootballPlayer("Joel");
        FootballPlayer mik = new FootballPlayer("Mik");
        FootballPlayer liam = new FootballPlayer("Liam");
        BaseballPlayer cat = new BaseballPlayer("Cat");
        SoccerPlayer xavi = new SoccerPlayer("Xavi");

        Team<FootballPlayer> footballTeam1 = new Team<>("Adelaide Crows");
        footballTeam1.addPlayer(joel);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(cat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Barcelona");
        soccerTeam.addPlayer(xavi);

        Team<FootballPlayer> footballTeam2 = new Team<>("Melbourne");
        footballTeam2.addPlayer(mik);

        Team<FootballPlayer> footballTeam3 = new Team<>("Hawthorn");
        footballTeam3.addPlayer(liam);

        footballTeam1.matchResult(footballTeam2, 1,0);
        footballTeam1.matchResult(footballTeam3, 3, 8);
        footballTeam2.matchResult(footballTeam3, 1, 3);

        System.out.println("Rankings");
        System.out.println(footballTeam1.getName() + ": " + footballTeam1.ranking());
        System.out.println(footballTeam2.getName() + ": " + footballTeam2.ranking());
        System.out.println(footballTeam3.getName() + ": " + footballTeam3.ranking());

        System.out.println(footballTeam1.compareTo(footballTeam2));
        System.out.println(footballTeam2.compareTo(footballTeam3));

        League<Team<FootballPlayer>> footballLeauge = new League<>("AFL");
        footballLeauge.add(footballTeam1);
        footballLeauge.add(footballTeam2);
        footballLeauge.add(footballTeam3);

        footballLeauge.showLeagueTable();
    }
}