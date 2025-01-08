public class Film extends Media {
    private int duration; // Продолжительность фильма в минутах

    public Film(String title, String genre, int duration, int availableSeats) {
        super(title, genre, availableSeats);
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + getTitle() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", duration=" + duration +
                ", availableSeats=" + getAvailableSeats() +
                '}';
    }
}
