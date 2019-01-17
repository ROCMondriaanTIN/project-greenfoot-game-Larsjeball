import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlaySelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlaySelect extends World
{
 
    /**
     * Constructor for objects of class PlaySelect.
     * 
     */
    public PlaySelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 690, 1); 
         
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,291,265);
        start.setLocation(509,351);
        Select select = new Select();
        addObject(select,770,351);
        Karakter2 karakter2 = new Karakter2();
        addObject(karakter2,194,486);
        Karakter3 karakter3 = new Karakter3();
        addObject(karakter3,1084,486);
        Informatie informatie = new Informatie();
        addObject(informatie,675,276);
        select.setLocation(790,398);
        select.setLocation(793,362);
        select.setLocation(810,386);
        select.setLocation(844,356);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,691,483);
        select.setLocation(786,368);
        removeObject(select);

        Select select2 = new Select();
        addObject(select2,793,379);
    }
}
