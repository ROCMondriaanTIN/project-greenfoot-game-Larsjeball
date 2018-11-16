import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class I here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class I extends Actor
{
   public I()
   {
    GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight()/6;
    int myNewWidth = (int)myImage.getWidth()/6;
    myImage.scale(myNewWidth, myNewHeight);
   }
    public void act() 
    {
        
    }    
}
