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
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wojtkowie wojtkowie = new Wojtkowie();
        addObject(wojtkowie,147,194);
        Wojtkowie wojtkowie2 = new Wojtkowie();
        addObject(wojtkowie2,251,296);
        Wojtkowie wojtkowie3 = new Wojtkowie();
        addObject(wojtkowie3,318,137);
        Wojtkowie wojtkowie4 = new Wojtkowie();
        addObject(wojtkowie4,105,57);
        potwór potwór = new potwór();
        addObject(potwór,421,205);
    }
}
