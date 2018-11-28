import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deurtop3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deurtop3 extends Mover
{
    /**
     * Act - do whatever the Deurtop3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
               if(getOneIntersectingObject(Hero.class)!= null && getWorld().getObjects(Sleutel.class).isEmpty())
        {
        Greenfoot.setWorld(new startscherm());
    }
        applyVelocity();
    }    
    }    

