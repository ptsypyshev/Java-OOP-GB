//   3. Ученик средней школы, содержащий перегрузки методов базового класса,
// выводящие на экран фразы "Я играю в Minecraft" и "Ненавижу школу" соответственно.

package sm02;

public class MiddleStudent extends Student{
    public MiddleStudent(String name, int mark, int classNumber) {
        super(name, mark, classNumber);
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
