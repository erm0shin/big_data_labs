package lab3;

public class Dot {

    private final int x;

    public Dot(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public Dot add(final Dot dot) {
        return new Dot(x + dot.getX());
    }

    public Dot subtract(final Dot dot) {
        return new Dot(x - dot.getX());
    }

    public Dot multiply(final Dot dot) {
        return new Dot(x * dot.getX());
    }

    public Dot divide(final Dot dot) {
        return new Dot(x / dot.getX());
    }

}
