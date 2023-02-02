package sm06.views;

import java.util.Date;
import java.util.List;

public interface View {
    public void Welcome();
    public void MainMenu();
    public int getCommand();
    public boolean addAnimal();
    public boolean removeAnimal();
    public void printAnimal();
    public void printAnimals();
    public void soundAnimal();
    public void soundAnimals();
    public void flyAnimal();
    public void petAnimal();
    public void trainAnimal();
    public void Bye();

    public int getInt(String message);
    public double getDouble(String message);
    public String getString(String message);
    public boolean getBoolean(String message);
    public Date getDate(String message);
    public List<String> getListString(String message);
}


