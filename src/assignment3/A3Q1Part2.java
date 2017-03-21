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
public class A3Q1Part2 {

    public static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new city created 
        City kw = new City();

        // new robot created 
        Robot nini = new Robot(kw, 2, 0, Direction.EAST);

        // new things added 
        new Thing(kw, 2, 5);

        //new wall added 
        new Wall(kw, 2, 4, Direction.EAST);

        // create loop so nini stops before hitting the wall
        while (true) {
            if (nini.frontIsClear()) {
                nini.move();
            }
            // if nini cannot pickup thing and front is not clear then break
            if (nini.canPickThing() || !nini.frontIsClear()) {
                break;

            }
        }
    }
}
