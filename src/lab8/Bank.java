package lab8;

public class Bank {

    private final Object object = new Object();
    private long amount = 0L;

    public void putMoneys(final long money) {
        synchronized (object) {
            amount += money;
            System.out.println("Current amount: " + amount);
        }
    }

    public void getMoneys(final long money) {
        synchronized (object) {
            if (amount >= money) {
                amount -= money;
                System.out.println("Current amount: " + amount);
            } else {
                System.out.println("Not enough money on amount");
            }
        }
    }

}
