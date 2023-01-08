
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Tournament tournament = new Tournament();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tournament name : ");
        tournament.setTournamentName(sc.next());
        System.out.println("Enter Tournament Year: ");
        tournament.setYear(sc.nextInt());

        int choice;
        do{
            System.out.println("\n|| 1>> Add team 2>>Display 3>> Exit  ||\n");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: tournament.addTeam();
                    break;
                case 2: tournament.displayTournament();
                    break;
                case 3: break;
            }
        }while(choice != 3);

    }

}
