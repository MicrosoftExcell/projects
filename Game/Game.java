
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Game
{
    // instance variables - replace the example below with your own
    public static int upper;
    public static int guesses;
    private int num;
    private int target;
    private BufferedReader reader;
    
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        reader = new BufferedReader(new InputStreamReader(System.in));
        
    }
    
    public void guess() throws IOException{
        System.out.print( "Please enter your guess: " );
        int num = Integer.parseInt(reader.readLine());
        if (num==target){
            System.out.println("YOU WON");
        }
        else if (num<target){
            System.out.println("TOO LOW");
        }
        else if (num>target){
            System.out.println("TOO HIGH");
        }
        GameManager.changeTotal1();
        guesses+=1;
    }
    
    public void newGame(){
        GameManager.changeGames1();
        upper = 10;
        guesses=0;
        target = (int)(Math.random()*upper+1);
    }
    
    
    
    
}
