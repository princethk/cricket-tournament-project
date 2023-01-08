import java.util.Scanner;

public class Team {
    private String teamName;
    private String ceoName;
    Player[] players;
    private int playerCounter;

    public Team() {
        players = new Player[20];
        playerCounter = 0;
    }

    public Team(String teamName, String ceoName) {
        this.teamName = teamName;
        this.ceoName = ceoName;
        players = new Player[20];
        playerCounter = 0;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    Scanner sc = new Scanner(System.in);

    public void addPlayer() {
        if (playerCounter > 20) {
            System.out.println("only 20 players allowed");
        } else {
            System.out.println("\n||Enter 1>> WicketKeeper  2>> Batsman  3>>Bowler ||\n");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                players[playerCounter] = new WicketKeeper();
                players[playerCounter].read();
            } else if (choice == 2) {
                players[playerCounter] = new Batsman();
                players[playerCounter].read();
            } else if (choice == 3) {
                players[playerCounter] = new Bowler();
                players[playerCounter].read();
            } else {
                System.out.println("invalid choice");
            }
            playerCounter++;
        }
    }

    public void display() {
        System.out.println("\nTeam name : " + teamName + " CEO: " + ceoName);
        for (int i = 0; i < playerCounter; i++) {
            System.out.println(players[i]);
        }
    }
}
