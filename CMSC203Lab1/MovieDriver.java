import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String movieTitle, movieRating;
        int ticketSale;
        char choice;

        do {
            System.out.println("Enter the name of a movie");
            movieTitle = input.nextLine();
            input.nextLine(); 
            System.out.println("Enter the rating of the movie");
            movieRating = input.nextLine();
            System.out.println("Enter the number of tickets sold for this movie");
            ticketSale = input.nextInt();

            Movie movie = new Movie(movieTitle, movieRating, ticketSale);
            System.out.println(movie.toString());

            System.out.print("Do you want to enter another? (y or n): ");
            choice = input.next().charAt(0);
        } while (choice == 'y');

        System.out.println("Goodbye");
        input.close();
    }
}