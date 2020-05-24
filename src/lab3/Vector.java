package lab3;

import java.util.Arrays;

public class Vector {

    private Dot[] vertexes;

    public Vector(final int size) {
        vertexes = new Dot[size];
    }

    public Vector(Dot... vertexes) {
        this.vertexes = vertexes;
    }

    public Vector(int[] vertexes) {
        this.vertexes = new Dot[vertexes.length];
        for (int i = 0; i < vertexes.length; i++) {
            this.vertexes[i] = new Dot(vertexes[i]);
        }
    }

    public int getVectorLength() {
        return vertexes.length;
    }

    public Vector add(Vector vec) {
        Vector resultVector = new Vector(vec.vertexes.length);

        for (int i = 0; i < vertexes.length; i++) {
            resultVector.vertexes[i] = vertexes[i].add(vec.vertexes[i]);
        }

        return resultVector;
    }

    public Vector subtract(Vector vec) {
        Vector resultVector = new Vector(vec.vertexes.length);

        for (int i = 0; i < vertexes.length; i++) {
            resultVector.vertexes[i] = vertexes[i].subtract(vec.vertexes[i]);
        }

        return resultVector;
    }

    public Vector multiply(Vector vec) {
        final int vertexesAmount = Math.min(vertexes.length, vec.vertexes.length);
        Vector resultVector = new Vector(vertexesAmount);

        for (int i = 0; i < vertexesAmount; i++) {
            resultVector.vertexes[i] = vertexes[i].multiply(vec.vertexes[i]);
        }

        return resultVector;
    }

    public Vector divide(Vector vec) {
        Vector resultVector = new Vector(vec.vertexes.length);

        for (int i = 0; i < vertexes.length; i++) {
            resultVector.vertexes[i] = vertexes[i].divide(vec.vertexes[i]);
        }

        return resultVector;
    }

    public double getMagnitude() {
        Vector tempVec = multiply(this);
        double magnitude = 0d;

        for (int i = 0; i < tempVec.getVectorLength(); i++) {
            magnitude += tempVec.vertexes[i].getX();
        }

        return Math.sqrt(magnitude);
    }

    public static int getScalar(Vector vec1, Vector vec2) {
        final int vertexesAmount = Math.min(vec1.getVectorLength(), vec2.getVectorLength());
        int scalar = 0;

        for (int i = 0; i < vertexesAmount; i++) {
            scalar += vec1.vertexes[i].multiply(vec2.vertexes[i]).getX();
        }

        return scalar;
    }

    public static double getAngle(Vector from, Vector to) {
        return Math.acos(Math.cos((double) Vector.getScalar(from, to) / (from.getMagnitude() * to.getMagnitude())));
    }

    @Override
    public String toString() {
        return "Vector{" +
            "vertexes=" + Arrays.toString(vertexes) +
            '}';
    }

}
