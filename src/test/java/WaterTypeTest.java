import Moves.AttackMoves;
import Moves.DefensiveMoves;
import Pokemon.GrassType;
import Pokemon.WaterType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterTypeTest {

    private WaterType squirtle;
    private GrassType bulbasaur;
    private AttackMoves bite;
    private DefensiveMoves leer;


    @Before
    public void before(){
        squirtle = new WaterType("Squirtle", 60);
        bulbasaur = new GrassType("Bulbasaur", 60);
        bite = new AttackMoves("Bite", 15);
        leer = new DefensiveMoves("Leer", 15);

    }

    @Test
    public void canGetName(){
        assertEquals("Squirtle", squirtle.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(60, squirtle.getHP());
    }

    @Test
    public void canFight(){
        squirtle.addMove(bite);

        assertEquals("Squirtle, the water type fought Bulbasaur with Bite and now Bulbasaur's new HP is 45", squirtle.fight(bulbasaur));
    }

    @Test
    public void canDefend(){
        squirtle.addMove(leer);

        assertEquals("Squirtle, the water type fought Bulbasaur with Leer. Squirtle's defense rose by 15", squirtle.fight(bulbasaur));
    }

    @Test
    public void canAddMultipleMoves(){
        squirtle.addMove(leer);
        squirtle.addMove(bite);

        assertEquals(2, squirtle.getMoves().size());
    }
}
