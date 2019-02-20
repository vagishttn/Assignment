package JavaSession1;

public class EnumQuestion {

    public static void main(String[] args) {

        System.out.println("----------JavaSession1.House Data---------");
        for (House house : House.values()
        ) {
            System.out.println("JavaSession1.House Name -> " + house + " ...... JavaSession1.House Price -> Rs " + house.getHousePrice());
        }

    }

}
