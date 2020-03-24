import Moves.AttackMoves;
import Moves.DefensiveMoves;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovesTest {

    private AttackMoves tackle;
    private DefensiveMoves leer;

    @Before
    public void before(){
        tackle = new AttackMoves("Tackle", 20);
        leer = new DefensiveMoves("Leer", 10);
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
    public void canDistinguistMoves(){
        assertEquals(true, leer.isDefense(leer));
    }
}
