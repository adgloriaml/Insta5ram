public class Bachelor extends Student {
    private int closedCredits;
    
    private final int NeedCreditNumber = 250;
    
    public Bachelor(String name, String surname, String username, String password, Faculty studentFaculty, int studyYear, int GPA, Degree studentDegree) {
      super(name, surname, username, password, studentFaculty, studyYear, GPA, studentDegree);
      this.closedCredits = 0;
    }
    
    public int viewCredits() {
      return this.closedCredits;
    }
    
    public void graduate() {
      // Check if closedCredits equals NeedCreditNumber
      if (this.closedCredits == this.NeedCreditNumber) {
        // Add this user to the Master class
        Master master = new Master(this.getName(), this.getSurname(), this.getUsername(), this.getPassword(), this.StudentFaculty, this.StudyYear, this.GPA, Degree.Master);
      }
    }
  }
  