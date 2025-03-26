package ObjectOrientation;

public class Role extends Person {
  String nameRole;

  public void sayRole() {
    System.out.println("I am a " + nameRole);
  }

  @Override
  public String displayAge() {
    return "I am a role";
  }

  @Override
  public int calculateAge() {
    return 0;
  }
}
