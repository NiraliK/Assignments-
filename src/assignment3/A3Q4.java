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
import becker.robots.Wall;

/**
 *
 * @author niralikantaria
 */
public class A3Q4 {

    public static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create new city 
        City kw = new City();

        //new Robot created 
        RobotSE karel = new RobotSE(kw, 4, 1, Direction.NORTH);

        // room walls created 
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 0, 1, Direction.NORTH);
        new Wall(kw, 0, 1, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 4, Direction.NORTH);
        new Wall(kw, 0, 5, Direction.NORTH);
        new Wall(kw, 0, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.SOUTH);

        // while loop created 
        while (true) {
            // if front is clear karel will turn left 
            if (karel.frontIsClear() == true) {
                karel.turnLeft();
            }
            // if front is NOT clear karel will turn right and move
            if (!karel.frontIsClear() == true) {
                karel.turnRight();
                karel.move();
            } //if front is clear move forward.
            else if (karel.frontIsClear()) {
                karel.move();
                break;
            }
        }
    }
}
