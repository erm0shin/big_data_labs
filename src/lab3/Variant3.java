package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Создать объект класса Дом, используя классы Окно, Дверь.
 * Методы: закрыть на ключ, вывести на консоль количество окон, дверей.
 */
public class Variant3 {

    public void work() {
        final Door entranceDoor = new Door(80, 230);

        final List<Door> internalDoors = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            internalDoors.add(new Door(80, 230));
        }

        final List<Window> windows = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            windows.add(new Window(50, 50));
        }

        final House house = new House(entranceDoor, internalDoors, windows);
        house.openEntanceDoor();
        house.closeEntanceDoor();
        System.out.println("Doors number is " + house.getDoorsNumber());
        System.out.println("Windows number is " + house.getWindowsNumber());
    }

}
