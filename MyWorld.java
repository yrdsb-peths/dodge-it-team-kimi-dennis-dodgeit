import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero h = new Hero();
        addObject(h, 200, 200);
        
        Marble m = new Marble();
        addObject(m, 400 , 200);
    }
}
