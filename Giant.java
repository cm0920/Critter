import java.awt.*;

public class Giant extends Critter{
    private int count = 1;
    public Giant(){

    }

    public Action getMove(CritterInfo info){
        count++;
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }
        else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }
        else{
            return Action.RIGHT;
        }
    }

    public Color getColor(){
        return Color.GRAY;
    }

    public String toString(){
        if(count >= 2 && count <= 6){
            return "fee";
        }
        else if(count >= 7 && count <= 12){
            return "fie";
        }
        else if(count >= 13 && count <=18){
            return "foe";
        }
        else if(count >= 19 && count <=24){
            return "fum";
        }
        else{
            count = 1;
        }
    return "fee";
    }
}
