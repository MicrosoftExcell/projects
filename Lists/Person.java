public class Person
{
    public static String name;
    public static int age;
    public Person()
    {
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
   
}