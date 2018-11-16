import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    int perCent = Greenfoot.getRandomNumber(0,200);
    public Frog()
   {        
    // set the Frog's speed to a random number between 4 and 8
    move(16);
   }
    
    public void act() 
   {
    // make the Frog move at its speed, in the direction it is facing
        if(perCent <= 35)
        {
            turn (-15);
        }
        else if(perCent >= 35 && perCent <= 70)
        {
            turn (15);
        }
        else
        {
            turn(0);
        }
     /*
      * Make the frog turn off course 35% of the time.
      * It will turn left or right 15 degrees equally as often. 
      */ 
        
     /*
      * If the frog is near an edge of the world, make it turn
      * 7 degrees to the right. 
      * 
      * Hint: use the atEdgeOfWorld method in the Creature class.
      */
        
        
     /*
      * If the frog encounters the fly, the game ends, so
      * stop the scenario 
      */ 
     
     {
        
        
        }    
 }
}