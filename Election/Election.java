/**
 * Write a description of class Election here.
 * 
 * @author Elizabeth Excell
 * @version December 2017
 */
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class Election implements ElectionInterface
{
    private Set<ConstituencyInterface> constituencies = new HashSet<ConstituencyInterface>();
    private Set<CandidateInterface> candidates = new HashSet<CandidateInterface>();
    private Set<PartyInterface> parties = new HashSet<PartyInterface>();
    private PartyInterface party;
    private PartyInterface victor;
    private ConstituencyInterface constituency;
    private String name;
    private int count;
    private int temp;
    private double percent;
    
    public Election(String name)
    {
        this.name = name;
    }
    
    public Set<ConstituencyInterface> getConstituencies(){
        return constituencies;
    }
    
    public void addConstituency(ConstituencyInterface constituency){
        this.constituency = constituency;
        constituencies.add((ConstituencyInterface) constituency);
        candidates = constituency.getCandidates();
        ArrayList<CandidateInterface> candidatelist = new ArrayList<CandidateInterface>(candidates);
        for (int i=0;i<candidatelist.size();i++){
            if (!parties.contains(candidatelist.get(i).getParty())){
                parties.add((PartyInterface) candidatelist.get(i).getParty());
            }
        }
    }
    
    public String getName(){
        return name;
    }
    
    public Set<PartyInterface> getParties(){
        return parties;
    }
    
    public int seatCount(PartyInterface party){
        ArrayList<ConstituencyInterface> constitlist = new ArrayList<ConstituencyInterface>(constituencies);
        count = 0;
        this.party = party;
        for (int i=0;i<constitlist.size();i++){
            if (constitlist.get(i).winner().getParty()==party){
                count+=1;
            }
        }
        return count;
    }
    
    public PartyInterface winner(){
        ArrayList<PartyInterface> partylist = new ArrayList<PartyInterface>(parties);
        temp = 0;
        for (int i=0;i<partylist.size();i++){
            party = partylist.get(i);
            if (seatCount((PartyInterface) party) > temp){
                temp = seatCount((PartyInterface) party);
                victor = party;
            }
        }
        return victor;
    }
    
    public CandidateInterface leader(){
        party = winner();
        ArrayList<ConstituencyInterface> constitlist = new ArrayList<ConstituencyInterface>(constituencies);
        System.out.println(seatCount((PartyInterface) party));
        System.out.println(constitlist.size());
        percent = (100*seatCount((PartyInterface) party))/constitlist.size();
        System.out.println(percent);
        if (percent>50){
            System.out.println(party.getLeader());
            return party.getLeader();
        }
        else {
            return null;
        }
    }
    
}

