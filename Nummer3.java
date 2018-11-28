import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nummer3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nummer3 extends Mover
{
    /**
     * Act - do whatever the Nummer3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
           if(Greenfoot.isKeyDown("3"))
        Greenfoot.setWorld(new level3());
    }    
}
