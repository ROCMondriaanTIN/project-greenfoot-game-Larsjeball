import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Charactercoin2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Charactercoin2 extends Mover
{
    /**
     * Act - do whatever the Charactercoin2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (Actor Charactercoin2 : getIntersectingObjects(Hero.class)){
            if(Charactercoin2 != null) {
            getWorld().removeObject(this);
            break;
    }    
    
}
applyVelocity();
    }    
}
