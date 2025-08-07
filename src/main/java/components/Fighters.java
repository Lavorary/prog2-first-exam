package components;

import java.util.List;

public class Fighters {
    private final String fighterId;
    private final String firstName;
    private final String lastName;
    private final String nickname;
    private final String weight;
    private List<String> titles;

    public Fighters(String fighterId, String firstName, String lastName,
                    String weight, String nickname,
                    List<String> titles) {
        this.fighterId = fighterId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.weight = weight;
        this.titles = null;
    }

    @Override
    public String toString() {
        return "Fighters{" +
                "\nfighterId='" + fighterId + '\'' +
                ",\n firstName='" + firstName + '\'' +
                ",\n lastName='" + lastName + '\'' +
                ",\n nickname='" + nickname + '\'' +
                ",\n weight='" + weight + '\'' +
                ",\n titles=" + titles +
                "\n}";
    }

    public String getFighterId() {
        return fighterId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getNickname() {
        return nickname;
    }
    public String getWeight() {
        return weight;
    }
    public List<String> getTitles() {
        return titles;
    }
    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public void palmares(){

    }
/*
    public static void main(String[] args) {
        Fighters lavs = new Fighters(1, "ANDRIANTSOA", "Lavorary David", "62.5kg", "Lavs", null);
    }*/
}
