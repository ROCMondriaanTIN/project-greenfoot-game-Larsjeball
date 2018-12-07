
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy2 extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public Enemy2() {
        super();
//        setImage("pokerMad.png");
        getImage().mirrorHorizontally();
        walkRange = 140;
        firstAct = true;
        speed = 1;
    }

    @Override
    public void act() {
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null){
                if (getWorld() instanceof level1) Greenfoot.setWorld(new Gameover());
                if (getWorld() instanceof level3) Greenfoot.setWorld(new Gameover3());
                  if (getWorld() instanceof level4) Greenfoot.setWorld(new LevelSelector());;
                return;
            }
        }
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
    }
}
