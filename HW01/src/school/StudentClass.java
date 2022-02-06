package school;

public class StudentClass {

    public int grade;

    public Student[] students;

    public String classRoom;

    public Teacher classTeacher;

    public DaySchedule[] schedule;


    public StudentClass(int grade, Student[] students, String classRoom, Teacher classTeacher, DaySchedule[] schedule) {
        this.grade = grade;
        this.students = students;
        this.classRoom = classRoom;
        this.classTeacher = classTeacher;
        this.schedule = schedule;
    }
}
