/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author niralikantaria
 */
public class A3Q1 {

    public static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new city created 
        City kw = new City();

        // new robot created 
        Robot nini = new Robot(kw, 2, 0, Direction.EAST);

        // create a wall 
        new Wall(kw, 2, 4, Direction.WEST);

        //add things 
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);

        // add loop so nini moves 
        while (true) {
            //if front is clear move 
            if (nini.frontIsClear()) {
                nini.move();
            }

            // if nini can pick something up OR if front is clear then stop 
            if (nini.canPickThing() || !nini.frontIsClear()) {
                break;
            }
        }
    }
}
