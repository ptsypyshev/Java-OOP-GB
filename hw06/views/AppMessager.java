package hw06.views;

public interface AppMessager {
    /**
     * Prints Welcome message
     */
    public void Welcome();

    /**
     * Prints Main menu message
     */
    public void MainMenu();

    /**
     * Prints message that we try to use invalid index
     */
    public void BadIndex();

    /**
     * Prints message before creating new animal
     */
    public void NewAnimalMsg();

    /**
     * Prints message that animal was added to zoo
     */
    public void AddedAnimalMsg();

    /**
     * Prints message that animal was removed from zoo
     */
    public void RemovedAnimalMsg();

    /**
     * Prints message that zoo is empty
     */
    public void PrintZooEmpty();

    /**
     * Prints message that some functionality is not implemented
     */
    public void NotImplemented();

    /**
     * Prints Bye message
     */
    public void Bye();
}
