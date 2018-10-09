import java.util.ArrayList;

public class Basket
{
    private static ArrayList<String> names = new ArrayList<String>();
    private static ArrayList<Double> pricesBefore = new ArrayList<Double>();
    private static ArrayList<Double> pricesAfter = new ArrayList<Double>();
    private double totalBefore;
    private double totalAfter;
    
    public Basket()
    {
    }

    public static void addItem(String name)
    {
        names.add((String) name);
    }
    
    public static void addPriceBefore(double price){
        pricesBefore.add((double) price);
    }
    
    public static void addPriceAfter(double price){
        pricesAfter.add((double) price); 
    }
    
    public ArrayList<String> getBasket(){
        return names;
    }
    
    public double totalBeforeVAT(){
        for (int i=0; i<pricesBefore.size();i++){
            totalBefore+= pricesBefore.get(i);
        }
        return totalBefore;
    }
    
    public double totalAfterVAT(){
        for (int i=0; i<pricesAfter.size();i++){
            totalAfter+= pricesAfter.get(i);
        }
        return totalAfter;
    }
}
