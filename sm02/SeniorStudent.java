// 4. Старшеклассник, следующее свойство:
//      4.1. Список сдаваемых экзаменов
//   А так же следующие методы:
//      4.2 Записаться на экзамен
//      4.3 Играть, выводящий на экран фразу "Я играю в Dota"
//      4.4 Учиться, выводящий на экран фразу "Я должен учиться"
package sm02;

import java.util.ArrayList;

public class SeniorStudent extends Student{
    private ArrayList<String> ExamList;

    public ArrayList<String> getExamList() {
        return this.ExamList;
    }

    public SeniorStudent(String name, int mark, int classNumber, ArrayList<String> ExamList) {
        super(name, mark, classNumber);
        this.ExamList = ExamList;
    }

    public SeniorStudent(String name, int mark, int classNumber) {
        super(name, mark, classNumber);
        this.ExamList = new ArrayList<>();
    }

    @Override
    public void play() {
        System.out.println("Я играю в Dota");        
    }

    @Override
    public void study() {
        System.out.println("Я должен учиться");  
    }

    public void addExam(String exam) {
        this.ExamList.add(exam);
    }

    @Override
    public String toString() {
        return String.format("%s, isExtended: %s\n", super.toString(), this.getExamList());
    }
}
