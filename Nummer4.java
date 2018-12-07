import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nummer4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nummer4 extends Mover
{
    /**
     * Act - do whatever the Nummer4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ster geel = new Ster();
    public void act() 
    {
        if(Greenfoot.isKeyDown("4")) {
            geel.level4();
        }       
}
}
