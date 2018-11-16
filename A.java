import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Actor
{
  public A()
   {
    GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight()/8;
    int myNewWidth = (int)myImage.getWidth()/8;
    myImage.scale(myNewWidth, myNewHeight);
   }
    public void act() 
    {
        // Add your action code here.
    }    
}
