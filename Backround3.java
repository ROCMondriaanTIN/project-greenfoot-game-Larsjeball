import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Backround3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backround3 extends World
{
public void act()
        {
        
        if(Greenfoot.isKeyDown("Enter"))
        Greenfoot.setWorld(new LevelSelector());
    }
    public Backround3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
    }
}
