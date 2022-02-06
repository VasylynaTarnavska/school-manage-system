package school;

public class Student extends Person{

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public void visitSchool(School school){
        System.out.println("I study at school " + school.getName());
    }
}
