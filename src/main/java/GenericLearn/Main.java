package GenericLearn;

public class Main {

  public static void main(String[] args) {
    Equipments equipment = new Equipments("Hummer");
    Equipments equipment2 = new Equipments("Saw");
    Equipments equipment3 = new Equipments("Drill");

    BackPackEquipment<Equipments> backPack = new BackPackEquipment<>();
    backPack.addEquipment(equipment);
    backPack.addEquipment(equipment2);
    backPack.addEquipment(equipment3);

    System.out.println(backPack);
  }
}
