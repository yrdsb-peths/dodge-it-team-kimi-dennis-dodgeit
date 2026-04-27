import greenfoot.*;

public class Hero extends Actor
{
    private static GreenfootImage heroImage;
    boolean atTop = true;
    private int invincibleTime = 0;
    public Hero()
    {
        heroImage = new GreenfootImage("man.png");
        setImage(heroImage);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
        }
        
        if(atTop)
        {
            setLocation(100, 100);
        }
        else
        {
            setLocation(100, 300); 
        }
        
        if(invincibleTime > 0)
        {
            invincibleTime--;
        }
    
    }
    
    public boolean canBeHit()
    {
        return invincibleTime == 0;
    }

    public void gotHit()
    {
        invincibleTime = 30;
    
        World world = getWorld();
        
        java.util.List<Hp> hearts = world.getObjects(Hp.class);
        
        if(hearts.size() > 0)
        {
            world.removeObject(hearts.get(hearts.size() - 1));
        }
    
        
        hearts = world.getObjects(Hp.class);
        
        if(hearts.size() == 0)
    {
        if(world.getObjects(Sadface.class).isEmpty())
        {
            Sadface sad = new Sadface();
            world.addObject(sad, 300, 200);
        }
        
        java.util.List<Marble> marbles = world.getObjects(Marble.class);
        world.removeObjects(marbles);
    }
    }
}

