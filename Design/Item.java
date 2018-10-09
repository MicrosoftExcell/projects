public class Item
{
    private String referenceID;
    private String name;
    private double VAT;
    private String description;
    private static double priceBefore;
    private static double priceAfter;

    public Item(String ID, String itemName, double percent, double pricePerUnit)
    {
        referenceID = ID;
        name = itemName;
        VAT = percent;
        priceBefore = pricePerUnit;
        priceAfter = priceBefore + (priceBefore * (VAT/100));
        description = "";
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    
    public static double getPriceBefore(){
        return priceBefore;
    }
    
    public static double getPriceAfter(){
        return priceAfter;
    }
    
    public void select(){
        Basket.addItem((String) name);
        Basket.addPriceBefore((double) priceBefore);
        Basket.addPriceAfter((double) priceAfter);
    }
    
    public void print()
    {
        System.out.println("reference ID: " + referenceID);
        System.out.println("name: " + name);
        System.out.println("VAT value: " + VAT);
        System.out.println("price per unit before VAT: " + priceBefore);
        System.out.println("price per unit after VAT: " + priceAfter);
        System.out.println("Description:" + description);
    }
}
