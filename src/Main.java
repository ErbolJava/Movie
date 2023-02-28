import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cast cast1 = new Cast("Letitia Wright", "Shuri");
        Cast cast2 = new Cast("Lupita Nyong'o", "Nakia");
        Cast cast3 = new Cast("Winston Duke", "Jabari");
        Cast[] wakandaCast = {cast1, cast2, cast3};

        Cast cast4 = new Cast("Vin Diesel", "Dominiko Toretto");
        Cast cast5 = new Cast("Vinnie Bennett", "junior Dominik");
        Cast cast6 = new Cast("Mayte Michelle Rodriguez", "Diana Guzmen");
        Cast[] forsaj9Cast = {cast4, cast5, cast6};

        Cast cast7 = new Cast("Bakyt Osmonkanov", "Bakyt");
        Cast cast8 = new Cast("Zhenish Mairamber uulu", "Jenish");
        Cast cast9 = new Cast("Dinara Bagyshbaeva", "Dinara");
        Cast[] aiash2Cast = {cast7, cast8, cast9};

        Cast cast10 = new Cast("Ursula Corbero", "Tokio");
        Cast cast11 = new Cast("Alvaro Morte", "Professor");
        Cast cast12 = new Cast("Miguel Herran", "Rio");
        Cast[] paperHouseCast = {cast10, cast11, cast12};
        Cast[] casts = {cast1,cast2,cast3,cast4,cast5,cast6,cast7,cast8,cast9,cast10,cast11,cast12};

        Director wakandaDirector = new Director("Ryan", "Coogler");
        Director forsaj9Director = new Director("Rob", "Koen");
        Director aiash2Director = new Director("Bakyt", "Osmonkanov");
        Director paperHouseDirector = new Director("Jesus", "Colmenar");

        Movie movie1 = new Movie("Wakanda Forever", 2022, "SuperHero film", wakandaDirector, wakandaCast);
        Movie movie2 = new Movie("F9", 2021, "Science Fiction", forsaj9Director, forsaj9Cast);
        Movie movie3 = new Movie("Aiash 2", 2022, "Comedy", aiash2Director, aiash2Cast);
        Movie movie4 = new Movie("Paper House", 2017, "Action/Europe", paperHouseDirector, paperHouseCast);
        Movie[] movies = {movie1, movie2, movie3, movie4};


        FindableImpl findable = new FindableImpl();

        while (true) {
            System.out.println("""
                     
                     1-GET ALL MOVIES | 2-FIND BY NAME | 3-FIND BY ACTOR NAME
                    4-FIND BY YEAR | 5-FIND BY DIRECTOR | 6-FIND BY DESCRIPTION
                                       7-FIND BY ROLE""");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    findable.getAllMovies(movies);
                    break;
                case 2:
                    System.out.print("Print name of movie: ");
                    findable.findMovieByName(movies);
                    break;
                case 3:
                    System.out.print("Actor's name: ");
                    findable.findMovieByActorName(movies,casts);
                    break;
                case 4:
                    findable.findMovieByYear(movies);
                    break;
                case 5:
                    System.out.print("Print director's name: ");
                    findable.findMovieByDirector(movies);
                    break;
                case 6:
                    System.out.println("Print movie's genre that you are looking for: ");
                    findable.findMovieByDescription(movies);
                    break;
                case 7:
                    System.out.println("Print actor's role that you are looking for: ");
                    findable.findMovieByRole(movies);
                    break;
                default:
                    System.out.println("sorry this is insane");
            }
        }
    }
}

