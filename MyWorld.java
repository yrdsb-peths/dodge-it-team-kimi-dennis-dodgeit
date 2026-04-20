import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);

    
    
        Hero hero = new Hero();
        addObject(hero,200,200);
        
        Marble marble = new Marble();
        addObject(marble,500,200);

    }
}
