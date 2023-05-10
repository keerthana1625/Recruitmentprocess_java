import java.util.List;

public class HRTeam {

    public void informResult(List<Candidate> eligibleCandidates) {

        for (Candidate candidate : eligibleCandidates) {

            System.out.println(candidate.getName() + " has been selected!");
        }
    }

    public void printEligibleCandidatesDetails(List<Candidate> candidates) {

        for (Candidate candidate : candidates) {

            System.out.println("Name: " + candidate.getName());
            System.out.println("Date of birth: " + candidate.getDob());
            System.out.println("HSC marks: " + candidate.getHscAggregate());
            System.out.println("UG CGPA: " + candidate.getUgCgpa());
            System.out.println("PG CGPA: " + candidate.getPgCgpa());
            System.out.println("Number of projects done: " + candidate.getNumProjects());
            System.out.println("Interview marks: " + candidate.getInterviewScore());

            System.out.println();

        }
    }
}
