import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victory extends World
{

    /**
     * Constructor for objects of class Victory.
     * 
     */
    public Victory()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1250, 800, 1); 
    }
    public void act() {
        if(Greenfoot.isKeyDown("i")) {
            Greenfoot.setWorld(new startscherm());
        }
    }
}
