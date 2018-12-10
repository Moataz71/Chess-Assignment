import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MatchLogicTest {

    Professional pro1 = new Professional();
    Professional pro2 = new Professional();
    Amateur am1 = new Amateur();
    Amateur am2 = new Amateur();
    List<Player> allPlayers = new ArrayList<>();

    @Before
    public void BeforeMatchlogicTest(){
        pro1.setId(1);
        pro1.setName("John");
        pro1.setProfessional(true);
        pro2.setId(2);
        pro2.setName("Sam");
        pro2.setProfessional(true);
        am1.setId(9);
        am1.setName("Bo");
        am1.setProfessional(false);
        am2.setId(10);
        am2.setName("Tony");
        am2.setProfessional(false);
        allPlayers.add(pro1);
        allPlayers.add(pro2);
        allPlayers.add(am1);
        allPlayers.add(am2);
    }

    @Test
    public void TestMatchlogicPro(){
        int count1 = allPlayers.size()-1;
        MatchLogic.win(pro1,pro2,allPlayers);
        int count2 = allPlayers.size();

        assertEquals("Test professinoal match",count1,count2);

    }
    @Test
    public void TestMatchlogicAma(){
        int count1 = allPlayers.size()-1;
        MatchLogic.win(am1,am2,allPlayers);
        int count2 = allPlayers.size();

        assertEquals("Test Amateur match",count1,count2);

    }
    @Test
    public void TestMatchlogicMix(){
        int count1 = allPlayers.size()-1;
        MatchLogic.win(am1,pro2,allPlayers);
        int count2 = allPlayers.size();

        assertEquals("Test mix match",count1,count2);

    }
}
