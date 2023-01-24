package sm04;

public class Worker {
    private int ID;
    private String name;

    public Worker(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("Worker %s with ID: %d\n", this.getName(), this.getID());
    }
}


    

