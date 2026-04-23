import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
    
        Hero hero = new Hero();
        addObject(hero,100,300);
        
        Marble marble = new Marble();
        addObject(marble,500,300);
        
        Hp hp1 = new Hp();
        addObject(hp1,550,50);
        Hp hp2 = new Hp();
        addObject(hp2,500,50);
        Hp hp3 = new Hp();
        addObject(hp3,450,50);
    }
}
