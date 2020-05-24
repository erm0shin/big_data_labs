package lab3;

import java.util.List;

public class House {

    private final Door entranceDoor;
    private final List<Door> doors;
    private final List<Window> windows;

    public House(Door entranceDoor, List<Door> doors, List<Window> windows) {
        this.entranceDoor = entranceDoor;
        this.doors = doors;
        this.windows = windows;
    }

    public void closeEntanceDoor() {
        entranceDoor.close();
    }

    public void openEntanceDoor() {
        entranceDoor.open();
    }

    public void closeInternalDoor(final int doorNumber) {
        if (doorNumber > doors.size())
            throw new IllegalArgumentException("Wrong door number");
        doors.get(doorNumber).close();
    }

    public void openInternalDoor(final int doorNumber) {
        if (doorNumber > doors.size())
            throw new IllegalArgumentException("Wrong door number");
        doors.get(doorNumber).open();
    }

    public int getDoorsNumber() {
        return doors.size() + 1;
    }

    public int getWindowsNumber() {
        return windows.size();
    }

}
