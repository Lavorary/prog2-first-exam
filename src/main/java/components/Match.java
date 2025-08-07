package components;

import java.time.LocalDate;
import java.util.List;

public class Match extends Fighters {
    private int BatlleId;
    private LocalDate BattleDate;
    private String Localisation;
    private enum MatchType{
        FRIENDLY,
        OFFICIAL,
        TITLE
    }


    public Match(String fighterId, String firstName, String lastName, String weight, String nickname, List<String> titles, int batlleId, LocalDate battleDate, String localisation) {
        super(fighterId, firstName, lastName, weight, nickname, titles);
        BatlleId = batlleId;
        BattleDate = battleDate;
        Localisation = localisation;
    }

    @Override
    public void Palmares() {
        super.Palmares();


    }
}
