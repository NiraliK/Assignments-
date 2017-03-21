/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import apple.laf.JRSUIConstants;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author niralikantaria
 */
public class A3Q3 {

    public static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new city created 
        City kw = new City();

        //new robot created 
        RobotSE nini = new RobotSE(kw, 1, 1, Direction.EAST);

        // wall/ inclosure created 
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        //new things added 
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        //create and loop so robot can move      
        while (nini.frontIsClear()) {
            nini.move();
            
            if (nini.canPickThing()) {
                nini.pickThing();
            } else if (!nini.frontIsClear() && nini.getAvenue() == 1) {
                nini.turnLeft();
                nini.move();
                nini.turnLeft();
                if (nini.canPickThing()) {
                    nini.pickThing();
                }
            }
            if (!nini.frontIsClear()) {
                nini.turnAround();
            }
         
        }

    }

}
