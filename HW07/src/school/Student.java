package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends Person implements Comparable<Student> {

    private List<Integer> mark = new ArrayList<>();

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public void visitSchool(School school) {
        System.out.println("I study at school " + school.getName());
    }

    public void doTask(Task task) {
        System.out.println(getFirstName() + " done task " + task.getProblem());
    }

    public List<Integer> getMark() {
        return mark;
    }

    public void setMark(List<Integer> mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getLastName().compareTo(o.getLastName()) == 0) {
            return this.getFirstName().compareTo(o.getFirstName());
        }
        return this.getLastName().compareTo(o.getLastName());
    }

    @Override
    public String toString() {
        return "Student{" +
                this.getLastName() +
                " " +
                this.getFirstName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return mark == student.mark;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark);
    }
}
