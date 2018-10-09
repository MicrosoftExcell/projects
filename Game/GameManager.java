
/**
 * Write a description of class GameManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameManager
{
    // instance variables - replace the example below with your own
    private int average1;
    public static int total1;
    public static int games1;
    private int score1;
    private int score2;
    
    /**
     * Constructor for objects of class GameManager
     */
    public GameManager()
    {
    }
    public void mean(){
        average1 = (int)(total1/games1);
        System.out.println(average1);
    }
    
    public static void changeTotal1(){
        total1+=1;
    }
    
    public static void changeGames1(){
        games1+=1;
    }
    
    public void winner(){
        if (ComputerPlayer.guesses>Game.guesses){
            System.out.println("Human Won");
            score1+=1;
        }
        else if (Game.guesses>ComputerPlayer.guesses){
            System.out.println("Computer Won");
            score2+=1;
        }
    }
    
    public void harder(){
        if (score1>(2*score2)){
            Game.upper *= 2;
        }
        else if (score2>(2*score1)){
            ComputerPlayer.upper *= 2;
        }
    }
}
