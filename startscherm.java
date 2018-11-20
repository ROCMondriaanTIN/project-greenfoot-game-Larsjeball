import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startscherm extends World
{

    /**
     * Constructor for objects of class startscherm.
     * 
     */
    public startscherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);

        prepare();
    }

    public void act()
    {

        if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new level1());
    }

    public void prepare ()
    {
        /**
         * Prepare the world for the start of the program.
         * That is: create the initial objects and add them to the world.
         */

        {
        }
        /**
         * Prepare the world for the start of the program.
         * That is: create the initial objects and add them to the world.
         */

    
       
        Enter enter = new Enter();
        addObject(enter,895,392);
        enter.setLocation(642,131);
    }
}

   



