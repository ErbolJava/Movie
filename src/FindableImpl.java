import java.util.Locale;
import java.util.Scanner;

public class FindableImpl implements Findable{
    @Override
    public void getAllMovies(Movie[] movies) {
        for (Movie m:movies) {
            System.out.println(m);
        }
    }

    @Override
    public void findMovieByName(Movie[] movies) {
        String s = new Scanner(System.in).nextLine().toLowerCase();
        for (Movie m:movies) {
            if(m.getName().toLowerCase().equals(s)) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByActorName(Movie[] movies,Cast[]casts) {
        String s = new Scanner(System.in).nextLine().toLowerCase();
        for (Movie movie : movies) {
            for (Cast cast : movie.getCasts()) {
                if(cast.getActorFullName().equalsIgnoreCase(s)){
                    System.out.println(movie);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(Movie[] movies) {
        System.out.print("Print year: ");
        int a = new Scanner(System.in).nextInt();
        for (Movie movie:movies) {
            if(movie.getYear()==a){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
        String s = new Scanner(System.in).nextLine().toLowerCase();
        for (Movie movie:movies) {
            if (movie.getDirector().getName().equalsIgnoreCase(s)){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByDescription(Movie[] movies) {
        String s = new Scanner(System.in).nextLine().toLowerCase();
        for (Movie movie : movies) {
            if (movie.getDescription().equalsIgnoreCase(s)){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByRole(Movie[] movies) {
        String s = new Scanner(System.in).nextLine().toLowerCase();
        for (Movie movie:movies) {
            for (Cast cast: movie.getCasts()) {
                if(cast.getRole().equalsIgnoreCase(s)){
                    System.out.println(movie);
                }
            }

        }
    }
}
