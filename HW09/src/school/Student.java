package school;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Student extends Person implements Comparable<Student> {

    private List<Integer> mark = new ArrayList<>();

    private File diary;
    private Object FileReader;


    public Student(String firstName, String lastName, Integer age) throws IOException {

        super(firstName, lastName, age);
        this.diary = new File(lastName+firstName+"Diary.txt");
        if (!diary.exists()){
            diary.createNewFile();
        }


    }

    @Override
    public void visitSchool(School school) {
        System.out.println("I study at school " + school.getName());
    }

    public void doTask(Task task) {
        System.out.println(getFirstName() + " done task " + task.getProblem());
    }

    public void readDiary() throws FileNotFoundException {
        System.out.println("My marks: ");
        Scanner scanner = new Scanner(diary);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
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

    public File getDiary() {
        return diary;
    }

    public void setDiary(File diary) {
        this.diary = diary;
    }
}
