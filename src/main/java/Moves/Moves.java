package Moves;

public abstract class Moves {

    private String name;
    private int CP;

    public Moves(String name, int CP){
        this.name = name;
        this.CP = CP;
    }

    public String getName() {
        return name;
    }

    public int getCP() {
        return CP;
    }

    public Boolean isDefense(Moves move){
        Boolean result = false;
        if (move instanceof DefensiveMoves){
            result = true;
        }
        return result;
    }
}
