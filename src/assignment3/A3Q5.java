/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author niralikantaria
 */
public class A3Q5 {

    public static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new city created 
        City kw = new City();

        //new robot created 
        RobotSE nini = new RobotSE(kw, 2, 2, Direction.EAST);

        //add 10 things in a pile
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);

        //show thing count 
        kw.showThingCounts(true);

        //move 10 things to the next avenue 
        //count created 
        int count = 0;
        //while loop created 
        //move 10 things to next avenue 
        while (count < 10) {
            nini.pickThing();
            nini.move();
            nini.putThing();
            nini.turnAround();
            nini.move();
            nini.turnAround();
            count = count + 1;
        }
        //when 10 things done tranfering, stop 
        nini.move();
    }
}
