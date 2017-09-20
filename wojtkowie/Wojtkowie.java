import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wojtkowie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wojtkowie extends Actor
{
    int kierunek = 1; 
    
    public void act() 
    {
        // Add your action code here.
        move( kierunek );
        
        if( isAtEdge() ) kierunek = kierunek * (-1);
    
    }    
}
