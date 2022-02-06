package src;

import src.school.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        School school = new School("№ 3", 50000);
        Director director = new Director("Bohdan", "Myk", 35, Subject.MATH, 1000);
        school.hire(director);
        Teacher teacher = new Teacher("Vasylyna", "Tarnavska", 22, Subject.COM_AND_THINK, 900);
        school.hire(teacher);


        List<Student> students = List.of(
                new Student("Ivan", "Ivanov", 9),
                new Student("Petro", "Petrov", 9),
                new Student("Bohdan", "Bohdanov", 9),
                new Student("Ivan", "Bohdanov", 9),
                new Student("Ilia", "Illin", 9),
                new Student("Roman", "Romanov", 9),
                new Student("Ihor", "Ihorov", 9)
        );

        Set<Student> studentSet = new TreeSet<>(students);
        System.out.println(studentSet.toString());

        StudentClass grade4 = new StudentClass(4, students, "201", teacher);

        DaySchedule mondaySchedule = new DaySchedule(WeekDay.MONDAY, grade4);
        LessonSchedule lesson1 = new LessonSchedule(1, Subject.MATH, director, mondaySchedule);
        LessonSchedule lesson2 = new LessonSchedule(2, Subject.COM_AND_THINK, teacher, mondaySchedule);
        mondaySchedule.getSubjects().add(0, lesson1);
        mondaySchedule.getSubjects().add(1, lesson2);
        grade4.getSchedule().add(mondaySchedule);

        Lesson ourLesson = teacher.teachLesson(lesson2);
        teacher.giveTask(ourLesson);
        teacher.putMark(ourLesson);

        List<Student> excellentStudents = new ArrayList<>();
        System.out.println("Student with excellent mark: ");
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getMark()>=10){
                Student excellentStudent = students.get(i);
                excellentStudents.add(excellentStudent);
                System.out.println(excellentStudent.toString() + " " + excellentStudent.getMark());
            }
        }



    }
}
