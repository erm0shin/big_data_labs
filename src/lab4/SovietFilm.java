package lab4;

public class SovietFilm implements Film {

    private int rating;

    @Override
    public void watch() {
        System.out.println("Watching soviet film");
    }

    @Override
    public int getRating() {
        return rating;
    }


    @Override
    public void setRating(final int rating) {
        watch();
        this.rating = rating;
    }

}
