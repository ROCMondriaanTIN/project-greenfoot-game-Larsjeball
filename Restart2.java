import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart2 extends Mover
{
      public Restart2()
{
    GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight()/6;
    int myNewWidth = (int)myImage.getWidth()/6;
    myImage.scale(myNewWidth, myNewHeight);
}
    public void act() 
    {
       if(Greenfoot.mouseClicked(this))
       
           Greenfoot.setWorld(new level2());
    }    
}
