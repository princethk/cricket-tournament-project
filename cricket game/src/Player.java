import java.util.Scanner;

public abstract class Player {
    private int playerID;
    private String playerName;

    public Player() {
        playerID=0;
        playerName=null;
    }

    public Player(int playerID, String playerName) {
        this.playerID = playerID;
        this.playerName = playerName;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    Scanner sc = new Scanner(System.in);
    public void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        playerName=sc.next();
        System.out.println("Enter Player ID: ");
        playerID=sc.nextInt();
    }

    @Override
    public String toString() {
        return "player{" +
                "playerID=" + playerID +
                ", playerName='" + playerName + '\''+
                '}';
    }
}
