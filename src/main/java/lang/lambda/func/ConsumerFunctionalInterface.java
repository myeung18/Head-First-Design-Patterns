package lang.lambda.func;

import lang.lambda.domain.Movie;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    Consumer<Movie> printInfo = m -> System.out.println("Printing out info:" + m);

    Consumer<Movie> persistMovie = m -> persist(m);

    Consumer<Movie> notifyMovie = m -> notify(m);

    private void testConsumber(Movie movie) {
        printInfo.accept(movie);
    }

    private void notify(Movie movie) {
        System.out.println("nofitying abotu movie" + movie);
    }

    private void testAndThen(Movie movie) {
        Consumer<Movie> printAndThen = printInfo.andThen(persistMovie);
        printAndThen.accept(movie);

        System.out.println("-------------");
        Consumer<Movie> chainedCon = notifyMovie.andThen(persistMovie).andThen(printInfo);
        chainedCon.accept(movie);
    }

    private void persist(Movie m) {
        System.out.println("persisting movie: " + m);
    }

    public static void main(String[] args) {

        Movie movie = new Movie("Gods must be crazy");
        new ConsumerFunctionalInterface().testAndThen(movie);

    }

}
