package components;

import java.util.ArrayList;
import java.util.List;

public class Fighters extends Palmares {
    private final String fighterId;
    private final String firstName;
    private final String lastName;
    private final String nickname;
    private final String weight;
    private List<String> titles;

    public Fighters(int win, int loose, int draw, String fighterId, String firstName, String lastName, String nickname, String weight, List<String> titles) {
        super(win, loose, draw);
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



    @Override
    public String toString() {
        return "Fighters{" +

                super.toString()  +
                "\nfighterId='" + fighterId + '\'' +
                "\n, firstName='" + firstName + '\'' +
                "\n, lastName='" + lastName + '\'' +
                "\n, nickname='" + nickname + '\'' +
                "\n, weight='" + weight + '\'' +
                "\n, titles=" + titles +

                "\n}";
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(5);
        list1.add("test");
        list1.add("test");
        list1.add("test");
        list1.add("test");
        list1.add("test");
        Fighters Dude1 = new Fighters(10, 4, 0, "1", "JetThoo", "Holiday", "75.5kg", "Jetty", list1);

        System.out.println(Dude1);
    }
}
