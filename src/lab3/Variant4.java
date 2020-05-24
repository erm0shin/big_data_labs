package lab3;

import java.util.Collections;

/**
 * 2. Система Платежи.
 * Клиент имеет Счет в банке и Кредитную Карту (КК).
 * Клиент может оплатить Заказ, сделать платеж на другой Счет, заблокировать КК и аннулировать Счет.
 * Администратор может заблокировать КК за превышение кредита.
 */
public class Variant4 {

    public void work() {
        final Client client = new Client();
        final Administrator administrator = new Administrator(Collections.singletonList(client));

        client.putMoneys(1000000);
        client.pay(new Order(100));
        client.transfer(new Account(1000), 100);
        client.pay(new Order(100000000000L));

        administrator.blockBadCustomers();
    }

}
