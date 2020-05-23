package lab8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Реализовать многопоточное приложение “Банк”.
 * Имеется банковский счет.
 * Сделать синхронным пополнение и снятие денежных средств на счет/со счета случайной суммой.
 * При каждой операции (пополнения или снятие) вывести текущий баланс счета.
 * В том случае, если денежных средств недостаточно – вывести сообщение.
 */
public class Lab8 {

    private final ExecutorService executorService = Executors.newFixedThreadPool(2);
    private final Bank bank = new Bank();

    private void addMoneys() {
        executorService.submit(() -> {
            for (int i = 0; i < 100; i++) {
                bank.putMoneys(70);
            }
        });
    }

    private void subtructMoneys() {
        executorService.submit(() -> {
            for (int i = 0; i < 200; i++) {
                bank.getMoneys(60);
            }
        });
    }

    private void stop() throws InterruptedException {
        executorService.shutdown();
        final boolean done = executorService.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("All tasks are done? - " + done);
    }

    public static void main(String[] args) throws InterruptedException {
        final Lab8 lab8 = new Lab8();
        lab8.subtructMoneys();
        lab8.addMoneys();
        lab8.stop();
    }

}
