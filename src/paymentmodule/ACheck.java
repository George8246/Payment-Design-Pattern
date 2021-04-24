package paymentmodule;

public class ACheck implements IauthorizeBehavior {

    @Override
    public void authorized() {
        System.out.println("authorized the check");
    }

}
