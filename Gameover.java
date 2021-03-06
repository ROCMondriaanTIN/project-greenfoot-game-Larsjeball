import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new LevelSelector());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Karakter2 karakter2 = new Karakter2();
        addObject(karakter2,359,80);
        Karakterhurt karakterhurt = new Karakterhurt();
        addObject(karakterhurt,184,78);
        Karakterhurt2 karakterhurt2 = new Karakterhurt2();
        addObject(karakterhurt2,530,80);

        Restart restart = new Restart();
        addObject(restart,483,375);
        removeObject(restart);
        Restart restart2 = new Restart();
        addObject(restart2,490,360);
    }
}
