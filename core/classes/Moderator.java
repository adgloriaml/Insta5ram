import java.util.Vector;

public class Moderator extends Employee {
  private Vector<User> bannedUsers;
  
  public Moderator(String name, String surname, String username, String password, Departments department) {
    super(name, surname, username, password, department);
    this.bannedUsers = new Vector<>();
  }

  public void banUser(User user) {
    // Add the given User object to the list of banned users
    this.bannedUsers.add(user);
  }
  
  public void editUser(User user) {
    // Remove the given User object from the list of banned users
    this.bannedUsers.remove(user);
  }
  
}
