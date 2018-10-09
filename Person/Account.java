import java.util.ArrayList;
public class Account
{
    // instance variables - replace the example below with your own
    public static int balance;
    public static String number;
    public static String name;
    public static int age;
    public static char gender;
    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> ages = new ArrayList<String>();
    public static ArrayList<String> genders = new ArrayList<String>();
    public static String time;
    public static String date;
    public static String amount;
    public static String type;
    public static ArrayList<String> times = new ArrayList<String>();
    public static ArrayList<String> dates = new ArrayList<String>();
    public static ArrayList<String> amounts = new ArrayList<String>();
    public static ArrayList<String> types = new ArrayList<String>();
    
    public Account()
    {
        balance = 0;
        name = Person.getName();
        age = Person.getAge();
        gender = Person.getGender();
        
    }
    
    public static void addToTimes(){
        time = String.valueOf(Transaction.getTime());
        times.add((String) time);
    }
    
    public static void addToDates(){
        date = String.valueOf(Transaction.getDate());
        dates.add((String) date);
    }
    
    public static void addToAmounts(){
        amount = String.valueOf(Transaction.getAmount());
        amounts.add((String) amount);
    }
    
    public static void addToTypes(){
        type = String.valueOf(Transaction.getType());
        types.add((String) type);
    }
    
    public static int getBalance(){
        return balance;
    }
    
    public void setBalance(int a){
        balance=a;
        Bank.addToBalances();
    }
    
    public static String getNumber(){
        return number;
    }
    
    public void setNumber(String b){
        number=b;
        Bank.addToNumbers();
    }
}

