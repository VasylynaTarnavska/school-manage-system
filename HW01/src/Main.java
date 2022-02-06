import school.School;
import school.Teacher;

public class Main {
    public static void main(String[] args) {

        Teacher director = new Teacher("Bogdan", "Muk", 36, "math", 1000);
        School school = new School("№3",director);
        school.hireTeacher(director);

    }
}
