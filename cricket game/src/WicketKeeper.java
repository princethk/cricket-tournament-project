import java.util.Scanner;

public class WicketKeeper extends Batsman{
    private int stump;
    private int catches;

    public WicketKeeper() {
        stump=catches=0;
    }

    public WicketKeeper(int playerID, String playerName, int run, int hundred, int fifty, int stump, int catches) {
        super(playerID, playerName, run, hundred, fifty);
        this.stump = stump;
        this.catches = catches;
    }

    public int getStump() {
        return stump;
    }

    public void setStump(int stump) {
        this.stump = stump;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    @Override
    public void read() {
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Stumps: ");
        stump=sc.nextInt();
        System.out.println("Enter catches: ");
        catches=sc.nextInt();

    }

    @Override
    public String toString() {
        return "WicketKeeper{" +
                "stump=" + stump +
                ", catches=" + catches +
                '}';
    }
}
