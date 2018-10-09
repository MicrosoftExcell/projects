
public class Transaction
{
    public static String date;
    public static String time;
    public static int amount;
    public static char type;
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        amount=0;
    }
    
    public static String getTime(){
        return time;
    }
    
    public void setTime(String a){
        time=a;
        Account.addToTimes();
    }
    
    public static String getDate(){
        return date;
    }
    
    public void setDate(String b){
        date=b;
        Account.addToDates();
    }
    
    public static int getAmount(){
        return amount;
    }
    
    public void setAmount(int c){
        amount=c;
        Account.addToAmounts();
    }
    
    public static char getType(){
        return type;
    }
    
    public void setType(char d){
        type=d;
        Account.addToTypes();
    }
}