//   3. Ученик средней школы, содержащий перегрузки методов базового класса,
// выводящие на экран фразы "Я играю в Minecraft" и "Ненавижу школу" соответственно.
// Начинает курить

package sm02;

public class MiddleStudent extends Student implements Player, Smoker{
    public MiddleStudent(String name, int mark, int classNumber) {
        super(name, mark, classNumber);
    }

    public void smoke() {
        System.out.println("Я начинаю курить");  
    }

    @Override
    public void play() {
        System.out.println("Я играю в Minecraft");        
    }

    @Override
    public void study() {
        System.out.println("Ненавижу школу");  
    }
}
