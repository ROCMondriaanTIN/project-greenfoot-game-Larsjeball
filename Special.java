import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Special here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Special extends Actor
{ 
    public Special()
   {
       GreenfootImage myImage = getImage();
       int myNewHeight = (int)myImage.getHeight()/2;
       int myNewWidth = (int)myImage.getWidth()/2;
       myImage.scale(myNewWidth, myNewHeight);
    }
   public void act() 
    {
        // Add your action code here.
    }    
}
