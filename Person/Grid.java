import java.util.ArrayList;
public class Grid
{
    private ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();
    public ArrayList<String> empty = new ArrayList<String>();
    
    public Grid()
    {
        empty.add("");
        empty.add("");
        empty.add("");
        array.add(empty);
        array.add(empty);
        array.add(empty);      
    }
    
    public void addToGrid(String a, int x, int y){
        array.get(x).set(y,(String) a);
    }
    
    public void printGrid(){
        for (int i=0; i<3; i++){
            System.out.println(array.get(i).get(0) + array.get(i).get(1) + array.get(i).get(2));
        }
    }
    
    public void returnSquare(int x, int y){
        System.out.println(array.get(x).get(y));
    }

}
