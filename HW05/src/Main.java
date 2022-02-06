import school.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School("№ 3", 50000);
        Director director = new Director("Bohdan", "Myk", 35, Subject.MATH, 1000);
        school.hire(director);
        Teacher teacher = new Teacher("Vasylyna", "Tarnavska", 22, Subject.COM_AND_THINK, 900);
        school.hire(teacher);


        Student student1 = new Student("Roman", "Myk", 9);
        Student student2 = new Student("Lubov", "Kizuma", 9);
        List <Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
       StudentClass grade4= new StudentClass(4, students, "201", teacher);

        DaySchedule mondaySchedule = new DaySchedule(WeekDay.MONDAY, grade4);
        LessonSchedule lesson1 = new LessonSchedule(1, Subject.MATH, director, mondaySchedule);
        LessonSchedule lesson2 = new LessonSchedule(2, Subject.COM_AND_THINK, teacher, mondaySchedule);
        mondaySchedule.getSubjects().add(0,lesson1);
        mondaySchedule.getSubjects().add(1,lesson2);
        grade4.getSchedule().add(mondaySchedule);

//        Lesson ourLesson = teacher.teachLesson(lesson2);
//        teacher.giveTask(ourLesson);
//        teacher.putMark(ourLesson);
        school.paySalary(teacher);
        school.paySalary(director);
        school.fire(director);
    }
}
