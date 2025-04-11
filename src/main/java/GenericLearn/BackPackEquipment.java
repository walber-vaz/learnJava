package GenericLearn;

import java.util.ArrayList;
import java.util.List;

public class BackPackEquipment<T> {

  private List<T> equipments;

  public BackPackEquipment() {
    this.equipments = new ArrayList<>();
  }

  public List<T> getEquipments() {
    return equipments;
  }

  public void setEquipments(List<T> equipments) {
    this.equipments = equipments;
  }

  public void addEquipment(T equipment) {
    this.equipments.add(equipment);
  }

  @Override
  public String toString() {
    return "BackPackEquipment: " + equipments.toString();
  }
}
