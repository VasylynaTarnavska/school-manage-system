import myException.NotEnoughMoneyException;
import school.*;

import java.io.IOException;
import java.lang.reflect.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

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

        StudentClass grade4 = new StudentClass(4, students, "201", teacher);

        DaySchedule mondaySchedule = new DaySchedule(WeekDay.MONDAY, grade4);
        LessonSchedule lesson1 = new LessonSchedule(1, Subject.MATH, director, mondaySchedule);
        LessonSchedule lesson2 = new LessonSchedule(2, Subject.COM_AND_THINK, teacher, mondaySchedule);
        mondaySchedule.getSubjects().add(0, lesson1);
        mondaySchedule.getSubjects().add(1, lesson2);
        grade4.getSchedule().add(mondaySchedule);

//        Lesson ourLesson = teacher.teachLesson(lesson2);
//        teacher.putMark(ourLesson);

        student1.readDiary();

        Class<Student> cl= Student.class;

        System.out.println(cl.getName());

        System.out.println(cl.getSuperclass().getName());

        System.out.println(Arrays.toString(cl.getInterfaces()));

        System.out.println("Constructors: ");
        for(Constructor<?> constructor:cl.getConstructors()){
            System.out.println(Arrays.toString(constructor.getParameters()));
        }

        Constructor<Student> constructor = cl.getConstructor(String.class, String.class, Integer.class);
        Student student2 = constructor.newInstance("Vasylyna", "Vasylchenko", 10);
        System.out.println("New student: "+ student2.toString());

        System.out.println("Methods: ");
        for (Method method : cl.getMethods()) {
            System.out.println(method.getName());
            for (Parameter parameter : method.getParameters()) {
                System.out.println(parameter.getType() + " " + parameter.getName());
            }
            System.out.println("__________");
        }

        Method method1 = cl.getDeclaredMethod("visitSchool", School.class);
        method1.invoke(student2, school);

        System.out.println("Fields: ");
        for (Field field: cl.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(field.getType()+field.getName());
        }


        Field field1 = cl.getDeclaredField("mark");
        field1.setAccessible(true);
        List <Integer> newMarks = new ArrayList<>();
        newMarks.add(12);
        newMarks.add(10);
        newMarks.add(9);
        field1.set(student2, newMarks);
        System.out.println(field1.get(student2));

    }
}
