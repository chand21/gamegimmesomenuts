import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tupai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tupai extends Actor
{
    /**
     * Act - do whatever the tupai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
       kacang a= (kacang)getOneIntersectingObject(kacang.class);
       if (a!=null)
       {
           ((MyWorld)getWorld()).tambahNilai();
           
           getWorld().removeObject(a);
           return;
       }
    }    
}
