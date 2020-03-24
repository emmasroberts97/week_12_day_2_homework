import Moves.AttackMoves;
import Moves.DefensiveMoves;
import Pokemon.FireType;
import Pokemon.WaterType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireTypeTest {

    private FireType charmander;
    private WaterType squirtle;
    private AttackMoves tackle;
    private DefensiveMoves leer;

    @Before
    public void before(){
        charmander = new FireType("Charmander", 60);
        squirtle = new WaterType("Squirtle", 60);
        tackle = new AttackMoves("Tackle", 20);
        leer = new DefensiveMoves("Leer", 15);
    }

    @Test
    public void canGetName(){
        assertEquals("Charmander", charmander.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(60, charmander.getHP());
    }

    @Test
    public void canFight(){
        charmander.addMove(tackle);

        assertEquals("Charmander, the fire type fought Squirtle with Tackle and now Squirtle's new HP is 40", charmander.fight(squirtle));
    }

    @Test
    public void canDefend(){
        charmander.addMove(leer);

        assertEquals("Charmander, the fire type fought Squirtle with Leer. Charmander's defense rose by 15", charmander.fight(squirtle));
    }

    @Test
    public void canAddMultipleMoves(){
        charmander.addMove(leer);
        charmander.addMove(tackle);

        assertEquals(2, charmander.getMoves().size());
    }
}
