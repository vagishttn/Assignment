/*Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
 */

package JavaSession1.Bank;

public class Bank {

    private float rateOfInterest;
    private int customers;
    private int branches;

    public Bank(float rateOfInterest, int customers, int branches) {
        this.rateOfInterest = rateOfInterest;
        this.customers = customers;
        this.branches = branches;
    }

    public void getDeatils() {
        System.out.println(
                "rateOfInterest=" + rateOfInterest +
                        ", customers=" + customers +
                        ", branches=" + branches);
    }
}
