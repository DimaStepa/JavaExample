package RedRover.M12_L.H10_L;

import RedRover.M12_L.H10_L.grades.Grade;
import RedRover.M12_L.H10_L.grades.SubjectRegister;

public class M10_L {

    public static void main(String[] args) {
        SubjectRegister biology7a = new SubjectRegister(
               new String[] {
                       "Иванов",
                       "Петров",
                       "Сидоров"
                },
                20
        );

        System.out.println(biology7a.getNumberOfStudents());
        biology7a.giveGrade("Иванов", 1, 5);
        biology7a.unlock();
        biology7a.giveGrade("Сидоров", 2, new Grade(3));
        biology7a.giveGrade("Петров", 3, new Grade(17));
        biology7a.giveGrade("Иванов", 1, new Grade(2));
        biology7a.giveGrade("Сидоров", 5, new Grade(-8));
        biology7a.giveGrade("Петров", 11, new Grade(7));

        biology7a.print();
        System.out.println(biology7a.getFinalGrade("Иванов"));
        System.out.println(biology7a.getFinalGrade("Сидоров"));
        System.out.println(biology7a.getFinalGrade("Петров"));



    }




}
