
public class FracItem extends Item
{
    private String measure;
    private String name;

    public FracItem(String ID, String itemName, int percent, double pricePerUnit, String unitMeasure)
    {
        super(ID, itemName, percent, pricePerUnit);
        measure = unitMeasure;
        name = itemName;
    }

    public String getMeasure()
    {
        return measure;
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
        super.print() ;
        System.out.println("unit measure: " + measure );
    }
}
