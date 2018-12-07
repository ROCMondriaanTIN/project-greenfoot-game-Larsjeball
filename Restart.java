import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Mover
{
private boolean onThis = false;
    public void act() 
    {
        if (Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if (onThis)
            setImage("RestartAM1.png"); 
        else
            setImage("Restart.png"); 
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new level1());
    }    
}
}

