import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart3 extends Mover
{
    private boolean onThis = false;
    public void act() {
   if (Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if (onThis)
            setImage("RestartAM3.png"); 
        else
            setImage("Restart3.png"); 
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new level3());
    }    
}
}
