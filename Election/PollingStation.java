
/**
 * Write a description of class PollingStation here.
 * 
 * @author Elizabeth Excell 
 * @version December 2017
 */
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class PollingStation implements PollingStationInterface
{
    private Set<VoteInterface> votes = new HashSet<VoteInterface>();
    private Set<VoterInterface> voters = new HashSet<VoterInterface>();
    private String address;
    private String name;
    private int count;
    private VoterInterface voter;
    private VoteInterface vote;
    private CandidateInterface candidate;
    private ArrayList<VoterInterface> voterlist = new ArrayList<VoterInterface>();
    
    public PollingStation(String name)
    {
        this.name = name;
    }

    public Set<VoteInterface> getVotes(){
        return votes;
    }
    
    public boolean canVote(VoterInterface voter){
        if (voters.contains(voter)==true && !voterlist.contains(voter)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void vote(VoteInterface vote, VoterInterface voter){
        this.vote = vote;
        votes.add((VoteInterface) vote);
        this.voter = voter;
        voterlist.add((VoterInterface) voter);
    }
    
    public Set<VoterInterface> getVoters(){
        return voters;
    }
    
    public void addVoter(VoterInterface voter){
        this.voter = voter;
        voters.add((VoterInterface) voter);
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int voteCount(CandidateInterface candidate){
        ArrayList<VoteInterface> votelist = new ArrayList<VoteInterface>(votes);
        count = 0;
        this.candidate = candidate;
        for (int i=0;i<votelist.size();i++){
            if (votelist.get(i).getCandidate()==candidate){
                count+=1;
            }
        }
        return count;
    }
}
