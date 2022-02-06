import myException.NotEnoughMoneyException;
import school.*;

import java.io.IOException;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException, IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        School school = new School("№ 3", 1000);
        Director director = new Director("Bohdan", "Myk", 35, Subject.MATH, 1000);
        school.hire(director);
        Teacher teacher = new Teacher("Vasylyna", "Tarnavska", 22, Subject.COM_AND_THINK, 900);
        school.hire(teacher);

        school.addLogo("https://image.shutterstock.com/image-vector/vector-logo-school-260nw-427910128.jpg");

        Student student1 = new Student("Ivan", "Ivanov", 9);
        List<Student> students = List.of(
                student1,
                new Student("Petro", "Petrov", 9),
                new Student("Bohdan", "Bohdanov", 9),
                new Student("Ivan", "Bohdanov", 9),
                new Student("Ilia", "Illin", 9),
                new Student("Roman", "Romanov", 9),
                new Student("Ihor", "Ihorov", 9)
        );

        students = students.stream().sorted().collect(Collectors.toList());

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

        student1.readDiary();


    }
}
