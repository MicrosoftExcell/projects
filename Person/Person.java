public class Person
{
    // instance variables - replace the example below with your own
    public static String name;
    public static int age;
    public static char gender;

    public Person()
    {
        // initialise instance variables
    }
    
    public static String getName(){
        return name;
    }
    
    public void setName(String a){
        name=a;
        Bank.addToNames();
    }
    
    public static int getAge(){
       return age;
    }
    
    public void setAge(int b){
        age=b;
        Bank.addToAges();
    }
    
    public static char getGender(){
        return gender;
    }
    
    public void setGender(char c){
        gender=c;
        Bank.addToGenders();
    }
    
    public String toString(){
        return name + " is " + age +"years old and " + gender ;
    }
}
