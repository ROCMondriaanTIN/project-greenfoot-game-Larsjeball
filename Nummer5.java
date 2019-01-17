import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nummer5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nummer5 extends Mover
{
    /**
     * Act - do whatever the Nummer5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     Diamant blauw = new Diamant();
    public void act() 
     
    {
         if(Greenfoot.isKeyDown("5")) {
            blauw.level5();
        }       
    }  
}

