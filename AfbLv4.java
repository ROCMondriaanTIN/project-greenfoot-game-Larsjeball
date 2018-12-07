import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AfbLv4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AfbLv4 extends Actor
{
    /**
     * Act - do whatever the AfbLv4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ster geel = new Ster();
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            geel.level4();
        }       
}
}
