import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startscherm extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("Dad n Me.mp3");
    /**
     * Constructor for objects of class startscherm.
     * 
     */
    public startscherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        backgroundMusic.playLoop();
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new PlaySelect());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Karakter3 karakter3 = new Karakter3();
        addObject(karakter3,991,371);
        Hero hero = new Hero();
        addObject(hero,234,397);
        Karakter2 karakter2 = new Karakter2();
        addObject(karakter2,642,642);
    }
}
