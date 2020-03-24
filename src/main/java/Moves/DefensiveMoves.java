package Moves;

public class DefensiveMoves extends Moves {

    private int defense;

    public DefensiveMoves(String name, int defense){
       super(name, 0);
       this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }
}
