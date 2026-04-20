import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);

    
    
        Hero hero = new Hero();
        addObject(hero,100,300);
        
        Marble marble = new Marble();
        addObject(marble,500,300);
        
    }
}
