import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene2 extends World
{
   public Label title;
   
    /**
     * Constructor for objects of class Scene2.
     * 
     */
    public Scene2()
    {
        super(800, 600, 1);  
        title = new Label("Scene 2", 40);
        addObject(title, 100, 100);
    }
}
