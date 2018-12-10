import java.util.ArrayList;
import java.util.List;

public class MatchLogic {
    /**
     * Method to generate a random winner for each match
     * and take consider if the players are amateurs or professionals.
     * p1 is player one , p2 is player2.
     * If two players are professionals, it will be professional match
     * If two players are amateurs, it will be amateur match
     * If Not, it will be mix match
     *
     *
     * @param p1
     * @param p2
     * @param allPlayers
     */

    public static void win(Player p1, Player p2, List <Player> allPlayers) {

        if (p1.isProfessional() && p2.isProfessional()) {
            System.out.println("Professional match : " + p1.getName()+ " VS "+ p2.getName());

            int scoreProfessional1 = 1 + (int) (Math.random() * ((75 - 1) + 1));

            int scoreProfessional2 = 1 + (int) (Math.random() * ((75 - 1) + 1));

            do {
                scoreProfessional2 = 1 + (int) (Math.random() * ((75 - 1) + 1));
            } while (scoreProfessional1 == scoreProfessional2);
            if (scoreProfessional1 > scoreProfessional2) {
                System.out.println("The winner is " + p1.getName());
                allPlayers.remove(p2);
            } else {
                System.out.println("The winner is " + p2.getName());
                allPlayers.remove(p1);

            }
        } else if (!p1.isProfessional() && !p2.isProfessional()) {
            System.out.println("Amateur match : " + p1.getName()+ " VS "+ p2.getName());

            int scoreAmateur1 = 1 + (int) (Math.random() * ((25 - 1) + 1));

            int scoreAmateur2 = 1 + (int) (Math.random() * ((25 - 1) + 1));

            do {
                scoreAmateur2 = 1 + (int) (Math.random() * ((25 - 1) + 1));
            } while (scoreAmateur1 == scoreAmateur2);
            if (scoreAmateur1 > scoreAmateur2) {
                System.out.println( "The winner is " + p1.getName());
                allPlayers.remove(p2);
            } else {
                System.out.println("The winner is " + p2.getName());
                allPlayers.remove(p1);

            }

        } else {
            System.out.println("Mix match : " + p1.getName()+ " VS "+ p2.getName());

            int scoreAmateur = 1 + (int) (Math.random() * ((25 - 1) + 1));

            int scoreProfessional = 1 + (int) (Math.random() * ((75 - 1) + 1));

            do {
                scoreProfessional = 1 + (int) (Math.random() * ((75 - 1) + 1));
            } while (scoreAmateur == scoreProfessional);
            if (scoreProfessional > scoreAmateur) {
                if (p1.isProfessional()) {
                    System.out.println("The winner is " + p1.getName());
                    allPlayers.remove(p2);
                } else {
                    System.out.println("The winner is " + p2.getName());
                    allPlayers.remove(p1);
                }
            } else {
                if (!p1.isProfessional()) {
                    System.out.println("The winner is " + p1.getName());
                    allPlayers.remove(p2);
                } else {
                    System.out.println("The winner is " + p2.getName());
                    allPlayers.remove(p1);
                }

            }

        }


    }

}
