package components;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Match extends BattleLeague {
    private int BatlleId;
    private LocalDate BattleDate;
    Fighters opponent1;
    Fighters opponent2;
    private String Localisation;

    public Match(String leagueName, List<String> fighters, List<String> matchs, LocalDate now, String opponent1, String opponenent2, String somewhere, MatchType matchType) {
        super(leagueName, fighters, matchs);
    }

    private enum MatchType {
        FRIENDLY,
        OFFICIAL,
        TITLE
    }

    public Match(String leagueName, List<String> fighters, List<String> matchs, int batlleId, LocalDate battleDate, Fighters opponent1, Fighters opponent2, String localisation) {
        super(leagueName, fighters, matchs);
        BatlleId = batlleId;
        BattleDate = battleDate;
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
        Localisation = localisation;
    }

    public int getBatlleId() {
        return BatlleId;
    }

    public void setBatlleId(int batlleId) {
        BatlleId = batlleId;
    }

    public LocalDate getBattleDate() {
        return BattleDate;
    }

    public void setBattleDate(LocalDate battleDate) {
        BattleDate = battleDate;
    }

    public Fighters getOpponent1() {
        return opponent1;
    }

    public void setOpponent1(Fighters opponent1) {
        this.opponent1 = opponent1;
    }

    public Fighters getOpponent2() {
        return opponent2;
    }

    public void setOpponent2(Fighters opponent2) {
        this.opponent2 = opponent2;
    }

    public String getLocalisation() {
        return Localisation;
    }

    public void setLocalisation(String localisation) {
        Localisation = localisation;
    }




    public static void main(String[] args) {




    }
}
