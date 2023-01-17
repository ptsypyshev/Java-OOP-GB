// На языке JAVA написать следующие классы:
// 1. Школьник, содержащий следующие свойства:
//   1.1. ФИО
//   1.2. Средний балл
//   1.3. Номер класса,
// а так же содержащие следующие методы:
//   1.4 Играть
//   1.5 Учиться,
// выводящие на экран фразы "Я играю" и "Я учусь" соответственно.

package sm02;

public abstract class Student {
    private String name;
    private int mark;
    private int classNumber;

    public String getName() {
        return this.name;
    }

    public int getMark() {
        return this.mark;
    }

    public int getClassNumber() {
        return this.classNumber;
    }

    protected Student(String name, int mark, int classNumber) {
        this.name = name;
        this.mark = mark;
        this.classNumber = classNumber;
    }

    public abstract void play();
    public abstract void study();

    @Override
    public String toString() {
        return String.format("Student: %s, mark: %d, class: %d", this.getName(), this.getMark(), this.getClassNumber());
    }
}
