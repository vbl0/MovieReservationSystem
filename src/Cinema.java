import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;

public class Cinema {
    private String name;
    private String location;
    private List<Media> mediaList;
    private List<String> bookingHistory; // История бронирований

    // Конструктор
    public Cinema(String name, String location, List<Media> mediaList) {
        this.name = name;
        this.location = location;
        this.mediaList = mediaList;
        this.bookingHistory = new ArrayList<>(); // Инициализируем список
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    // Метод для бронирования билета
    public String bookTicket(String mediaTitle, Viewer viewer) {
        Optional<Media> media = mediaList.stream()
                .filter(m -> m.getTitle().equalsIgnoreCase(mediaTitle))
                .findFirst();

        if (media.isPresent()) {
            Media foundMedia = media.get();
            String bookingInfo = "Viewer: " + viewer.getName() + " | Media: " + foundMedia.getTitle();
            bookingHistory.add(bookingInfo); // Сохраняем в историю
            return "Ticket booked successfully for " + viewer.getName() +
                    " to watch '" + foundMedia.getTitle() + "'.";
        } else {
            return "Sorry, the media '" + mediaTitle + "' is not available.";
        }
    }

    // Метод для вывода истории бронирований
    public void printBookingHistory() {
        System.out.println("\nBooking History:");
        if (bookingHistory.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            bookingHistory.forEach(System.out::println);
        }
    }

    // Сортировка медиа по названию
    public void sortMediaByTitle() {
        mediaList.sort(Comparator.comparing(Media::getTitle));
        System.out.println("\nMedia sorted by title:");
        mediaList.forEach(System.out::println);
    }

    // Сортировка медиа по длительности
    public void sortMediaByDuration() {
        mediaList.sort(Comparator.comparing(Media::getDuration));
        System.out.println("\nMedia sorted by duration:");
        mediaList.forEach(System.out::println);
    }

    public void searchMediaByTitle(String title) {
        Optional<Media> media = mediaList.stream()
                .filter(m -> m.getTitle().equalsIgnoreCase(title))
                .findFirst();

        if (media.isPresent()) {
            System.out.println("\nMedia found:");
            System.out.println(media.get());
        } else {
            System.out.println("\nNo media found with title: " + title);
        }
    }

}
