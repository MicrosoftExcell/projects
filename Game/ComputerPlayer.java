

/**
 * Write a description of class ComputerPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComputerPlayer
{
    public static int upper;
    private int num;
    private int target;
    public static int guesses;
    
    public ComputerPlayer()
    {
        // initialise instance variables
        
    }
    
    public void newGuess(){
        guesses+=1;
        num = (int)(Math.random()*upper+1);
        if (num<target){
            lower();
        }
        else if (num>target){
            higher();
        }
        else if (num==target){
            equal();
        }
    }
    
    public void lower(){
        newGuess();
    }
    
    public void higher(){
        upper = num-1;
        newGuess();
    }
    
    public void equal(){
        System.out.println("Guesses: "+guesses);
    }
    
    public void newGame(){
        guesses = 0;
        upper = 10;
        target = (int)(Math.random()*upper+1);
        newGuess();
    }
}