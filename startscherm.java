import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startscherm extends World
{

    /**
     * Constructor for objects of class startscherm.
     * 
     */
    public startscherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);

        prepare();
    }

    public void act()
    {

        if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new level1());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    {
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        I i = new I();
        addObject(i,206,166);
        i.setLocation(194,112);
        V v = new V();
        addObject(v,625,141);
        i.setLocation(108,110);
        v.setLocation(393,144);
        v.setLocation(397,147);
        v.setLocation(421,152);
        v.setLocation(467,155);
        N n = new N();
        addObject(n,288,126);
        n.setLocation(195,146);
        v.setLocation(326,146);
        n.setLocation(241,133);
        v.setLocation(310,127);
        v.setLocation(385,141);
        n.setLocation(247,143);
        v.setLocation(327,148);
        v.setLocation(423,116);
        n.setLocation(194,137);
        v.setLocation(373,146);
        n.setLocation(289,139);
        v.setLocation(449,130);
        n.setLocation(257,157);
        v.setLocation(418,152);
        n.setLocation(291,142);
        v.setLocation(402,150);
        n.setLocation(249,102);
        v.setLocation(361,148);
        n.setLocation(250,149);
        i.setLocation(140,189);
        i.setLocation(135,161);
        A a = new A();
        addObject(a,557,189);
        a.setLocation(459,151);
        v.setLocation(372,184);
        n.setLocation(270,177);
        a.setLocation(473,190);
        i.setLocation(68,64);
        n.setLocation(172,128);
        v.setLocation(308,131);
        n.setLocation(193,117);
        v.setLocation(301,124);
        a.setLocation(392,105);
        i.setLocation(95,127);
        i.setLocation(125,165);
        a.setLocation(436,144);
        i.setLocation(78,102);
        n.setLocation(191,142);
        v.setLocation(255,138);
        a.setLocation(369,113);
        v.setLocation(284,163);
        a.setLocation(393,154);
        v.setLocation(335,150);
        n.setLocation(202,129);
        v.setLocation(286,127);
        a.setLocation(385,128);
        n.setLocation(211,155);
        v.setLocation(293,146);
        a.setLocation(385,139);
        a.setLocation(417,143);
        v.setLocation(290,161);
        n.setLocation(209,159);
        n.setLocation(186,148);
        v.setLocation(313,168);
        v.setLocation(301,125);
        v.setLocation(299,165);
        v.setLocation(301,176);
    }
}
   



