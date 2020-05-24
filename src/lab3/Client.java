package lab3;

public class Client {

    private final CreditCard card;

    public Client() {
        final Account account = new Account(0);
        this.card = new CreditCard(account);
    }

    public Client(CreditCard card) {
        this.card = card;
    }

    public long putMoneys(final long moneys) {
        return card.putMoneys(moneys);
    }

    public long pay(final Order order) {
        return card.pay(order);
    }

    public long transfer(final Account account, final long money) {
        return card.transfer(account, money);
    }

    public CreditCard getCard() {
        return card;
    }

}
