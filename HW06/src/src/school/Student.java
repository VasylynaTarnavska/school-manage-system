package src.school;

public class Student extends Person implements Comparable<Student> {

    private int mark;

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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
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
}
