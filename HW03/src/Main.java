import school.*;

public class Main {
    public static void main(String[] args) {
        School school = new School("№ 3");
        Director director = new Director("Bohdan", "Myk", 35, "math", 1000);
        school.hire(director);
        Teacher teacher = new Teacher("Vasylyna", "Tarnavska", 22, "ukr.lang", 900);
        school.hire(teacher);


        Student student1 = new Student("Roman", "Myk", 9);
        Student student2 = new Student("Lubov", "Kizuma", 9);
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        StudentClass grade4= new StudentClass(4, students, "201", teacher);

        DaySchedule mondaySchedule = new DaySchedule("monday", grade4);
        LessonSchedule lesson1 = new LessonSchedule(1, "math", director, mondaySchedule);
        LessonSchedule lesson2 = new LessonSchedule(2, "ukr.lang", teacher, mondaySchedule);
        mondaySchedule.getSubjects()[0] = lesson1;
        mondaySchedule.getSubjects()[1] = lesson2;
        grade4.getSchedule()[0] = mondaySchedule;

        Lesson ourLesson = teacher.teachLesson(lesson2);
        teacher.giveTask(ourLesson);
    }
}
