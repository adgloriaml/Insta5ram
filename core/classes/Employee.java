public class Employee extends User {
    private Departments department;
    
    public Employee(String name, String surname, String username, String password, Departments department) {
      super(name, surname, username, password);
      this.department = department;
    }
    
    @Override
    public String toString() {
      // Return a string representation of the Employee object that includes the employee's name, surname, username, and department.
      return "Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Username: " + this.getUsername() + ", Department: " + this.department;
    }
    
    @Override
    public int hashCode() {
      // Return a hash code for the Employee object that takes into account the employee's username and department.
      return Objects.hash(this.getUsername(), this.department);
    }
    
    @Override
    public boolean equals(Object obj) {
      // Check if the given object is an Employee object and has the same username and department as this Employee object.
      if (obj instanceof Employee) {
        Employee other = (Employee) obj;
        return this.getUsername().equals(other.getUsername()) && this.department.equals(other.department);
      }
      return false;
    }
  }
  
