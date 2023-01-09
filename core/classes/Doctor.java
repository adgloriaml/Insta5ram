public class Doctor extends Student {
    private int numOfAccreditateWorks;
    
    public Doctor(String name, String surname, String username, String password, Faculty studentFaculty, int studyYear, int GPA, Degree studentDegree) {
      super(name, surname, username, password, studentFaculty, studyYear, GPA, studentDegree);
      this.numOfAccreditateWorks = 0;
    }
    
    public int viewNumOfAccreditateWorks() {
      return this.numOfAccreditateWorks;
    }
    
    public void graduate() {
      // Some code to graduate the Doctor
    }
  }
  