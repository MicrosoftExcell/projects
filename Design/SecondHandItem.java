
public class SecondHandItem extends WholeItem
{
    private double grade;
    private String name;
    private double afterDiscount;
    private double VAT;
    private double afterVAT;
    private double price;
    
    public SecondHandItem(String ID, String itemName, double percent, double pricePerUnit, boolean secondHand, double grade)
    {
        super(ID,itemName,percent,pricePerUnit,secondHand);
        this.grade = grade;
        name = itemName;
        VAT = percent;
        price = pricePerUnit;
        afterDiscount = 0.0;
        afterVAT = 0.0;
    }

    public double getGrade(){
        return grade;
    }
    
    public void select(){
        Basket.addItem((String) name);
        Basket.addPriceBefore((double) priceBeforeVAT());
        Basket.addPriceAfter((double) priceAfterVAT());
    }
    
    public double priceBeforeVAT(){
        if (grade == 4){ 
            afterDiscount = price*0.5;
        }
        else if (grade == 5){
            afterDiscount = price*0.3;
        }
        else{
            afterDiscount = price - (price*(grade/10));
        }
        return afterDiscount;
    }
    
    public double priceAfterVAT(){
        afterDiscount = priceBeforeVAT();
        afterVAT = afterDiscount + (afterDiscount*(VAT/100));
        return afterVAT;
    }
    
    public void print()
    {
        super.print();
        System.out.println("grade: " + grade);
    }
}
