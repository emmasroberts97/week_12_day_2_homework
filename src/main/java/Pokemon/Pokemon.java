package Pokemon;

import Moves.Moves;

import java.util.ArrayList;
import java.util.Random;

public abstract class Pokemon implements IFight {

    private String name;
    private int HP;
    private ArrayList<Moves> moves;
    private Random random;

    public Pokemon(String name, int HP){
        this.name = name;
        this.HP = HP;
        this.moves = new ArrayList<Moves>();
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public ArrayList<Moves> getMoves() {
        return moves;
    }


    public void addMove(Moves move){
        moves.add(move);
    }

    public Moves returnRandomMove(){
        return this.moves.get(this.random.nextInt(this.moves.size()));
    }

}
