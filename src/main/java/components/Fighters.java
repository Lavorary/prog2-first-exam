package components;

import java.util.ArrayList;
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
        this.titles = titles;
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

    public void Palmares(){
        int win = 0;
        int lose = 0;
        int draw = 0;
    }

    @Override
    public String toString() {
        return "Fighters{" +
                "fighterId='" + fighterId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", weight='" + weight + '\'' +
                ", titles=" + titles +
                '}';
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(5);
        list1.add("test");
        list1.add("test");
        list1.add("test");
        list1.add("test");
        list1.add("test");
        Fighters Dude1 = new Fighters("1", "JetThoo", "Holiday", "75.5kg", "Jetty", list1);

        System.out.println(Dude1);
    }
}
