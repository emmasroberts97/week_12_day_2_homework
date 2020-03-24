package Pokemon;

import Moves.Moves;
import Moves.DefensiveMoves;

public class WaterType extends Pokemon{

    public WaterType(String name, int HP){
        super(name, HP);
    }

    public String fight(Pokemon pokemon){
        Moves move = returnRandomMove();
        int pokemonHP = pokemon.getHP();
        int movePower = move.getCP();
        int newHP = pokemonHP -= movePower;
        String string = getName() + ", the water type fought " + pokemon.getName() + " with " + move.getName();

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
