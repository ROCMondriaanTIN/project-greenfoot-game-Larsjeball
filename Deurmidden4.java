import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deurmidden4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deurmidden4 extends Mover
{
    /**
     * Act - do whatever the Deurmidden4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          
        if(getOneIntersectingObject(Hero.class)!= null && getWorld().getObjects(Sleutel.class).isEmpty())
        {
        Greenfoot.setWorld(new Backround3());
    }
        applyVelocity();
    }    
}
