
public class Disk extends Item
{
    private int time;
    
    public Disk(String theTitle, int time)
    {
        super(theTitle);
        this.time = time;
    }

    public int getTime()
    {
        return time;
    }
    
    public void print()
    {
        super.print() ;
        System.out.println("playing time: " + time );
    }
}
