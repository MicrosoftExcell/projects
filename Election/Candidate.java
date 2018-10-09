
/**
 * Write a description of class Candidate here.
 * 
 * @author Elizabeth Excell 
 * @version December 2017
 */
public class Candidate implements CandidateInterface
{
    public PartyInterface party;
    public String name;
    
    public Candidate(String name)
    {
        this.name = name;
    }
    
    public PartyInterface getParty(){
        return party;
    }
    
    public void setParty(PartyInterface party){
        this.party = party;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isIndependent(){
        if (party==null){
            return true;
        }
        else{
            return false;
        }
    }

}