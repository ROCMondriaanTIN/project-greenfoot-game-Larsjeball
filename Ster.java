import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ster extends Mover
{
    /**
     * Act - do whatever the Ster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  static boolean starCollected = false;
    
    
    public void act() 
    {
      
    {
       for (Actor enemy : getIntersectingObjects(Hero.class)) {
           if (getWorld() instanceof level3){
                starCollected();
           }
           if (enemy != null) {
                getWorld().removeObject(this);
                return;
           }
       }
       applyVelocity();
    }
}
    
    public void starCollected(){
        starCollected = true;
    }
    
    public void level4(){
        if(starCollected == true) {
            Greenfoot.setWorld(new level4());
        }
        else{
            Greenfoot.setWorld(new SterScherm());
    }    
}
    
}
