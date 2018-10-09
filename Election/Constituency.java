
/**
 * Write a description of class Constituency here.
 * 
 * @author Elizabeth Excell
 * @version December 2017
 */
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class Constituency implements ConstituencyInterface
{
    private Set<CandidateInterface> candidates = new HashSet<CandidateInterface>();
    private Set<PollingStationInterface> stations = new HashSet<PollingStationInterface>();
    private CandidateInterface candidate;
    private PollingStationInterface pollingStation;
    private String name;
    private int count;
    private int temp;
    private CandidateInterface victor;
    
    public Constituency(String name)
    {
        this.name = name;
    }
    
    public Set<CandidateInterface> getCandidates(){
        return candidates;
    }
    
    public void addCandidate(CandidateInterface candidate){
        this.candidate = candidate;
        candidates.add((CandidateInterface) candidate);
    }

    public Set<PollingStationInterface> getPollingStations(){
        return stations;
    }
    
    public void addPollingStation(PollingStationInterface pollingStation){
        this.pollingStation = pollingStation;
        stations.add((PollingStationInterface) pollingStation);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int voteCount(CandidateInterface candidate){
        ArrayList<PollingStationInterface> stationlist = new ArrayList<PollingStationInterface>(stations);
        count = 0;
        this.candidate = candidate;
        for (int i=0;i<stationlist.size();i++){
            count+= stationlist.get(i).voteCount((CandidateInterface) candidate);            
        }
        return count;
    }
    
    public CandidateInterface winner(){
        ArrayList<CandidateInterface> candidatelist = new ArrayList<CandidateInterface>(candidates);
        temp = 0;
        for (int i=0;i<candidatelist.size();i++){
            candidate = candidatelist.get(i);
            if (voteCount((CandidateInterface) candidate) > temp){
                temp = voteCount((CandidateInterface) candidate);
                victor = candidate;
            }
        }
        return victor;
    }
}

