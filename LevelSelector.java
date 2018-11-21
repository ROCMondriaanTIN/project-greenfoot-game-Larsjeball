import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelector extends World
{

    /**
     * Constructor for objects of class LevelSelector.
     * 
     */
    public LevelSelector()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
  

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SelectLevel selectLevel = new SelectLevel();
        addObject(selectLevel,567,180);
        selectLevel.setLocation(672,164);
        selectLevel.setLocation(732,167);
        selectLevel.setLocation(583,172);
        Nummer1 nummer1 = new Nummer1();
        addObject(nummer1,339,433);
        Nummer2 nummer2 = new Nummer2();
        addObject(nummer2,667,437);

        Afblv1 afblv1 = new Afblv1();
        addObject(afblv1,356,584);
    }
}

