import java.awt.*;

public class calebM extends Critter{
    public calebM(){

    }

    @Override
    public Action getMove(CritterInfo info){
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }
        else if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL){
            return Action.LEFT;
        }
        else if(info.getFront() == Neighbor.SAME){
            return Action.RIGHT;
        }
        else{
            return Action.HOP;
        }
    }

    @Override
    public Color getColor(){
        return new Color((int)(Math.random() * 0x1000000)); //random color
    }

    @Override
    public String toString(){
        return "\uD83D\uDE31";
    }

}
