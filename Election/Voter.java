
/**
 * Write a description of class Voter here.
 * 
 * @author Elizabeth Excell 
 * @version December 2017
 */
public class Voter implements VoterInterface
{
    private String postcode;
    private String name;
    
    public Voter(String name)
    {
        this.name = name;
    }
    
    public String getPostcode(){
        return postcode;
    }
    
    public void setPostcode(String postcode){
        this.postcode = postcode;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

}
