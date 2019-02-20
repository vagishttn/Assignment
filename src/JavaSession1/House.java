package JavaSession1;/*Question 9: Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)*/

enum House {

    DDA(100000),DLF(2000000),SKYLINE(3000000);
    private long housePrice;

    House(long housePrice) {
        this.housePrice = housePrice;
    }

    public long getHousePrice() {
        return housePrice;
    }
}

