import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
private CollisionEngine ce;
    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {     
         super(1200, 800, 1, false);
         this.setBackground("bg.png");

        int[][] map = {
            {-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55},
{-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,55,51,-1,51,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,55,51,-1,-1,-1,51,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,60,60,55,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,55,-1,-1,-1,-1,-1,-1,-1,46,42,-1,-1,-1,-1,56,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,93,94,95,-1,-1,-1,-1,-1,-1,-1,-1,56,60,60,60,60,55,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,82,-1,-1,82,-1,-1,82,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,46,42,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1,84,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,93,95,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1,84,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,9,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,9,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1,84,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{41,41,41,41,41,41,41,41,41,41,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,46,41,42,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,41,41,41,41,41,41,39,-1,-1,84,-1,-1,84,-1,-1,84,-1,-1,-1,-1,-1,-1,87,-1,-1,87,-1,-1,-1,-1,-1,-1,-1,-1,-1,93,95,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{27,27,27,27,27,27,27,27,27,27,38,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,27,27,27,27,27,38,39,-1,84,-1,-1,84,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,37,41,41,41,41,41,41,41,41,41},
{27,27,27,27,27,27,27,27,27,27,27,38,39,-1,-1,-1,46,41,42,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,41,-1,-1,-1,-1,27,27,27,27,27,27,27,38,39,84,-1,-1,84,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,93,94,95,-1,-1,-1,-1,-1,-1,-1,93,94,95,-1,-1,-1,-1,-1,37,40,27,27,27,27,27,27,27,27,27},
{27,27,27,27,27,27,27,27,27,27,27,27,38,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,41,-1,-1,-1,-1,41,-1,-1,-1,-1,27,-1,-1,-1,-1,27,27,27,27,27,27,27,27,38,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,37,40,27,27,27,27,27,27,27,27,27,27},
{27,27,27,27,27,27,27,27,27,27,27,27,27,38,81,81,81,81,81,81,81,81,81,81,81,81,27,81,81,81,81,27,81,81,81,81,27,81,81,81,81,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,38,41,41,41,41,41,41,41,81,81,81,81,81,81,81,81,81,81,81,81,37,40,27,27,27,27,27,27,27,27,27,27,27},
{27,27,27,27,27,27,27,27,27,27,27,27,27,27,79,79,79,79,79,79,79,79,79,79,79,79,27,79,79,79,79,27,79,79,79,79,27,79,79,79,79,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,79,79,79,79,79,79,79,79,79,79,79,79,27,27,27,27,27,27,27,27,27,27,27,27,27},
{27,27,27,27,27,27,27,27,27,27,27,27,27,27,79,79,79,79,79,79,79,79,79,79,79,79,27,79,79,79,79,27,79,79,79,79,27,79,79,79,79,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,79,79,79,79,79,79,79,79,79,79,79,79,27,27,27,27,27,27,27,27,27,27,27,27,27},
{27,27,27,27,27,27,27,27,27,27,27,27,27,27,79,79,79,79,79,79,79,79,79,79,79,79,27,79,79,79,79,27,79,79,79,79,27,79,79,79,79,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,79,79,79,79,79,79,79,79,79,79,79,79,27,27,27,27,27,27,27,27,27,27,27,27,27},
{27,27,27,27,27,27,27,27,27,27,27,27,27,27,79,79,79,79,79,79,79,79,79,79,79,79,27,79,79,79,79,27,79,79,79,79,27,79,79,79,79,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,79,79,79,79,79,79,79,79,79,79,79,79,27,27,27,27,27,27,27,27,27,27,27,27,27},
};
        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 300, 200);
        addObject(new Diamant(), 1290, 120);
        addObject(new Sleutel(), 4680, 300);
        addObject(new Deurmidden(), 5820, 690);
        addObject(new Deurtop(), 5820, 630);
        addObject(new CharacterCoin1(), 3810, 600);
        addObject(new CharacterCoin2(), 3990, 600);
        this.setBackground("bg.png");

       ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
        
    }
        
    @Override
    public void act() {
        ce.update();
    }
    
  
}
        
        
    

