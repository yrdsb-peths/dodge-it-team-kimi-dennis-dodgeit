import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Marble extends Actor
{
    
    public void act()
    {
        move(-5);
        
        if(getX() <= 0){
            resetMarble();
        }
    }
}
