import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
  private boolean onThis = false;
    public void act() 
    {
        if (Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if (onThis)
            setImage("Start2.png"); 
        else
            setImage("Start.png"); 
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new level1());
        }    
    }    
}


