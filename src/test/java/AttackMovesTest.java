import Moves.AttackMoves;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackMovesTest {

    private AttackMoves tackle;

    @Before
    public void before(){
        tackle = new AttackMoves("Tackle", 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Tackle", tackle.getName());
    }

    @Test
    public void canGetCP(){
        assertEquals(20, tackle.getCP());
    }

    @Test
    public void isNotDefense(){
        assertEquals(false, tackle.isDefense(tackle));
    }
}
