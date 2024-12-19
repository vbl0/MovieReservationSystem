public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Inception", "Sci-Fi", 148);
        Film film2 = new Film("The Godfather", "Crime", 175);

        Viewer viewer1 = new Viewer("Alice", 25);
        Viewer viewer2 = new Viewer("Bob", 30);

        Cinema cinema = new Cinema("Galaxy Cinema", "Kinopark");

        System.out.println(film1);
        System.out.println(film2);
        System.out.println(viewer1);
        System.out.println(viewer2);
        System.out.println(cinema);


    }
}
