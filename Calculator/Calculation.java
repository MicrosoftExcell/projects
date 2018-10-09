/**
 * Write a description of class Calculation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Calendar;
public class Calculation
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int hours;
    private int seconds;
    private int mean;
    private int max;
    private int temp;
    private String day;
    private String[] days;
    private String year;
    private int coins;
    private int dayOfWeek;
    /**
     * Constructor for objects of class Calculation
     */
    public Calculation(int d, int e)
    {
        // initialise instance variables
        x = d;
        y = e;
        coins = 0;
        
    }
    
    public void getX(){
        System.out.println(x);
    }
    
    public void setX(int f){
        x = f;
    }
    
    public void getY(){
        System.out.println(y);
    }
    
    public void setY(int g){
        y = g;
    }
    
    public void getHours() {
        hours = 24*7;
        System.out.println(hours);
    }
    
    public void getSeconds(){
        seconds = 365*24*60*60;
        System.out.println(seconds);
    }
    
    public void average(){
        mean  = (x+y)/2;
        System.out.println(mean);
    }
    
    public void maximum(){
        if (x>y){
            max = x;
        }
        else if (y>x){
            max = y;
        }
        else{
            max = x;
        }
        System.out.println(max);
    }
    
    public void swap(){
        temp = x;
        x = y;
        y = temp;
    }
    
    public void farenheit(){
        y = (int)(x*1.8);
        y+=32;
    }
    
    public void quadratic(int a, int b, int c){
        x = (int)((-b+ Math.sqrt((b*b)-4*a*c))/(2*a));
        y = (int)((-b- Math.sqrt((b*b)-4*a*c))/(2*a));
    }
    
    public void odd(int num){
        if (num%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
    
    public void date(String h){
        days = h.split("/");
        day = days[0];
        System.out.println(day);
        year = days[2];
        if (year.length()==2){
            System.out.println("20"+year);
        }
        else{
            System.out.println(year);
        }
    }
    
    public void money(int pence){
        if (pence>=50){
            coins=1;
            pence-=50;
        }
        while (pence>=20){
            coins+=1;
            pence-=20;
        }
        while (pence>=10){
            coins+=1;
            pence-=10;
        }
        while (pence>=5){
            coins+=1;
            pence-=5;
        }
        while (pence>=2){
            coins+=1;
            pence-=2;
        }
        while (pence>=1){
            coins+=1;
            pence-=1;
        }
        System.out.println(coins);
    }
    
    public void weekday(int da, int mo, int ye){
        Calendar c = Calendar.getInstance();
        c.set(ye, mo, da);
        dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek==1){
            System.out.println("Thursday");
        }
        else if (dayOfWeek==2){
            System.out.println("Friday");
        }
        else if (dayOfWeek==3){
            System.out.println("Saturday");
        }
        else if (dayOfWeek==4){
            System.out.println("Sunday");
        }
        else if (dayOfWeek==5){
            System.out.println("Monday");
        }
        else if (dayOfWeek==6){
            System.out.println("Tuesday");
        }
        else if (dayOfWeek==7){
            System.out.println("Wednesday");
        }
        
    }
}

