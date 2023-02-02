package sm06.models.animals.wilds;

import java.util.Date;

/**
 * Wolf is a class inherited from classes Animal -> WildAnimal
 */
public class Wolf extends WildAnimal{
    protected boolean leader;
    
    /**
     * It is a constructor for Wolf class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param habitat           The habitat of animal
     * @param foundDate         The found date of animal
     * @param leader            Is the animal a leader
     */
    public Wolf(double height, double weight, String eyeColor, String habitat, Date foundDate, boolean leader) {
        super(height, weight, eyeColor, habitat, foundDate);
        this.leader = leader;
    }

    /**
     * It is a constructor for Wolf class
     * @param height            The height of animal
     * @param weight            The weight of animal
     * @param eyeColor          The eye color of animal
     * @param habitat           The habitat of animal
     * @param foundDate         The found date of animal
     */
    public Wolf(double height, double weight, String eyeColor, String habitat, Date foundDate) {
        super(height, weight, eyeColor, habitat, foundDate);
        this.leader = false;
    }

    /**
     * Returns is the animal a leader or not
     * @return this.leader
     */
    public boolean isLeader() {
        return this.leader;
    }

    @Override
    public String sound() {
        return "Owooooo!";        
    }

    @Override
    public String toString() {
        return String.format("Wolf (%s)", super.toString());
    }
}
