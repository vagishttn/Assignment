public class EnumQuestion {

    public static void main(String[] args) {

        System.out.println("----------House Data---------");
        for (House house : House.values()
        ) {
            System.out.println("House Name -> " + house + " ...... House Price -> Rs " + house.getHousePrice());
        }

    }

}
