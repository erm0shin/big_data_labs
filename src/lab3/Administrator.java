package lab3;

import java.util.List;

public class Administrator {

    private final List<Client> customers;

    public Administrator(List<Client> customers) {
        this.customers = customers;
    }

    public void blockBadCustomers() {
        customers.forEach(customer -> {
            if (customer.getCard().getAccount().getAmount() < 0)
                customer.getCard().lock();
        });
    }

}
