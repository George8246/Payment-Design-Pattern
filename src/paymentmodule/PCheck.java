package paymentmodule;

public class PCheck implements IprintBehavior {

    public void printReceipt(float A) {
        System.out.println("printing the receipt for Check amount: " + A);
    }
}
