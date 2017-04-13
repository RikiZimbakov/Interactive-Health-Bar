/**
 * * Name: (Risto Zimbakov)
 * Teacher: Mr. Hardman
 * Assignment #1, SideScroller
 * Date Last Modified: 4/11/2017 
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

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
     * prepare gets the world ready for the start of the program
     * by creating the initial objects and adding them to the world.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void prepare()
    {
        Button button = new Button();
        addObject(button,287,115);
        button.setLocation(169,252);
        Button button2 = new Button(Color.BLUE, Color.PINK, -50);
        addObject(button2,389,275);
        button2.setLocation(390,257);
        HealthBar healthbar = new HealthBar();
        addObject(healthbar,279,149);
    }
}
