import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kot extends Actor
{
    public void ruch()
    {
        if( Greenfoot.isKeyDown("right") ) move (20);
        if( Greenfoot.isKeyDown("left") ) move (-20);
    }

            public void act() 
            {
                ruch();
               
            }
        }  
