package session2.furniture.shop;

public class Main {

    public static void main(String[] args) {
        Table table = new Table(1000, "Black", "ABCD", new FurnitureMaterial("Wooden", "Not Fire Resistant", "Stress Resistant"));
        Table table1 = new Table(2000, "Brown", "EFGH", new FurnitureMaterial("Metal", "Fire Resistant", "Stress Resistant"));

        System.out.println(table.getMaterial().getMaterialType() + " Table is : " + table.getMaterial().getFireBehaviour());
        System.out.println(table1.getMaterial().getMaterialType() + " Table is : " + table.getMaterial().getStressBehaviour());

        Chair chair = new Chair(600, "Blue", "EFGH", new FurnitureMaterial("Wooden", "Not Fire Resistant", "Stress Resistant"));
        Chair chair1 = new Chair(800, "White", "ABCD", new FurnitureMaterial("Metal", "Fire Resistant", "Stress Resistant"));

        System.out.println(chair.getMaterial().getMaterialType() + " Chair is : " + chair.getMaterial().getStressBehaviour());
        System.out.println(chair1.getMaterial().getMaterialType() + " Chair is : " + chair.getMaterial().getFireBehaviour());
    }
}
