import java.util.ArrayList;
import java.util.List;

public class RecruitTeam {
    private List<Candidate> candidates = new ArrayList<>();

  
    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

 
    public List<Candidate> calculateFinalMarks() {
        List<Candidate> eligibleCandidates = new ArrayList<>();
        List<Candidate> noteligibleCandidates = new ArrayList<>();
        for (Candidate candidate : candidates) {
           
            if (candidate.getPcmPcbAverage() >= 50 && candidate.getUgCgpa() >= 8
                    && candidate.getPgCgpa() >= 8
                    && candidate.isFullTime() && candidate.isIndianCitizen()
                    && candidate.getDob().compareTo("1999-07-01") >= 0) {
                eligibleCandidates.add(candidate);
            } else {
                noteligibleCandidates.add(candidate);

            }
        }
        return eligibleCandidates;
    }
}
