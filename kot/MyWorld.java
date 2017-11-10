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
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kot kot = new kot();
        addObject(kot,356,560);
    }

    public void act()
    {
        zrobPizze();
    }	

    public void zrobPizze()
    {

        int szansa = Greenfoot.getRandomNumber(100);
        if(szansa <10)
        {
            int szerokość = getWidth(); 
            int  x = Greenfoot.getRandomNumber( szerokość );
            int y = 0;
            pizza pizza = new pizza();
            addObject ( pizza, x, y);
        }
    }

}  
