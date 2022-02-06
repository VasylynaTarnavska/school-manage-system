package school;

import java.util.ArrayList;
import java.util.List;

public class School implements Manage{

    private String name;

    private List <StudentClass> studentClasses = new ArrayList<>();

    private List <Teacher> teachers = new ArrayList<>();

    private int teacherAmount = 0;

    private Director director;

    private int balance;

    public School(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void hire(Teacher teacher){
        teachers.add(teacher);
        teacherAmount+=1;
        System.out.println("I'm " + teacher.getFirstName() + " and I will teach "+ teacher.getSubject());
    }

    public void hire(Director director){
        this.director=director;
        teachers.add(director);
        teacherAmount+=1;
        System.out.println("I'm " + director.getFirstName() + " and I`m director at school " + getName());
    }

    public void paySalary(Teacher teacher){
        if (balance>=Teacher.getSALARY()) {
            balance -= Teacher.getSALARY();
            teacher.receiveSalary();
        }else{
            System.out.println("School don`t have enough money for paying salary");
        }
    }

    public void fire(Teacher teacher){
        teachers.remove(teacher);
        System.out.println("The teacher " + teacher.getFirstName() + " " + teacher.getLastName() + " was fired"  );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentClass> getStudentClasses() {
        return studentClasses;
    }

    public void setStudentClasses(List<StudentClass> studentClasses) {
        this.studentClasses = studentClasses;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public int getTeacherAmount() {
        return teacherAmount;
    }

    public void setTeacherAmount(int teacherAmount) {
        this.teacherAmount = teacherAmount;
    }

    public Teacher getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
