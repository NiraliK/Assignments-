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
public class A3Q6 {

    public static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new city created 
        City kw = new City();

        //new robot created locateed on 0,1 
        RobotSE nini = new RobotSE(kw, 0, 1, Direction.SOUTH);

        //things created for bargraphs 
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        //show count of all things 
        kw.showThingCounts(true);

        //interger counter is created 
        int counter = 0;

        //nini moves down on the first pile of things 
        nini.move();

        //While loop created 
        while (nini.canPickThing()) {
            //if nini can pick up things, then pick up all things
            if (nini.canPickThing()) {
                nini.pickAllThings();
                counter++;
            }

            //when everything is picked up turn left 
            counter = nini.countThingsInBackpack();
            nini.turnLeft();

            //move and drop a thing on each intersection 
            for (int i = 0; i < counter; i++) {
                nini.putThing();
                nini.move();
            }

            //when backpack is empty turn around 
            nini.turnAround();
            //nini move 
            for (int i = 0; i < counter;) {
                nini.move();
                counter--;
            }

            //turn left and move on to the next pile 
            nini.turnLeft();
            nini.move();
        }

    }

}
