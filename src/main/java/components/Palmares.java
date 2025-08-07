package components;


public class Palmares{
   int win;
   int loose;
   int draw;

    public Palmares(int win, int loose, int draw) {
        this.win = win;
        this.loose = loose;
        this.draw = draw;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLoose() {
        return loose;
    }

    public void setLoose(int loose) {
        this.loose = loose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int winnig(){
       return win++;
    }

    public int loose(){
        return loose++;
    }
    public int draw(){
        return draw++;
    }

    @Override
    public String toString() {
        return "Palmares{" +
                "win=" + win +
                ", loose=" + loose +
                ", draw=" + draw +
                '}';
    }

    public static void main(String[] args) {
        Palmares palmares = new Palmares(1,2,3);
        System.out.println(palmares);

    }
}
