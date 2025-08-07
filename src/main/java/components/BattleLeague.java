package components;

import java.util.ArrayList;
import java.util.List;

public class BattleLeague{
    private String leagueName;
    private List<String> Fighters;
    private List<String>  Matchs;

    public BattleLeague(String leagueName, List<String> fighters, List<String> matchs) {
        this.leagueName = leagueName;
        Fighters = fighters;
        Matchs = matchs;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public List<String> getFighters() {
        return Fighters;
    }

    public List<String> getMatchs() {
        return Matchs;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public void setFighters(List<String> fighters) {
        Fighters = fighters;
    }

    public void setMatchs(List<String> matchs) {
        Matchs = matchs;
    }

    public void SetMatch(Fighters fighter1, Fighters fighter2) {
        if(fighter1 == fighter2 ){
            System.out.println("Impossible, they are the same.");;
        }
        else{
            System.out.println(
                    "Yes"
            );
        }
    }

    @Override
    public String toString() {
        return "BattleLeague{" +
                "leagueName='" + leagueName + '\'' +
                ", Fighters=" + Fighters +
                ", Matchs=" + Matchs +
                '}';
    }



}
