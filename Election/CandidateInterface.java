
/**
 *
 * Interface for candidate in an election. Each candidate can belong to a party, or not (in which case they are referred to as an independent candidate).
 *
 * You should provide a constructor with a String name parameter
 *
 * @author Steven Bradley
 * @version December 2017
 **/

public interface CandidateInterface
{
    PartyInterface getParty();
    
    void setParty(PartyInterface party);
    
    String getName();

    /**
     * @return true if and only if the candidate is not associated with a party
     **/
    boolean isIndependent();
}
