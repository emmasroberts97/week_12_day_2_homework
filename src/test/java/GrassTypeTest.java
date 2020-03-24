import Moves.AttackMoves;
import Moves.DefensiveMoves;
import Pokemon.FireType;
import Pokemon.GrassType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassTypeTest {

    private GrassType bulbasaur;
    private FireType charmander;
    private AttackMoves quickattack;
    private DefensiveMoves leer;

    @Before
    public void before(){
        bulbasaur = new GrassType("Bulbasaur", 60);
        charmander = new FireType("Charmander", 60);
        quickattack = new AttackMoves("Quick Attack", 25);
        leer = new DefensiveMoves("Leer", 15);
    }

    @Test
    public void canGetName(){
        assertEquals("Bulbasaur", bulbasaur.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(60, bulbasaur.getHP());
    }

    @Test
    public void canFight(){
        bulbasaur.addMove(quickattack);

        assertEquals("Bulbasaur, the grass type fought Charmander with Quick Attack and now Charmander's new HP is 35", bulbasaur.fight(charmander));
    }

    @Test
    public void canDefend(){
        bulbasaur.addMove(leer);

        assertEquals("Bulbasaur, the grass type fought Charmander with Leer. Bulbasaur's defense rose by 15", bulbasaur.fight(charmander));
    }

    @Test
    public void canAddMultipleMoves(){
        bulbasaur.addMove(leer);
        bulbasaur.addMove(quickattack);

        assertEquals(2, bulbasaur.getMoves().size());
    }
}
