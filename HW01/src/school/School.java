package school;

public class School {

    public String name;

    public StudentClass[] studentClasses = new StudentClass[25];

    public Teacher[] teachers = new Teacher[100];

    public int teacherAmount = 0;

    public Teacher director;

    public School(String name, Teacher director) {
        this.name = name;
        this.director = director;
    }

    public void hireTeacher(Teacher teacher){
        teachers [teacherAmount] = teacher;
        teacherAmount+=1;
        System.out.println("I'm " + teacher.firstName + "and I will teach "+ teacher.subject);
    }
}
