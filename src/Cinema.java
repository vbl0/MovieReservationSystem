public class Cinema {
    private String name; // Название кинотеатра
    private String location; // Местоположение

    public Cinema(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
