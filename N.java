import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class N here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class N extends Actor
{
     public N()
     {
     GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight()/4;
    int myNewWidth = (int)myImage.getWidth()/4;
    myImage.scale(myNewWidth, myNewHeight);
     }
    public void act() 
    {
        // Add your action code here.
    }    
}