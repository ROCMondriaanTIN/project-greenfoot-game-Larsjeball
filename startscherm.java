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
        n.setLocation(166,117);
        v.setLocation(279,112);
        a.setLocation(404,133);
        a.setLocation(364,135);
        v.setLocation(267,136);
        a.setLocation(349,134);

        v.setLocation(283,112);
        a.setLocation(341,113);

        v.setLocation(246,125);
        a.setLocation(319,158);
        a.setLocation(342,161);
        a.setLocation(323,109);

        a.setLocation(329,140);
        a.setLocation(319,134);
        a.setLocation(331,142);
        a.setLocation(339,146);
        a.setLocation(313,123);
        a.setLocation(329,153);
        a.setLocation(317,141);
        a.setLocation(335,141);
        a.setLocation(323,96);
        a.setLocation(326,135);
        E e = new E();
        addObject(e,532,132);
        e.setLocation(472,103);
        e.setLocation(472,126);
        e.setLocation(500,152);
        e.setLocation(474,139);
        copyE copyE = new copyE();
        addObject(copyE,738,159);
        copyE.setLocation(659,124);
        S s = new S();
        addObject(s,786,169);
        s.setLocation(772,131);
        s.setLocation(749,141);
        s.setLocation(738,145);
        s.setLocation(730,126);

        e.setLocation(451,156);
        e.setLocation(445,183);
        D d = new D();
        addObject(d,445,183);
        e.setLocation(528,137);
        d.setLocation(390,123);
        e.setLocation(458,141);
        e.setLocation(473,136);
        d.setLocation(408,162);
        d.setLocation(412,155);
        d.setLocation(386,146);
        d.setLocation(403,156);
        d.setLocation(401,189);
        d.setLocation(403,197);
        d.setLocation(397,160);
        d.setLocation(395,151);
        d.setLocation(389,139);
        e.setLocation(490,152);
        e.setLocation(452,138);
        a.setLocation(321,136);
        C c = new C();
        addObject(c,837,157);
        c.setLocation(801,126);
        d.setLocation(377,133);
        d.setLocation(378,166);
        d.setLocation(377,144);
        d.setLocation(394,151);
        d.setLocation(380,150);
        d.setLocation(384,135);
        CopyA copyA = new CopyA();
        addObject(copyA,915,153);
        copyA.setLocation(861,117);
        copyA.setLocation(863,125);
        P p = new P();
        addObject(p,937,144);
        p.setLocation(927,122);
        copyE copyE2 = new copyE();
        addObject(copyE2,1048,156);
        copyE2.setLocation(990,118);
        copyE2.setLocation(1003,137);
        copyE2.setLocation(995,143);
        copyE2.setLocation(989,138);
        copyE2.setLocation(995,139);
        copyE2.setLocation(995,131);
        n.setLocation(145,130);
        v.setLocation(194,140);
        a.setLocation(285,143);
        d.setLocation(341,149);
        e.setLocation(448,147);
        copyE2.setLocation(1069,139);
        p.setLocation(996,136);
        copyA.setLocation(952,142);
        c.setLocation(877,130);
        s.setLocation(815,124);
        copyE.setLocation(749,124);
        v.setLocation(232,135);
        v.setLocation(225,128);
        d.setLocation(343,152);
        a.setLocation(309,138);
        e.setLocation(411,139);
        a.setLocation(279,135);
        a.setLocation(297,148);
        d.setLocation(350,157);
        e.setLocation(417,139);
        d.setLocation(359,162);
        d.setLocation(342,138);
        a.setLocation(299,146);
        a.setLocation(291,146);
        d.setLocation(363,146);
        e.setLocation(418,148);
        a.setLocation(305,138);
        e.setLocation(437,140);
        d.setLocation(380,144);
        a.setLocation(322,153);
        a.setLocation(304,150);
        a.setLocation(297,135);
        d.setLocation(336,152);
        d.setLocation(374,116);
        d.setLocation(360,143);
        e.setLocation(416,157);
        e.setLocation(443,153);
        e.setLocation(421,144);
        copyA.setLocation(927,157);
        copyE2.setLocation(1088,135);
        p.setLocation(1041,146);
        copyA.setLocation(956,163);
        p.setLocation(1022,169);
        copyE2.setLocation(1071,153);
        copyE2.setLocation(1069,152);
        c.setLocation(926,139);
        c.setLocation(926,139);
        s.setLocation(859,146);
        copyE.setLocation(795,124);
        copyE2.setLocation(1090,141);
        p.setLocation(1025,160);
        copyE.setLocation(776,124);
        s.setLocation(843,138);
        c.setLocation(886,132);
        c.setLocation(895,159);
        copyE.setLocation(769,106);
        s.setLocation(834,123);
        c.setLocation(882,142);
        c.setLocation(903,147);
        c.setLocation(871,122);
        c.setLocation(882,141);
        c.setLocation(898,128);
        copyA.setLocation(956,152);
        copyA.setLocation(948,136);
        copyA.setLocation(967,134);
        copyA.setLocation(955,145);
        copyA.setLocation(957,150);
        copyA.setLocation(962,145);
        copyA.setLocation(961,135);
        copyE2.setLocation(1115,139);
        p.setLocation(1018,132);
        copyE2.setLocation(1060,149);
        copyE.setLocation(761,129);
        copyE2.setLocation(1092,143);
        copyE2.setLocation(1081,141);
        copyE2.setLocation(1094,137);
        copyE2.setLocation(1075,148);
        copyE2.setLocation(1094,121);
        copyE2.setLocation(1095,116);
        copyE2.setLocation(1079,143);
        copyE2.setLocation(1092,139);
    }
}
   



