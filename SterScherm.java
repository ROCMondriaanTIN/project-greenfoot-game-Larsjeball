import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SterScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SterScherm extends World
{

    /**
     * Constructor for objects of class SterScherm.
     * 
     */
    public SterScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cross cross = new Cross();
        addObject(cross,1160,32);
    }
}
