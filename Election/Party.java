/**
 * Write a description of class Party here.
 * 
 * @author Elizabeth Excell 
 * @version December 2017
 */
public class Party implements PartyInterface
{
    public String name;
    public CandidateInterface leader;
    
    public Party(String name)
    {
        this.name = name;
    }
    
    public CandidateInterface getLeader(){
        return leader;
    }
    
    public void setLeader(CandidateInterface leader){
        this.leader = leader;
    }
    
    public String getName(){
        return name;
    }
    
}
