package ObjectOrientation;

public class Customer extends Role implements CustomerInterface {

  @Override
  public void myRole() {
    System.out.println("I am a customer" + name + " " + nameRole);
  }
}
