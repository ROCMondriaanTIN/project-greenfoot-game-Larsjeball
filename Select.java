import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select extends Actor
{
    /**
     * Act - do whatever the Select wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 private boolean onThis = false;
    public void act() 
    {
        if (Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if (onThis)
            setImage("Select2.png"); 
        else
            setImage("Select.png"); 
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new LevelSelector());
        }    
    }     
}

