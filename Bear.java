import java.awt.*;

public class Bear extends Critter{
    private boolean p;
    private int count = 1;

    public Bear(boolean polar){
        p = polar;
    }

    public Action getMove(CritterInfo info){
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }
        else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }
        else{
            return Action.LEFT;
        }
    }

    public Color getColor(){
        if(p == true){
            return Color.WHITE;
        }
        else{
            return Color.BLACK;
        }
    }

    public String toString(){
        if(count == 1){
            count++;
            return "/";
        }
        else{
            count--;
            return "\\";
        }
    }

}
