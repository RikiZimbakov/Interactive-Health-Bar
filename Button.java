import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

public class Button extends Actor
{
    GreenfootImage buttonImage1 = new GreenfootImage(100,50);
    GreenfootImage buttonImage2 = new GreenfootImage(100,50);

    private int value;
    private boolean justClicked = false;

    public Button()
    {
        GreenfootImage text1 = new GreenfootImage(100,50);
        GreenfootImage text2 = new GreenfootImage(100,50);
        value = 50;

        buttonImage1.setColor(Color.GRAY);
        buttonImage1.fillRect(0, 0, 100, 50);

        text1.setColor(Color.WHITE);
        text1.setFont(new Font("Helvetica", Font.BOLD, 30));
        text1.drawString("" + value, text1.getWidth()/3 + 1, text1.getHeight() / 2 + 8);
        buttonImage1.drawImage(text1, 0, 0);

        buttonImage2.setColor(Color.MAGENTA);
        buttonImage2.fillRect(0, 0, 100, 50);

        text2.setColor(Color.BLACK);
        text2.setFont(new Font("Helvetica", Font.BOLD, 30));
        text2.drawString("" + value, text1.getWidth()/3 + 1, text1.getHeight() / 2 + 8);
        buttonImage2.drawImage(text2, 0, 0);

        setImage(buttonImage1);
    }

    public Button(Color noClick, Color click, int v)
    {
        GreenfootImage text1 = new GreenfootImage(100,50);
        GreenfootImage text2 = new GreenfootImage(100,50);
        value = v;

        buttonImage1.setColor(noClick);
        buttonImage1.fillRect(0, 0, 100, 50);

        text1.setColor(Color.WHITE);
        text1.setFont(new Font("Helvetica", Font.BOLD, 30));
        text1.drawString("" + value, text1.getWidth()/3 + 1, text1.getHeight() / 2 + 8);
        buttonImage1.drawImage(text1, 0, 0);

        buttonImage2.setColor(click);
        buttonImage2.fillRect(0, 0, 100, 50);

        text2.setColor(Color.BLACK);
        text2.setFont(new Font("Helvetica", Font.BOLD, 30));
        text2.drawString("" + value, text1.getWidth()/3 + 1, text1.getHeight() / 2 + 8);
        buttonImage2.drawImage(text2, 0, 0);

        setImage(buttonImage1);
    }

    /**
     * act gets a reference to our healthBar object and also checks if the mouse is pressed
     * and sets the image to buttonImage2 so it just changes colour. If the mouse is clicked 
     * on the other hand it adds or subtracts score accordingly.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        HealthBar bar = getWorld().getObjects(HealthBar.class).get(0);
        if(Greenfoot.mousePressed(this))
        {
            setImage(buttonImage2);
            justClicked = true;
        }
        else if(Greenfoot.mouseClicked(this))
        {
            setImage(buttonImage1);
            if(justClicked == true)
            {
                bar.add(value);
                justClicked = false;
            }
        }
    }    
}
