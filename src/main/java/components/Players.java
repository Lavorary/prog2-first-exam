package components;

import java.util.List;

public class Players {
    private final String firstName;
    private final String lastName;
    private final String nickname;
    private final String weight;
    private List<String> titles;

    public Players(String firstName, String lastName,
                   String weight, String nickname,
                   List<String> titles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.weight = weight;
        this.titles = titles;
    }
}
