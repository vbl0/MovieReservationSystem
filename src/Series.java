public class Series extends Media {
    private int episodes;
    private int episodeDuration;

    public Series(String title, String genre, int episodes, int episodeDuration, int availableSeats) {
        super(title, genre, availableSeats);
        this.episodes = episodes;
        this.episodeDuration = episodeDuration;
    }

    @Override
    public int getDuration() {
        return episodes * episodeDuration;
    }

    @Override
    public String toString() {
        return "Series{" +
                "title='" + getTitle() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", episodes=" + episodes +
                ", episodeDuration=" + episodeDuration +
                ", totalDuration=" + getDuration() +
                ", availableSeats=" + getAvailableSeats() +
                '}';
    }
}
