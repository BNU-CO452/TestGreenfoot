import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene1 extends World
{
    public Label title;
    
    /**
     * Constructor for objects of class Scene1.
     * 
     */
    public Scene1()
    {
        super(800, 600, 1);  
        title = new Label("Scene 1", 40);
        addObject(title, 100, 100);
        
        //MenuButton button = new MenuButton("Start Screen", new MyWorld());
        //addObject(button, 550, 350);

    }
    
    
}
