package Bank;

public class Main {

    public static void main(String[] args) {
        Icici icici = new Icici(13f, 1000, 2);
        Sbi sbi = new Sbi(10f, 200, 1);
        Boi boi = new Boi(7f, 50000, 10);

        icici.getDeatils();
        sbi.getDeatils();
        boi.getDeatils();
    }

}
