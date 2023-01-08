import java.util.Scanner;

public class Bowler extends Batsman{
    private int over;
    private int wicket;

    public Bowler() {
        over=wicket=0;
    }

    public Bowler(int playerID, String playerName, int run, int hundred, int fifty, int over, int wicket) {
        super(playerID, playerName, run, hundred, fifty);
        this.over = over;
        this.wicket = wicket;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }
    Scanner sc=new Scanner(System.in);

    @Override
    public void read() {
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter overs: ");
        over=sc.nextInt();
        System.out.println("Enter wickets: ");
        wicket=sc.nextInt();

    }

    @Override
    public String toString() {
        return "Bowler{" +
                "over=" + over +
                ", wicket=" + wicket +
                '}';
    }
}
