package lab3;

public class CreditCard {

    private final RuntimeException LOCKED_CARD_EXCEPTION = new IllegalStateException("Credit card is locked");

    private final Account account;
    private boolean isLocked;

    public CreditCard(Account account) {
        this.account = account;
        isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }

    public long putMoneys(final long money) {
        if (isLocked)
            throw LOCKED_CARD_EXCEPTION;
        return account.addMoneys(money);
    }

    public long pay(final Order order) {
        if (isLocked)
            throw LOCKED_CARD_EXCEPTION;
        return account.subtractMoneys(order.getPrice());
    }

    public long transfer(final Account account, final long money) {
        if (isLocked)
            throw LOCKED_CARD_EXCEPTION;
        account.addMoneys(money);
        return account.subtractMoneys(money);
    }

    public Account getAccount() {
        return account;
    }

    public boolean isLocked() {
        return isLocked;
    }

}
