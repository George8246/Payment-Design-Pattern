package paymentmodule;

public abstract class Payment {

    protected float amount;
    protected IauthorizeBehavior authorizeBehavior;
    protected IprintBehavior printBehavior;

    public Payment(float amount) {
        this.amount = amount;
    }

}
