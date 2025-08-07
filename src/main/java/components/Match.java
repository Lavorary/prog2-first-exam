package components;

import java.time.LocalDate;
import java.util.List;

public class Match extends Players{
    private int BatlleId;
    private LocalDate BattleDate;
    private String Localisation;


    public Match(String firstName, String lastName,
                 String weight, String nickname,
                 List<String> titles, int BatlleId,
                 String Localisation) {
        super(firstName, lastName, weight, nickname, titles);
        this.BatlleId = BatlleId;
        this.Localisation = Localisation;
    }
}
