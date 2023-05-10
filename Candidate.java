public class Candidate {
    private String name;
    private String dob;
    private String email;
    private String phone;
    private double hscAggregate;
    private double pcmPcbAverage;
    private double ugCgpa;
    private double pgCgpa;
    private int numProjects;
    private boolean isFullTime;
    private double interviewScore;
    private boolean isIndianCitizen;
    
    // Constructor
    public Candidate(String name, String dob, String email, String phone, double hscAggregate, 
                     double pcmPcbAverage, double ugCgpa, double pgCgpa, int numProjects, 
                     boolean isFullTime, double interviewScore, boolean isIndianCitizen) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.hscAggregate = hscAggregate;
        this.pcmPcbAverage = pcmPcbAverage;
        this.ugCgpa = ugCgpa;
        this.pgCgpa = pgCgpa;
        this.numProjects = numProjects;
        this.isFullTime = isFullTime;
        this.interviewScore = interviewScore;
        this.isIndianCitizen = isIndianCitizen;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public String getDob() {
        return dob;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public double getHscAggregate() {
        return hscAggregate;
    }
    
    public double getPcmPcbAverage() {
        return pcmPcbAverage;
    }
    
    public double getUgCgpa() {
        return ugCgpa;
    }
    
    public double getPgCgpa() {
        return pgCgpa;
    }
    
    public int getNumProjects() {
        return numProjects;
    }
    
    public boolean isFullTime() {
        return isFullTime;
    }
    
    public double getInterviewScore() {
        return interviewScore;
    }
    
    public boolean isIndianCitizen() {
        return isIndianCitizen;
    }
}
