import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем фильмы
        Film film1 = new Film("Inception", "Sci-Fi", 148, 3);
        Film film2 = new Film("Titanic", "Romance", 195, 2);

        // Создаем сериалы
        Series series1 = new Series("Breaking Bad", "Drama", 62, 47, 5);
        Series series2 = new Series("Stranger Things", "Sci-Fi", 34, 50, 3);

        // Создаем список медиа
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(film1);
        mediaList.add(film2);
        mediaList.add(series1);
        mediaList.add(series2);

        // Создаем кинотеатр
        Cinema cinema = new Cinema("Grand Cinema", "Downtown", mediaList);

        // Создаем зрителя
        Viewer viewer = new Viewer("Alice", 25, "alice@example.com");

        // Создаем сканер для ввода данных
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Интерфейс взаимодействия
        while (running) {
            System.out.println("\n--- Cinema Booking System ---");
            System.out.println("1. View available media");
            System.out.println("2. Book a ticket");
            System.out.println("3. View booking history");
            System.out.println("4. Search media by title");
            System.out.println("5. Sort media by title");
            System.out.println("6. Sort media by duration");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Поглощаем перевод строки

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable media:");
                    cinema.getMediaList().forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Enter the title of the media you want to book: ");
                    String mediaTitle = scanner.nextLine();
                    System.out.println(cinema.bookTicket(mediaTitle, viewer));
                    break;

                case 3:
                    cinema.printBookingHistory();
                    break;

                case 4:
                    System.out.print("Enter the title of the media to search: ");
                    String searchTitle = scanner.nextLine();
                    cinema.searchMediaByTitle(searchTitle);
                    break;

                case 5:
                    cinema.sortMediaByTitle();
                    break;

                case 6:
                    cinema.sortMediaByDuration();
                    break;

                case 7:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
