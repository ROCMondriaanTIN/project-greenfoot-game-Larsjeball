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
    public void act()
    {
         if(Greenfoot.isKeyDown("2"))
        Greenfoot.setWorld(new level2());
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
        AfbLv2 afbLv2 = new AfbLv2();
        addObject(afbLv2,777,602);
        afbLv2.setLocation(695,580);
        afbLv2.setLocation(694,574);
        afblv1.setLocation(257,579);
        nummer1.setLocation(259,435);
        afblv1.setLocation(399,519);
        afbLv2.setLocation(643,546);
        Nummer1 nummer12 = new Nummer1();
        addObject(nummer12,127,434);
        afblv1.setLocation(85,531);
        afblv1.setLocation(266,594);
        afblv1.setLocation(152,509);
        removeObject(nummer1);
        afblv1.setLocation(236,564);
        afbLv2.setLocation(460,612);
        nummer2.setLocation(540,437);
        afbLv2.setLocation(581,551);
        afbLv2.setLocation(543,553);
        afbLv2.setLocation(415,572);
        afblv1.setLocation(430,588);
        Nummer2 nummer22 = new Nummer2();
        addObject(nummer22,466,423);
        removeObject(nummer2);
        afbLv2.setLocation(522,545);
        afbLv2.setLocation(585,532);
        afblv1.setLocation(89,544);
        afbLv2.setLocation(437,556);
        nummer12.setLocation(137,425);
        afblv1.setLocation(270,577);
        removeObject(nummer22);
        removeObject(nummer12);

        addObject(nummer12,157,409);

        addObject(nummer22,490,407);
        afbLv2.setLocation(722,516);
        afblv1.setLocation(171,551);
        afbLv2.setLocation(535,551);
        afbLv2.setLocation(566,584);
        afblv1.setLocation(241,578);
        afblv1.setLocation(171,602);
        afbLv2.setLocation(476,568);
        afbLv2.setLocation(624,627);
        afbLv2.setLocation(494,595);
        afbLv2.setLocation(556,589);
        afbLv2.setLocation(541,631);
        afbLv2.setLocation(515,603);
        afblv1.setLocation(252,607);
        afbLv2.setLocation(445,604);
        afblv1.setLocation(118,595);
        afbLv2.setLocation(481,614);
        afblv1.setLocation(206,588);
        afbLv2.setLocation(682,542);
        afblv1.setLocation(200,586);
        afblv1.setLocation(180,618);
        afblv1.setLocation(81,586);
        afblv1.setLocation(221,599);
        afblv1.setLocation(214,605);
        afblv1.setLocation(140,612);
        afblv1.setLocation(218,586);
        afblv1.setLocation(140,608);
        afblv1.setLocation(173,604);
        afblv1.setLocation(166,605);
        afblv1.setLocation(167,582);
        afblv1.setLocation(201,641);
        afblv1.setLocation(139,589);
        afblv1.setLocation(224,626);
        afblv1.setLocation(123,589);
        afblv1.setLocation(235,630);
        afblv1.setLocation(124,569);
        afbLv2.setLocation(432,596);
        afbLv2.setLocation(568,611);
        afbLv2.setLocation(485,635);
        afbLv2.setLocation(553,600);
        afbLv2.setLocation(435,610);
        afbLv2.setLocation(544,522);
        afbLv2.setLocation(432,608);
        afbLv2.setLocation(611,370);
        afbLv2.setLocation(591,352);
        afbLv2.setLocation(542,492);
        afbLv2.setLocation(568,342);
        afbLv2.setLocation(638,606);
        afbLv2.setLocation(367,429);
        afbLv2.setLocation(580,586);
        afbLv2.setLocation(422,532);
        afbLv2.setLocation(471,586);
        afbLv2.setLocation(478,600);
        afbLv2.setLocation(536,579);
        afbLv2.setLocation(437,601);
        afbLv2.setLocation(580,594);
        afbLv2.setLocation(552,616);
        afbLv2.setLocation(599,590);
        afbLv2.setLocation(457,583);
        afbLv2.setLocation(512,613);
        afbLv2.setLocation(482,550);
        afbLv2.setLocation(499,599);
        afbLv2.setLocation(512,589);
        afbLv2.setLocation(497,561);
        afbLv2.setLocation(494,572);
        afbLv2.setLocation(580,610);
        afbLv2.setLocation(425,612);
        afbLv2.setLocation(535,584);
        afbLv2.setLocation(382,602);
        afbLv2.setLocation(495,595);
        afbLv2.setLocation(500,543);
        afbLv2.setLocation(437,613);
        afbLv2.setLocation(556,590);
        afbLv2.setLocation(469,598);
        afbLv2.setLocation(487,552);
        afbLv2.setLocation(509,566);
        afbLv2.setLocation(420,593);
        afbLv2.setLocation(567,583);
        afbLv2.setLocation(383,564);
        afbLv2.setLocation(480,556);
        afbLv2.setLocation(501,601);
        afbLv2.setLocation(459,555);
    }
}

