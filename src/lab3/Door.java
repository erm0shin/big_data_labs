package lab3;

import java.util.Objects;

public class Door {

    private final int width;
    private final int height;
    private boolean isClosed;

    public Door(int width, int height) {
        this.width = width;
        this.height = height;
        this.isClosed = true;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void close() {
        isClosed = true;
    }

    public void open() {
        isClosed = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Door))
            return false;
        Door door = (Door) o;
        return width == door.width &&
            height == door.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

}
