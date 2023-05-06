import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Derek
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Label title;
    
    public MenuButton button1;
    public MenuButton button2;
    
   
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        addObjects();
    }
    
    private void addObjects()
    {
        title = new Label("My World", 32);
        addObject(title,200, 100);    
        
        button1 = new MenuButton("Option 1", new Scene1());
        button2 = new MenuButton("Option 2", new Scene2());
        
        addObject(button1, 210, 200);
        addObject(button2, 210, 300);
    }
    
}
