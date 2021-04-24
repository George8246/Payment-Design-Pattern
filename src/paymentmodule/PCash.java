package paymentmodule;

public class PCash implements IprintBehavior{

    @Override
    public void printReceipt(float A) {
        System.out.println("printing the receipt for cash amount: " + A);
    }
    
}
