import greenfoot.*;

public class Hero extends Actor
{
    private static GreenfootImage heroImage;
    boolean atTop = true;
    
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
    }
}
