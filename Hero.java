
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    int oldY;
    boolean canJump = true;
    private GreenfootImage p1 = new GreenfootImage("p1_walk01.png");
    private GreenfootImage p2 = new GreenfootImage("p1_walk02.png");
    private GreenfootImage p3 = new GreenfootImage("p1_walk03.png");
    private GreenfootImage p4 = new GreenfootImage("p1_walk04.png");
    private GreenfootImage p5 = new GreenfootImage("p1_walk05.png");
    private GreenfootImage p6 = new GreenfootImage("p1_walk06.png");
    private GreenfootImage p7 = new GreenfootImage("p1_walk07.png");
    private GreenfootImage p8 = new GreenfootImage("p1_walk08.png");
    private GreenfootImage p9 = new GreenfootImage("p1_walk09.png");
    private GreenfootImage p10 = new GreenfootImage("p1_walk10.png");
    private GreenfootImage p1mir = new GreenfootImage("p1_walk01mirrored.png");
    private GreenfootImage p2mir = new GreenfootImage("p1_walk02mirrored.png");
    private GreenfootImage p3mir = new GreenfootImage("p1_walk03mirrored.png");
    private GreenfootImage p4mir = new GreenfootImage("p1_walk04mirrored.png");
    private GreenfootImage p5mir = new GreenfootImage("p1_walk05mirrored.png");
    private GreenfootImage p6mir = new GreenfootImage("p1_walk06mirrored.png");
    private GreenfootImage p7mir = new GreenfootImage("p1_walk07mirrored.png");
    private GreenfootImage p8mir = new GreenfootImage("p1_walk08mirrored.png");
    private GreenfootImage p9mir = new GreenfootImage("p1_walk09mirrored.png");
    private GreenfootImage p10mir = new GreenfootImage("p1_walk10mirrored.png");
    private GreenfootImage p1jump = new GreenfootImage("p1_jump.png");
    private GreenfootImage p1duck = new GreenfootImage("p1_duck.png");
    public int frame = 1;
    private int animationCounter = 0;


    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
       animationCounter ++;
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        for(Actor liquidLava : getIntersectingObjects(TileExtended.class)) {
           TileExtended tile = (TileExtended) liquidLava;
           if (tile != null && tile.type == "vuur") {
            Greenfoot.setWorld(new Gameover());
            break;
             }
            }
            
    

        
        if(oldY < getY() || oldY > getY()) {
            canJump = false;
          }
          else
          {
            canJump = true;
          }
    if(Greenfoot.isKeyDown("space") == false) oldY = getY();
  }
    public void handleInput() 
    {
        
        if (Greenfoot.isKeyDown("space")&& canJump == true) 
        {
            velocityY = -16;
            animateJump();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            
            animateDuck();
        }

        if (Greenfoot.isKeyDown("Left"))
        {
            velocityX = -6;
            if(animationCounter % 4 == 0)
            animateLeft();
        }
        
        else if (Greenfoot.isKeyDown("Right"))
        {
            velocityX = 6;
            if(animationCounter % 4 == 0)
            animateRight();
        }
        
    }
    public void animateJump(){
        setImage(p1jump);
    }
    public void animateDuck(){
        setImage(p1duck);
    }
        
    public void animateRight()
    {
        
    
        if(frame == 1)
        {
        setImage(p1);
        }
        else if(frame == 2)
        {
        setImage(p2);
        }
       else if(frame == 3)
        {
        setImage(p3);
        }
        else if(frame == 4)
        {
        setImage(p4);
        }
        else if(frame == 5)
        {
        setImage(p5);
        }
        else if(frame == 6)
        {
        setImage(p6);
        }
       else if(frame == 7)
        {
        setImage(p7);
        }
        else if(frame == 8)
        {
        setImage(p8);
        }
        else if(frame == 9)
        {
        setImage(p9);
        frame = 1;
        return;
        }

       frame ++;
        }
        
        public void animateLeft()
        {
            if(frame == 1)
        {
        setImage(p1mir);
        }
        else if(frame == 2)
        {
        setImage(p2mir);
        }
       else if(frame == 3)
        {
        setImage(p3mir);
        }
        else if(frame == 4)
        {
        setImage(p4mir);
        }
        else if(frame == 5)
        {
        setImage(p5mir);
        }
        else if(frame == 6)
        {
        setImage(p6mir);
        }
       else if(frame == 7)
        {
        setImage(p7mir);
        }
        else if(frame == 8)
        {
        setImage(p8mir);
        }
        else if(frame == 9)
        {
        setImage(p9mir);
        frame = 1;
        return;
        }
        frame ++;
        }
    


    public int getWidth()
    {
        return getImage().getWidth();
    }

    public int getHeight() 
    {
        return getImage().getHeight();
    }
}





