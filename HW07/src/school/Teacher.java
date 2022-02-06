package school;

import myException.MarkDoesNotExist;

import java.util.Scanner;

public class Teacher extends Person implements Teach {

    private Subject subject;

    private static final int SALARY = 1000;

    private int balance;

    public Teacher(String firstName, String lastName, int age, Subject subject, int balance) {
        super(firstName, lastName, age);
        this.subject = subject;
        this.balance = balance;
    }

    @Override
    public Lesson teachLesson(LessonSchedule lessonSchedule) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write topic of the lesson:");
        String lessonTopic = scanner.next();
        Lesson lesson = new Lesson(lessonSchedule, lessonSchedule.getDaySchedule().getStudentClass(), lessonTopic);
        System.out.println("I teach lesson in " + lessonSchedule.getDaySchedule().getStudentClass().getGrade() + " class. Topic of the lesson is " + lessonTopic);
        return lesson;
    }

    @Override
    public void giveTask(Lesson lesson) {
        System.out.println("Topic of the lesson is " + lesson.getLessonTopic() + " Create the task");
        Scanner scanner = new Scanner(System.in);
        String problem = scanner.nextLine();
        Task task = new Task(problem);
        lesson.addTask(task);
    }

    @Override
    public void putMark(Lesson lesson){
        System.out.println("Put the marks for students");
        for (int i = 0; i < lesson.getStudentClass().getStudents().size(); i++) {
            Student student = lesson.getStudentClass().getStudents().get(i);
            int mark = putMark(student);
            lesson.getMarks().put(student, mark);
        }
    }

    public int putMark(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(student.getFirstName() + " " + student.getLastName());
        try {
            int mark = scanner.nextInt();
            if (mark <= 0 || mark > 12) {
                throw new MarkDoesNotExist("The given mark is out of range. Put new mark:");
            }
            student.getMark().add(mark);
            System.out.println("I`m " + student.getFirstName() + ". My mark is " + student.getMark());
            return mark;
        } catch (MarkDoesNotExist e) {
            System.out.println(e.getMessage());
            return(putMark(student));
        }
    }

    public void receiveSalary() {
        balance += getSALARY();
        System.out.println("I`m " + getFirstName() + ". I get a salary " + getSALARY() + "$. My balance is " + balance);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static int getSALARY() {
        return SALARY;
    }
}
