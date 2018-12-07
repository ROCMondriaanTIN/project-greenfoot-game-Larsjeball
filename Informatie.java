import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Informatie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Informatie extends Actor
{
    /**
     * Act - do whatever the Informatie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       private boolean onThis= false;
    public void act() 
    {
       if (Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if (onThis)
            setImage("Informatie2.png"); 
        else
            setImage("Informatie.png"); 
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new InformatieScherm());
        }    
    }    
}
