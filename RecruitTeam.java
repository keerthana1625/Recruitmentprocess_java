import java.util.ArrayList;
import java.util.List;

public class RecruitTeam {
    private List<Candidate> candidates = new ArrayList<>();

    // Method to add a candidate to the list
    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    // Method to calculate the final marks of each candidate and add them to the HR
    // team's list
    public List<Candidate> calculateFinalMarks() {
        List<Candidate> eligibleCandidates = new ArrayList<>();
        List<Candidate> noteligibleCandidates = new ArrayList<>();
        for (Candidate candidate : candidates) {
            // double finalMarks = (candidate.getHscAggregate() * 0.5) +
            // (candidate.getInterviewScore() * 0.35)
            // + (candidate.getNumProjects() * 0.15);
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
