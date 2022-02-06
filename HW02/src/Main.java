import school.*;

public class Main {

    public static void main(String[] args) {
        School school = new School("№ 3");
        Director director = new Director("Bohdan", "Myk", 35, "math", 1000);
        school.hire(director);
        Teacher teacher = new Teacher("Vasylyna", "Tarnavska", 22, "primary", 900);
        school.hire(teacher);
        Person person = new Person("Lida", "Ivaniv", 30);
        person.visitSchool(school);
        Student student = new Student("Roman", "Myk", 12);
        student.visitSchool(school);

    }
}
