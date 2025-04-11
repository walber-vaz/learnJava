package GenericLearn;

public class Equipments {

  private String name;

  public Equipments(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Equipments: " + name;
  }
}
