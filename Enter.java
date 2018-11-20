import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enter extends Actor
{
    public Enter()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act() 
    {
       
    }    
}
