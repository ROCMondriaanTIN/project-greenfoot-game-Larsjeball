import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select extends Actor
{
    /**
     * Act - do whatever the Select wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
         public Select()
{
    GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight()/2;
    int myNewWidth = (int)myImage.getWidth()/2;
    myImage.scale(myNewWidth, myNewHeight);
}
    public void act() 
    {
       {
       if(Greenfoot.mouseClicked(this))
       Greenfoot.setWorld(new LevelSelector());
       
    }  
}
}

