// 2. Малдшеклассник(начальная школа), содержащий следующее свойство:
// 2.1. Ходит ли в группу продлённого дня?
// А так же перегрузки методов базового класса, выводящие фразы "Я играю в игрушки" и "Я люблю школу" соотвественно,
// а так же метод записаться в группу продлённого дня.
package sm02;

public class JuniorStudent extends Student implements Player, Extender{
    private boolean Extended;

    public boolean isExtended() {
        return this.Extended;
    }

    public JuniorStudent(String name, int mark, int classNumber, boolean isExtended) {
        super(name, mark, classNumber);
        this.Extended = isExtended;
    }

    public JuniorStudent(String name, int mark, int classNumber) {
        super(name, mark, classNumber);
        this.Extended = false;
    }

    @Override
    public void play() {
        System.out.println("Я играю в игрушки");        
    }

    @Override
    public void study() {
        System.out.println("Я люблю школу");  
    }

    public void toExtendedGroup() {
        this.Extended = true; 
    }

    @Override
    public String toString() {
        return String.format("%s, isExtended: %b", super.toString(), this.isExtended());
    }
}
