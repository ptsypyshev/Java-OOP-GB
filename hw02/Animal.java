package hw02;

/**
 * Animal is ab abstract base class to inherit
 */
public abstract class Animal {
    private double height;
    private double weight;
    private String eyeColor;

    /**
     * It is a constructor for Animal class
     * @param height    The height of animal
     * @param weight    The weight of animal
     * @param eyeColor  The eye color of animal
     */
    protected Animal(double height, double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    /**
     * Returns the animal height
     * @return this.height
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Returns the animal height
     * @return this.weight
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Returns the animal eye color
     * @return this.eyeColor
     */
    public String getEyeColor() {
        return this.eyeColor;
    }

    /**
     * Makes sound of animal
     */
    public abstract void sound();
    
    /**
     * Makes animal fly if it possible
     */
    public void fly() {
        if (this instanceof Flier) {
            ((Flier) this).fly();
        } else {
            System.out.println("The animal cannot fly... Sorry");
        }
    }

    /**
     * Trains the animal if it possible
     */
    public void train() {
        if (this instanceof Trainer) {
            ((Trainer) this).train();
        } else {
            System.out.println("The animal cannot be trained... Sorry");
        }
    }

    /**
     * Pets the animal if it possible
     */
    public void pet() {
        if (this instanceof Petter) {
            ((Petter) this).pet();
        } else {
            System.out.println("The animal cannot be petted... Sorry");
        }
    }

    @Override
    public String toString() {
        return String.format("Height: %.1f, Height: %.1f, Eye color: %s", this.getHeight(), this.getWeight(), this.getEyeColor());
    }
}
