
/**
 * Write a description of class Vote here.
 * 
 * @author Elizabeth Excell 
 * @version December 2017
 */
import java.util.ArrayList;
public class Vote implements VoteInterface
{
    private CandidateInterface candidate;
    private ArrayList<CandidateInterface> choices = new ArrayList<CandidateInterface>();
    
    public Vote()
    {
    }
    
    public void addCandidate(CandidateInterface candidate){
        this.candidate = candidate;
        choices.add((CandidateInterface) candidate);
    }
    
    public boolean isSpoiled(){
        if (choices.size()!=1){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public CandidateInterface getCandidate(){
        if (choices.size()==1){
            return choices.get(0);
        }
        else{
            return null;
        }
    }

}
