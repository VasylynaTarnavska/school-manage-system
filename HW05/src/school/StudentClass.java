package school;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {

    private int grade;

    private List <Student> students;

    private String classRoom;

    private Teacher classTeacher;

    private List <DaySchedule> schedule = new ArrayList<>();


    public StudentClass(int grade, List <Student> students, String classRoom, Teacher classTeacher) {
        this.grade = grade;
        this.students = students;
        this.classRoom = classRoom;
        this.classTeacher = classTeacher;
    }

    public void doTask(Task task){
        for (int i = 0; i < students.size(); i++) {
            students.get(i).doTask(task);
        }
        task.setDone(true);
        System.out.println("All students done task:" + task.getProblem());

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public List<DaySchedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<DaySchedule> schedule) {
        this.schedule = schedule;
    }
}
