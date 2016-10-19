package WumpusWorld;
/**
 * Wumpus World using First Order Logic
 * Ben Rhuman, Danny Kumpf, Isaac Sotelo
 */

import java.util.Scanner;

public class WumpusWorld {

    public static void main(String[] args) {
        int size = 5;
        double pitP = .05;
        double obstacleP = .05;
        double wumpusP = .05;

        
        Map m = new Map(size, pitP, obstacleP, wumpusP);
        m.print();
        
        Agent a =  new Agent(0, 0, 1, 2, m);
        
        //so far the agent moves accordingly for now just need inference rules
        //changed rightNextToSpot to see if the spots are the same
        //changed rightDirection method to different north and south
    }

}