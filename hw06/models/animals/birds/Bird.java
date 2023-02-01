package hw06.models.animals.birds;

import hw06.models.animals.base.Animal;

/**
 * Animal is ab abstract class for birds
 */
public abstract class Bird extends Animal{
    private String feathersColor;

    /**
     * It is a constructor for Bird class
     * @param height        The height of bird
     * @param weight        The weight of bird
     * @param eyeColor      The eye color of bird
     * @param feathersColor The feathers color of bird
     */
    protected Bird(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor);
        this.feathersColor = feathersColor;
    }

    /**
     * Returns feathers color
     * @return this.feathersColor
     */
    public String getFeathersColor() {
        return this.feathersColor;
    }
}
