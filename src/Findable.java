public interface Findable {
    void getAllMovies(Movie[] movies);

    void findMovieByName(Movie[] movies);

    void findMovieByActorName(Movie[] movies, Cast[]casts);

    void findMovieByYear(Movie[] movies);

    void findMovieByDirector(Movie[] movies);

    void findMovieByDescription(Movie[] movies);

    void findMovieByRole(Movie[] movies);
}
