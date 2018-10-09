import java.util.ArrayList;
import java.util.Collections;
public class Bank
{
    public static String name;
    public static String age;
    private int high;
    private int index;
    private int add;
    private double mean;
    private double sum;
    private double stan;
    private int middle;
    private int count1;
    private int count2;
    private int num;
    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> ages = new ArrayList<String>();
    private ArrayList<String> adults = new ArrayList<String>();
    private ArrayList<Integer> oldest = new ArrayList<Integer>();
    private ArrayList<Integer> sorted = new ArrayList<Integer>();
    private ArrayList<String> young = new ArrayList<String>();
    
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
    
    public int oldestAge(){
        high = 0;
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            if (temp>high){
                high = temp;
            }
        }
       return high;
    }
    
    public String nameOldest(){
        index = 0;
        high = 0;
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            if (temp>high){
                high = temp;
                index = i;
            }
        }
       return names.get(index);
    }
    
    public int total(){
        add = 0;
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            add+= temp;
        }
        return add;
    }
    
    public double average(){
        add = 0;
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            add+= temp;
        }
        mean = add/ages.size();
        return mean;
    }
    
    public double standardDev(){
        add = 0;
        sum = 0;
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            add+= temp;
        }
        mean = add/ages.size();
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            sum+= Math.pow(temp-mean,2);
        }
        stan = Math.sqrt(sum/ages.size());
        return stan;
    }
    
    public void allMethods(){
        oldestAge();
        System.out.println(high);
        nameOldest();
        System.out.println(names.get(index));
        total();
        System.out.println(add);
        average();
        System.out.println(mean);
        standardDev();
        System.out.println(stan);
    }
    
    public ArrayList<String> adultList(){
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            if (temp>17){
                adults.add((String) names.get(i));
            }
        }
        for(int i=0; i<adults.size(); i++){
            System.out.println(adults.get(i));
        }
        return adults;
    }
    
    public ArrayList<Integer> nameOldestPeople(){
        index = 0;
        high = 0;
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            if (temp>high){
                high = temp;
                index = i;
                oldest.clear();
                oldest.add((Integer) index);
            }
            else if (temp==high){
                index = i;
                oldest.add((Integer) index);
            }
        }
        for(int i=0; i<oldest.size(); i++){
            System.out.println(names.get(oldest.get(i)));
        }
       return oldest;
    }
    
    public ArrayList<String> notOld(){
        index = 0;
        high = 0;
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            if (temp>high){
                high = temp;
                index = i;
            }
        }
        for(int i=0; i<ages.size(); i++){
            if (i!= index){
                young.add((String) names.get(i));
            }
        }
        for(int i=0; i<young.size(); i++){
            System.out.println(young.get(i));
        }
        return young;
    }
    
    public int median(){
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            sorted.add((Integer) temp);
        }
        Collections.sort(sorted);
        middle = sorted.size()/2;
        return sorted.get(middle);
    }
    
    public int mode(){
        count1 = 0;
        count2 = 0;
        num = 0;
        for(int i=0; i<ages.size(); i++){
            int temp = Integer.parseInt(ages.get(i));
            sorted.add((Integer) temp);
        }
        Collections.sort(sorted);
        for(int i=1; i<ages.size(); i++){
            if (sorted.get(i-1)==sorted.get(i)){
                count1+=1;
                if (count1>count2){
                    count2=count1;
                    num = sorted.get(i-1);
                    count1=1; 
                }
            }
            else if (count1>count2){
                    count2=count1;
                    num = sorted.get(i-1);
                    count1=1;                 
            }
            else {
                count1=1;
            }
        }
        return num;
    }
    
    public void printList(){
        for (int i=0; i<names.size(); i++){
            System.out.println("Name: " + names.get(i) + ", age: " + ages.get(i));
        }
    }
}