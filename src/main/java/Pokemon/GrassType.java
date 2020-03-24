package Pokemon;

import Moves.Moves;
import Moves.DefensiveMoves;

public class GrassType extends Pokemon {

    public GrassType(String name, int HP){
        super(name, HP);
    }

    public String fight(Pokemon pokemon){
        Moves move = returnRandomMove();
        int pokemonHP = pokemon.getHP();
        int movePower = move.getCP();
        int newHP = pokemonHP -= movePower;
        String string = getName() + ", the grass type fought " + pokemon.getName() + " with " + move.getName();

        String result;

        if (move.isDefense(move)) {
            DefensiveMoves defensiveMove = (DefensiveMoves) move;
            result = string + ". " + getName() + "'s defense rose by " + defensiveMove.getDefense();
        } else {
            result = string + " and now " + pokemon.getName() + "'s new HP is " + newHP;
        }
        return result;
    }
}
