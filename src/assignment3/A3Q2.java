/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import apple.laf.JRSUIConstants;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author niralikantaria
 */
public class A3Q2 {

    public static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new city created 
        City kw = new City();

        // new robot created 
        RobotSE nini = new RobotSE(kw, 0, 2, Direction.WEST);

        // wall created 
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);

        //create loop so karel can move around the square 8 time and stop
        //count created
        int count = 0;
        while (count < 8) {
            nini.move();
            nini.move();
            nini.turnLeft();
            nini.move();
            count = count + 1;
        }
    }
}
