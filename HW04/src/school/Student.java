package school;

public class Student extends Person{

    private int mark;

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public void visitSchool(School school){
        System.out.println("I study at school " + school.getName());
    }

    public void doTask (Task task){
        System.out.println(getFirstName() + " done task " + task.getProblem());
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
