package lab3;

import java.util.Objects;

public class Window {

    private final int width;
    private final int height;

    public Window(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Window))
            return false;
        Window window = (Window) o;
        return width == window.width &&
            height == window.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

}
