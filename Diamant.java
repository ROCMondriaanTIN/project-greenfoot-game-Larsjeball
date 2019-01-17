import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamant extends Mover
{
    static boolean diamantCollected = false;
    public void act() 
    {
          {
       for (Actor enemy : getIntersectingObjects(Hero.class)) {
           if (getWorld() instanceof level2){
                diamantCollected();
           }
           if (enemy != null) {
                getWorld().removeObject(this);
                return;
           }
       }
      applyVelocity();
    }
}
    public void diamantCollected(){
        diamantCollected = true;
    }
    
    public void level5(){
        if(diamantCollected == true) {
            Greenfoot.setWorld(new level5());
        }
        else{
            Greenfoot.setWorld(new DiamantScherm());
    }    
}
}
    


