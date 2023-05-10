import java.util.List;

public class Main {
        public static void main(String[] args) {

                Candidate candidate1 = new Candidate("Keerthana", "1998-05-21", "john@gmail.com", "1234567890", 75, 65, 9,
                                8.5, 3,
                                true, 40, true);
                Candidate candidate2 = new Candidate("Sri", "2000-09-10", "mary@gmail.com", "2345678901", 80, 55, 8, 8,
                                2,
                                true, 50, true);

                Candidate candidate3 = new Candidate("pavithra", "2000-09-10", "mary@gmail.com", "2345678901", 70, 60, 8.5,
                                7, 1,
                                false, 30, true);
                Candidate candidate4 = new Candidate("Sam", "2002-02-14", "alice@gmail.com", "4567890123", 55, 50,
                                8.5, 8, 2,
                                true, 45, true);

                RecruitTeam recruitTeam = new RecruitTeam();
                HRTeam hrTeam = new HRTeam();

                recruitTeam.addCandidate(candidate1);

                recruitTeam.addCandidate(candidate2);

                recruitTeam.addCandidate(candidate3);
                recruitTeam.addCandidate(candidate4);

                List<Candidate> eligibleCandidates = recruitTeam.calculateFinalMarks();

                System.out.println("\n");
                hrTeam.informResult(eligibleCandidates);
                System.out.println("\n\n");
                hrTeam.printEligibleCandidatesDetails(eligibleCandidates);
                System.out.println("\n");
        }
}
