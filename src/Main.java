import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Professional pro1 = new Professional();
        pro1.setId(1);
        pro1.setName("John");
        pro1.setProfessional(true);

        Professional pro2 = new Professional();
        pro2.setId(2);
        pro2.setName("Sam");
        pro2.setProfessional(true);

        Professional pro3 = new Professional();
        pro3.setId(3);
        pro3.setName("klaas");
        pro3.setProfessional(true);

        Professional pro4 = new Professional();
        pro4.setId(4);
        pro4.setName("Anne");
        pro4.setProfessional(true);

        Professional pro5 = new Professional();
        pro5.setId(5);
        pro5.setName("Nicole");
        pro5.setProfessional(true);

        Professional pro6 = new Professional();
        pro6.setId(6);
        pro6.setName("Elise");
        pro6.setProfessional(true);

        Professional pro7 = new Professional();
        pro7.setId(7);
        pro7.setName("Karin");
        pro7.setProfessional(true);

        Professional pro8 = new Professional();
        pro8.setId(8);
        pro8.setName("Famke");
        pro8.setProfessional(true);

        Amateur am1 = new Amateur();
        am1.setId(9);
        am1.setName("Bo");
        am1.setProfessional(false);

        Amateur am2 = new Amateur();
        am2.setId(10);
        am2.setName("Tony");
        am2.setProfessional(false);

        Amateur am3 = new Amateur();
        am3.setId(11);
        am3.setName("Rob");
        am3.setProfessional(false);

        Amateur am4 = new Amateur();
        am4.setId(12);
        am4.setName("Pieter");
        am4.setProfessional(false);

        Amateur am5 = new Amateur();
        am5.setId(13);
        am5.setName("Jan");
        am5.setProfessional(false);

        Amateur am6 = new Amateur();
        am6.setId(14);
        am6.setName("Rene");
        am6.setProfessional(false);

        Amateur am7 = new Amateur();
        am7.setId(15);
        am7.setName("Ronald");
        am7.setProfessional(false);

        Amateur am8 = new Amateur();
        am8.setId(16);
        am8.setName("Maaike");
        am8.setProfessional(false);

        List<Player> allPlayers = new ArrayList<>();

        allPlayers.add(pro1);
        allPlayers.add(pro2);
        allPlayers.add(pro3);
        allPlayers.add(pro4);
        allPlayers.add(pro5);
        allPlayers.add(pro6);
        allPlayers.add(pro7);
        allPlayers.add(pro8);
        allPlayers.add(am1);
        allPlayers.add(am2);
        allPlayers.add(am3);
        allPlayers.add(am4);
        allPlayers.add(am5);
        allPlayers.add(am6);
        allPlayers.add(am7);
        allPlayers.add(am8);

        System.out.println("Chess championship players are :");
        for (Player x : allPlayers) {
            System.out.print(x.getId() + "_" + x.getName() + " ");
        }
        System.out.println("");

        System.out.println(" ------ Round 1 ------ ");
        MatchLogic.win(am1, pro1, allPlayers);
        MatchLogic.win(am8, am2, allPlayers);
        MatchLogic.win(pro6, am4, allPlayers);
        MatchLogic.win(am6, pro5, allPlayers);
        MatchLogic.win(pro7, pro8, allPlayers);
        MatchLogic.win(am3, am7, allPlayers);
        MatchLogic.win(pro2, pro4, allPlayers);
        MatchLogic.win(am5, pro3, allPlayers);
        int i = 1;
        System.out.println("The players for Round 2 are : ");
        for (Player x : allPlayers) {

            System.out.print(i + "_" + x.getName() + " ");
            i++;
        }
        System.out.println(" ");
        System.out.println(" ------ Round 2 ------ ");

        for (int j = 0, x = 1; j <= 3; j++, x++) {
            MatchLogic.win(allPlayers.get(j), allPlayers.get(x), allPlayers);
        }
        System.out.println("The players for Round 3 are : ");
        int q = 1;
        for (Player x : allPlayers) {
            System.out.print(q + "_" + x.getName() + " ");
            q++;
        }
        System.out.println(" ");
        System.out.println(" ------ Round 3 Simi Final------ ");
        for (int z = 0, m = 1; z <= 1; z++, m++) {
            MatchLogic.win(allPlayers.get(z), allPlayers.get(m), allPlayers);
        }
        System.out.println("The players for the final are : ");
        int l = 1;
        for (Player x : allPlayers) {
            System.out.print(l + "_" + x.getName() + " ");
            l++;
        }
        System.out.println("");
        System.out.println(" -*-*-*-*-*- The Final -*-*-*-*-*- ");
        MatchLogic.win(allPlayers.get(0),allPlayers.get(1),allPlayers);



    }
}
