import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deurmidden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deurmidden extends Mover
{
    /**
     * Act - do whatever the Deurmidden wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          
         for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null){
                if (getWorld() instanceof level1) Greenfoot.setWorld(new level2());
                return;
            }
        }
        applyVelocity();
    }    
}
