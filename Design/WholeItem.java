
public class WholeItem extends Item
{
    private boolean secondHand;
    private String name;
    
    public WholeItem(String ID, String itemName, double percent, double pricePerUnit, boolean secondHand)
    {
        super(ID, itemName, percent, pricePerUnit);
        name = itemName;
        this.secondHand = secondHand;
    }

    public boolean getSecondHand()
    {
        return secondHand;
    }
    
    public void select(){
        Basket.addItem((String) name);
        Basket.addPriceBefore((double) Item.getPriceBefore());
        Basket.addPriceAfter((double) Item.getPriceAfter());
    }
    
    public double priceBeforeVAT(){
        return Item.getPriceBefore();
    }
    
    public double priceAfterVAT(){
        return Item.getPriceAfter();
    }

    public void print()
    {
        super.print();
        System.out.println("second-hand: " + secondHand);
    }
}
