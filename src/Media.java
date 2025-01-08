public abstract class Media {
    private String title; // Название медиа
    private String genre; // Жанр медиа
    private int availableSeats; // Доступные места

    // Конструктор
    public Media(String title, String genre, int availableSeats) {
        this.title = title;
        this.genre = genre;
        this.availableSeats = availableSeats;
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--; // Уменьшаем доступные места
            System.out.println("Booking successful. Remaining seats: " + availableSeats);
            return true; // Бронь успешна
        }
        System.out.println("No seats available for booking.");
        return false; // Нет доступных мест
    }


    // Абстрактный метод для получения длительности
    public abstract int getDuration();

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
