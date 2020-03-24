import Moves.DefensiveMoves;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefensiveMovesTest {

    private DefensiveMoves leer;

    @Before
    public void before(){
        leer = new DefensiveMoves("Leer", 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Leer", leer.getName());
    }

    @Test
    public void canGetDefense(){
        assertEquals(20, leer.getDefense());
    }

    @Test
    public void isDefensiveMove(){
        assertEquals(true, leer.isDefense(leer));
    }
}
