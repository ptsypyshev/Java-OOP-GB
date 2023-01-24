package hw04;

public class Human {
    private String name;
    private int height;

    public Human(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return String.format(
            "Human %s has height %d cm", 
            this.getName(), this.getHeight()
        );
    }
}
