package school;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Teacher extends Person{

    private String subject;

    private int salary;

    public Teacher(String firstName, String lastName, int age, String subject, int salary) {
        super(firstName, lastName, age);
        this.subject = subject;
        this.salary = salary;
    }

    public Lesson teachLesson(LessonSchedule lessonSchedule){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write topic of the lesson:");
        String lessonTopic = scanner.next();
        Lesson lesson = new Lesson(lessonSchedule, lessonSchedule.getDaySchedule().getStudentClass(), lessonTopic);
        System.out.println("I teach lesson in " + lessonSchedule.getDaySchedule().getStudentClass().getGrade() + " class. Topic of the lesson is " + lessonTopic);
        return lesson;
    }

    public void giveTask(Lesson lesson){
        System.out.println("Topic of the lesson is " + lesson.getLessonTopic() + " Create the task");
        Scanner scanner = new Scanner(System.in);
        String problem = scanner.nextLine();
        Task task = new Task(problem);
        lesson.addTask(task);
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
