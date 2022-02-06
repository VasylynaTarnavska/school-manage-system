package school;

import java.util.Scanner;

public class Teacher extends Person{

    private String subject;

    private int salary;

    public Teacher(String firstName, String lastName, int age, String subject, int salary) {
        super(firstName, lastName, age);
        this.subject = subject;
        this.salary = salary;
    }

    public void teachLesson(LessonSchedule lessonSchedule){
        Scanner scanner = new Scanner(System.in);
        String lessonTopic = scanner.next();
        Lesson lesson = new Lesson(lessonSchedule, lessonSchedule.getDaySchedule().getStudentClass(), lessonTopic);
        System.out.println("I teach lesson in " + lessonSchedule.getDaySchedule().getStudentClass() + " class. Topic of the lesson was " + lessonTopic);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
