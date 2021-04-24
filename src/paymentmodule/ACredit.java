package paymentmodule;

public class ACredit implements IauthorizeBehavior{

    @Override
    public void authorized() {
        System.out.println("authorize Credit");
    }
    
}
