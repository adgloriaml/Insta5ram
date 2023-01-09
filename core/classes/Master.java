public class Master extends Student {
    private int numOfPublications;
    
    // Add a final variable named needNumOfPublications that equals 5
    private final int needNumOfPublications = 5;
    
    public Master(String name, String surname, String username, String password, Faculty studentFaculty, int studyYear, int GPA, Degree studentDegree) {
      super(name, surname, username, password, studentFaculty, studyYear, GPA, studentDegree);
      this.numOfPublications = 0;
    }
    
    public int viewNumOfPublications() {
      return this.numOfPublications;
    }
    
    // Rewrite the graduate method to check if numOfPublications equals needNumOfPublications
    public void graduate() {
      if (this.numOfPublications == this.needNumOfPublications) {
        // Add this user to the Doctor class
        Doctor doctor = new Doctor(this.getName(), this.getSurname(), this.getUsername(), this.getPassword(), this.StudentFaculty, this.StudyYear, this.GPA, Degree.Doctor);
      }
    }
  }
  