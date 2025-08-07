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


    public Match(String fighterId, String firstName, String lastName,
                 String weight, String nickname,
                 List<String> titles, int BatlleId,
                 String Localisation) {
        super(fighterId, firstName, lastName, weight, nickname, titles);
        this.BatlleId = BatlleId;
        this.Localisation = Localisation;
    }


}
