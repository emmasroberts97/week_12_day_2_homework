import Moves.AttackMoves;
import Moves.DefensiveMoves;
import Pokemon.FireType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokemonTest {

    private FireType charmander;
    private DefensiveMoves leer;
    private AttackMoves tackle;

    @Before
    public void before(){
        charmander = new FireType("Charmander", 60);
        leer = new DefensiveMoves("Leer", 10);
        tackle = new AttackMoves("Tackle", 20);
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
    public void startWithNoMoves(){
        assertEquals(0, charmander.getMoves().size());
    }

    @Test
    public void canAddMoves(){
        charmander.addMove(leer);

        assertEquals(1, charmander.getMoves().size());
    }

    @Test
    public void canGetRandomMove(){
        charmander.addMove(leer);
        charmander.addMove(tackle);

        System.out.println(charmander.returnRandomMove().getName());
    }
}
