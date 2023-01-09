public class User {
    private String name;
    private String surname;
    private String username;
    private String password;
    private int id;
    private boolean logged;
  
    public User(String name, String surname, String username, String password) {
      this.name = name;
      this.surname = surname;
      this.username = username;
      this.password = password;
      this.id = 0;
      this.logged = false;
    }
  
    public String getName() {
      return this.name;
    }
  
    public String getSurname() {
      return this.surname;
    }
  
    public String getUsername() {
      return this.username;
    }
  
    public String getPassword() {
      return this.password;
    }
  
    public String getFullName() {
      return this.name + " " + this.surname;
    }
  
    public int getID() {
      return this.id;
    }
  
    public boolean getLogged() {
      return this.logged;
    }
  
    public void setID(int id) {
      this.id = id;
    }
  
    public void setPassword(String oldPassword, String newPassword) {
      if (this.password.equals(oldPassword)) {
        this.password = newPassword;
      }
    }
  
    public void setLogged(boolean logged) {
      this.logged = logged;
    }
  
    public void login() {
      this.logged = true;
    }
  
    public void logout() {
      this.logged = false;
    }
  
    public String toString() {
      return "Name: " + this.name + ", Surname: " + this.surname + ", Username: " + this.username + ", ID: " + this.id + ", Logged: " + this.logged;
    }
    public int compareTo(User other) {
      
      int compare = this.name.compareTo(other.getName());
      
      
      if (compare == 0) {
        compare = this.surname.compareTo(other.getSurname());
        
        
        if (compare == 0) {
          compare = this.username.compareTo(other.getUsername());
        }
      }
      
      return compare;
    }
    
  }

  /*
   * The toString method returns a string representation of the User object. 
   * This method is automatically called when an object is used in a string context, 
   * such as when it is printed to the console or concatenated to another string. 
   * In this implementation, the toString method returns a string that includes the user's name, surname, username, 
   * ID, and logged status.
*/

/*
 * In the User class that I provided, 
 * the setLogged method is a setter method that allows you to change the value of the logged attribute. 
 * The logged attribute is a boolean that indicates whether the user is currently logged in or not.
*/

