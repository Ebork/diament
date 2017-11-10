import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pizza extends Actor
{
    public void spadaj()
    {

        turn(90);
        move(1);
        turn(-90);
    }

    public void wykryjDno()
    {
        World world = getWorld();
        int wysokość = world.getHeight()  -1 ;
        int mojeY = getY();
        if( mojeY >= wysokość ) world.removeObject( this );

    } 	

    public void act()
    {
        spadaj();
        wykryjDno();
    }

    
    
        
   
    
   


}
