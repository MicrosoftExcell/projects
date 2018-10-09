

import java.util.ArrayList;
public class Bank
{
    public static String name;
    public static String age;
    public static String gender;
    public static String number;
    public static String balance;
    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> ages = new ArrayList<String>();
    public static ArrayList<String> genders = new ArrayList<String>();
    public static ArrayList<String> numbers = new ArrayList<String>();
    public static ArrayList<String> balances = new ArrayList<String>();
    
    public Bank()
    {
       
    }
    
    public static void addToNames(){
        name = Person.getName();
        names.add((String) name);
    }
    
    public static void addToAges(){
        age = String.valueOf(Person.getAge());
        ages.add((String) age);
    }
    
    public static void addToGenders(){
        gender = String.valueOf(Person.getGender());
        genders.add((String) gender);
    }
    
    public static void addToNumbers(){
        number = Account.getNumber();
        numbers.add((String) number);
    }
    
    public static void addToBalances(){
        balance = String.valueOf(Account.getBalance());
        balances.add((String) balance);
    }
    
    public void printList(){
        for (int i=0; i<names.size(); i++){
            System.out.println("Name: " + names.get(i) + ", age: " + ages.get(i) + ", gender: " + genders.get(i) + ", account number: " + numbers.get(i)+ ", balance: " + balances.get(i));
        }
    }
   
    
}