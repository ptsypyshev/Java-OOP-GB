package hw04;

import java.util.Objects;

/**
 * Simple class for Human instances
 */
public class Human implements Comparable<Human>{
    private String name;
    private int height;

    /**
     * It is a constructor for Human instance
     * @param name      Human's name
     * @param height    Human's height
     */
    public Human(String name, int height) {
        this.name = name;
        this.height = height;
    }

    /**
     * Returns human's name
     * @return  this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns human's height
     * @return  this.height
     */
    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return String.format(
            "%s:%d", 
            this.getName(), this.getHeight()
        );
    }

    @Override
    public int compareTo(Human another) {
        if (this.height > another.height) {
            return 1;
        } else if (this.height < another.height) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Human)) {
            return false;
        }
        Human human = (Human) o;
        return this.name == human.name && this.height == human.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }
    
}
