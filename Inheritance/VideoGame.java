
/**
 * Write a description of class VideoGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VideoGame extends Item
{
    private int numberOfPlayers;
    private String platform;

    public VideoGame(String theTitle, String thePlatform, int maxPlayers)
    {
       super(theTitle); 
       platform = thePlatform;
       numberOfPlayers = maxPlayers;
    }

    public int getNumberOfPlayers()
    {
        return numberOfPlayers;
    }
    
    public String getPlatform()
    {
        return platform;
    }
    
    public void print()
    {
        super.print() ;
        System.out.println("platform: " + platform );
        System.out.println("maximum players: " + numberOfPlayers );
    }
}
