import java.util.ArrayList;

/**
 * The database class provides a facility to store entertainment
 * item objects. A list of all items can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list()
    {
        for(Item item : items) {
            item.print();
            System.out.println();   // empty line between items
        }
    }
    
    
    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void createDatabase()
    {
        CD item ;
        
        item = new CD( "Lungs", "Florence", 10, 100 ) ;
        item.setComment("Breathes easily" ) ;
        this.addItem( item ) ;
        
        item = new CD( "My Worlds", "Justin", 10, 100 ) ;
        item.setComment("Why ???" ) ;
        this.addItem( item ) ;
        
        DVD item1;
        
        item1 = new DVD("A New Hope", "George Lucas", 120);
        item1.setComment("Epic");
        this.addItem(item1);
        
        item1 = new DVD("Empire Strikes Back", "George Lucas", 110);
        item1.setComment("More Epic");
        this.addItem(item1);
        
        item1 = new DVD("Return of the Jedi", "George Lucas", 140);
        item1.setComment("Most Epic");
        this.addItem(item1);
        
        VideoGame item2;
        
        item2 = new VideoGame("Skyrim", "Playstation",1);
        item2.setComment("Best game ever");
        this.addItem(item2);
        
        item2 = new VideoGame("GTAV", "PC",5);
        item2.setComment("Violent");
        this.addItem(item2);
        
        item2 = new VideoGame("Overcooked", "XBox",4);
        item2.setComment("Saucy");
        this.addItem(item2);
    }
}
