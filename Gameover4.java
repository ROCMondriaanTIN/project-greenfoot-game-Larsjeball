import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover4 extends World
{

    /**
     * Constructor for objects of class Gameover4.
     * 
     */
    public Gameover4()
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
        Karakterhurt karakterhurt = new Karakterhurt();
        addObject(karakterhurt,167,83);
        Karakter2 karakter2 = new Karakter2();
        addObject(karakter2,359,78);
        Karakterhurt2 karakterhurt2 = new Karakterhurt2();
        addObject(karakterhurt2,537,79);
        Restart4 restart4 = new Restart4();
        addObject(restart4,481,361);
    }
}
