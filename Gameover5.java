import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover5 extends World
{

    /**
     * Constructor for objects of class Gameover5.
     * 
     */
    public Gameover5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Restart5 restart5 = new Restart5();
        addObject(restart5,481,360);
        Karakter2 karakter2 = new Karakter2();
        addObject(karakter2,348,87);
        Karakterhurt karakterhurt = new Karakterhurt();
        addObject(karakterhurt,128,84);
        Karakterhurt2 karakterhurt2 = new Karakterhurt2();
        addObject(karakterhurt2,580,84);
    }
}
