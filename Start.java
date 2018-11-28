import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
      public Start()
{
    GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight()/3;
    int myNewWidth = (int)myImage.getWidth()/3;
    myImage.scale(myNewWidth, myNewHeight);
}
    public void act() 
    {
       {
       if(Greenfoot.mouseClicked(this))
       Greenfoot.setWorld(new level1());
       
    }    
}
}

