import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AfbLv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AfbLv2 extends Actor
{
   public AfbLv2()
   {
       GreenfootImage myImage = getImage();
       int myNewHeight = (int)myImage.getHeight()/2;
       int myNewWidth = (int)myImage.getWidth()/2;
       myImage.scale(myNewWidth, myNewHeight);
    }
    public void act() 
    {
           if(Greenfoot.mouseClicked(this))
            Greenfoot.setWorld(new level2());
    }    
}
