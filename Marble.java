import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Marble extends Actor
{
    private static GreenfootImage marble;
    private boolean hasHit = false;
    private int cooldown = 0;
    public Marble()
    {
        marble = new GreenfootImage("gold-ball.png");
        setImage(marble);
    }
    
    public void act()
    {
        move(-10);
            
        if(getX() <= 0)
        {
            resetMarble();
        }
        Hero hero = (Hero) getOneIntersectingObject(Hero.class);

        if(hero != null && hero.canBeHit())
        {
            hero.gotHit();
        }
    }
    
    public void resetMarble()
    {
        int x = Greenfoot.getRandomNumber(2);
        if(x == 0){
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
    
    }
}
