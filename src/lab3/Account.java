package lab3;

public class Account {

    private final RuntimeException CANCELLED_ACCOUNT_EXCEPTION = new IllegalStateException("Account is cancelled");

    private long amount;
    private boolean isCancelled;

    public Account(long amount) {
        this.amount = amount;
        this.isCancelled = false;
    }

    public long addMoneys(final long money) {
        if (isCancelled)
            throw CANCELLED_ACCOUNT_EXCEPTION;
        amount = amount + money;
        return amount;
    }

    public long subtractMoneys(final long money) {
        if (isCancelled)
            throw CANCELLED_ACCOUNT_EXCEPTION;
        amount = amount - money;
        return amount;
    }

    public void cancel() {
        isCancelled = true;
    }

    public void activate() {
        isCancelled = false;
    }

    public long getAmount() {
        return amount;
    }

}
