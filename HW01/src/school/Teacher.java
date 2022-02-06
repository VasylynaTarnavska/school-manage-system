package school;

import java.util.Scanner;

public class Teacher {

    public String firstName;

    public String lastName;

    public int age;

    public String subject;

    public int salary;

    public Teacher(String firstName, String lastName, int age, String subject, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.subject = subject;
        this.salary = salary;
    }

    public void teachLesson(LessonSchedule lessonSchedule){
        Scanner scanner = new Scanner(System.in);
        String lessonTopic = scanner.next();
        Lesson lesson = new Lesson(lessonSchedule, lessonSchedule.daySchedule.studentClass, lessonTopic);
        System.out.println("I teach lesson in " + lessonSchedule.daySchedule.studentClass + " class. Topic of the lesson was " + lessonTopic);
    }
}
