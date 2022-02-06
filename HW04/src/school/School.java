package school;

public class School implements Manage{

    private String name;

    private StudentClass[] studentClasses = new StudentClass[25];

    private Teacher[] teachers = new Teacher[100];

    private int teacherAmount = 0;

    private Director director;

    private int balance;

    public School(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void hire(Teacher teacher){
        teachers [teacherAmount] = teacher;
        teacherAmount+=1;
        System.out.println("I'm " + teacher.getFirstName() + " and I will teach "+ teacher.getSubject());
    }

    public void hire(Director director){
        this.director=director;
        teachers [teacherAmount] = director;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentClass[] getStudentClasses() {
        return studentClasses;
    }

    public void setStudentClasses(StudentClass[] studentClasses) {
        this.studentClasses = studentClasses;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
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
