package lab5;

import lab4.Comedy;
import lab4.Film;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Variant2 {

    public void work() {
        Film film = new Comedy();
        try {
            Scanner scanner = new Scanner(System.in);
            film.setRating(scanner.nextInt());
        } catch (NoSuchElementException e) {
            System.out.println("Input stream is exhausted");
            e.printStackTrace();
            film.setRating(8);
        } catch (IllegalStateException e) {
            System.out.println("This scanner is closed");
            e.printStackTrace();
            film.setRating(8);
        } catch (OutOfMemoryError e) {
            System.out.println("Not enough memory for object creating");
            e.printStackTrace();
            return;
        }

        try (final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(String.valueOf(film.getRating()));
        } catch (IOException e) {
            System.out.println("Error by printing");
            e.printStackTrace();
        }
    }

}
