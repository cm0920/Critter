import java.awt.*;
import java.util.Random;

import static java.awt.Color.*;

public class Lion extends Critter{
    private int count = 0;
    private Color c;

    public Lion(){

    }

    public Action getMove(CritterInfo info){
        count++;
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

    public Color getColor(){
        if(count % 3 == 0){
            c = random();
        }
        return c;
    }

    public String toString(){
        return "L";
    }

    public Color random(){
        int r = (int) (Math.random() * 3);

        if(r == 0){
            return Color.RED;
        }
        else if (r == 1){
            return Color.GREEN;
        }
        else{
            return Color.BLUE;
        }
    }

}
