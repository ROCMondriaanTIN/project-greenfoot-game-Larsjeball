import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Backround2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backround2 extends World
{

    public void act()
        {
        
        if(Greenfoot.isKeyDown("Enter"))
        Greenfoot.setWorld(new LevelSelector());
    }
    public Backround2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
    }
}
