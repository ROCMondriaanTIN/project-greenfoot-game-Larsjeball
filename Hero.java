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
     int waardeCoin = 1;
     int Charactercoin1 = 0;
     int Charactercoin2 = 0;
    
  


    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }
    public void Charactercoin1() {
        if(isTouching(Charactercoin1.class)) {
            waardeCoin = 2;
            removeTouching(Charactercoin1.class);
        }
    }
     public void Charactercoin2() {
        if(isTouching(Charactercoin2.class)) {
            waardeCoin = 3;
            removeTouching(Charactercoin2.class);
        }
    }

    @Override
    public void act() {
        handleInput();
       animationCounter ++;
        velocityX *= drag;
        velocityY += acc;
        Charactercoin1();
        Charactercoin2();
       
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
            Greenfoot.setWorld(new Gameover2());
            break;
             }
            }
        for(Actor liquidWaterTop_mid : getIntersectingObjects(TileExtended.class)) {
           TileExtended tile = (TileExtended) liquidWaterTop_mid;
           if (tile != null && tile.type == "water") {
            Greenfoot.setWorld(new Gameover());
            break;
             }
            }
            Actor Diamant = getOneIntersectingObject(Diamant.class);
            if (Diamant != null) {
                World myWorld = getWorld();
                myWorld.removeObject(Diamant);
                
                level2 level2 = (level2)myWorld;
                Counter counter = level2.getCounter();
                counter.addScore();
               
            
                
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
        setImage("p"+waardeCoin+"_jump.png");
    }
    public void animateDuck(){
        setImage("p"+waardeCoin+"_duck.png");
    }
        
    public void animateRight()
    {
        
    
        if(frame == 1)
        {
        setImage("p"+waardeCoin+"_walk01.png");
        }
        else if(frame == 2)
        {
        setImage("p"+waardeCoin+"_walk02.png");
        }
       else if(frame == 3)
        {
        setImage("p"+waardeCoin+"_walk03.png");
        }
        else if(frame == 4)
        {
        setImage("p"+waardeCoin+"_walk04.png");
        }
        else if(frame == 5)
        {
        setImage("p"+waardeCoin+"_walk05.png");
        }
        else if(frame == 6)
        {
        setImage("p"+waardeCoin+"_walk06.png");
        }
       else if(frame == 7)
        {
        setImage("p"+waardeCoin+"_walk07.png");
        }
        else if(frame == 8)
        {
        setImage("p"+waardeCoin+"_walk08.png");
        }
        else if(frame == 9)
        {
        setImage("p"+waardeCoin+"_walk09.png");
    {
       
        frame = 1;
        return;
        }

      
        }
        frame ++;
    }
        
        public void animateLeft()
        {
            if(frame == 1)
        {
        setImage("p"+waardeCoin+"_walk01mirrored.png");
        }
        else if(frame == 2)
        {
        setImage("p"+waardeCoin+"_walk02mirrored.png");
        }
       else if(frame == 3)
        {
        setImage("p"+waardeCoin+"_walk03mirrored.png");
        }
        else if(frame == 4)
        {
        setImage("p"+waardeCoin+"_walk04mirrored.png");
        }
        else if(frame == 5)
        {
        setImage("p"+waardeCoin+"_walk05mirrored.png");
        }
        else if(frame == 6)
        {
        setImage("p"+waardeCoin+"_walk06mirrored.png");
        }
       else if(frame == 7)
        {
        setImage("p"+waardeCoin+"_walk07mirrored.png");
        }
        else if(frame == 8)
        {
        setImage("p"+waardeCoin+"_walk08mirrored.png");
        }
        else if(frame == 9)
        {
        setImage("p"+waardeCoin+"_walk09mirrored.png");
    
        
     
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
