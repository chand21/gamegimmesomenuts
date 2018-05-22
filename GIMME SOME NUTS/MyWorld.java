import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld
     * 
     */
    
    
    public MyWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setPaintOrder(counter.class, tupai.class, kacang.class);
        
        addObject(new tupai(), 200,500);
        addObject(new kacang(), 500, 30);
        addObject(new bomb(), 400, 40);
        
        skor skor = new skor();
        
        
    }
    private void siap()
    {
        counter counter = new counter("");
        addObject (counter,90, 30);
        addObject (skor,95, 30);
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100)<1){       //agar dapat kacang secara random
<<<<<<< HEAD
            addObject(new kacang(), Greenfoot.getRandomNumber(70), 10);
=======
            addObject(new kacang(), Greenfoot.getRandomNumber(700), 15);
>>>>>>> 8eaa38798554290582dab9a71cf71e55f5598296
        }
        if(Greenfoot.getRandomNumber(990)<1){       //random bomb
            addObject(new bomb(), Greenfoot.getRandomNumber(200), 20);
        }
    }
<<<<<<< HEAD
    
     public void tambahNilai()
    {
     
=======
    counter skor = new counter("");
     public void tambahNilai()
    {
        skor.tambah(10);
>>>>>>> 8eaa38798554290582dab9a71cf71e55f5598296
    }
}
