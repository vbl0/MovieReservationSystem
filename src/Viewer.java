public class Viewer {
    private String name; // Имя зрителя
    private int age; // Возраст зрителя

    public Viewer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Viewer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
