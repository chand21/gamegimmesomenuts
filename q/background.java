import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends MyWorld
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        enemy enemy = new enemy();
        addObject(enemy,300,135);
        enemy.setLocation(478,101);
        cherries cherries = new cherries();
        addObject(cherries,308,223);
        cherries cherries2 = new cherries();
        addObject(cherries2,329,128);
        cherries cherries3 = new cherries();
        addObject(cherries3,359,291);
        cherries cherries4 = new cherries();
        addObject(cherries4,194,301);
        cherries cherries5 = new cherries();
        addObject(cherries5,220,134);
        enemy enemy2 = new enemy();
        addObject(enemy2,346,43);
        enemy enemy3 = new enemy();
        addObject(enemy3,141,364);
        enemy enemy4 = new enemy();
        addObject(enemy4,138,99);
        enemy enemy5 = new enemy();
        addObject(enemy5,269,284);
        removeObject(enemy4);
        removeObject(enemy3);
    }
}
