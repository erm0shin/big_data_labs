package lab4;

/**
 * Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов
 * 10. interface Фильм <- class Отечественный Фильм <- class Комедия.
 */
public class Variant2 {

    public void work() {
        final Film sovietFilm = new SovietFilm();
        sovietFilm.setRating(7);
        System.out.println("Rating of soviet film is " + sovietFilm.getRating());

        final Film comedy = new Comedy();
        comedy.setRating(9);
        System.out.println("Rating of soviet comedy is " + comedy.getRating());
    }

}
