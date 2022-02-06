package school;

public class StudentClass {

    private int grade;

    private Student[] students;

    private String classRoom;

    private Teacher classTeacher;

    private DaySchedule[] schedule = new DaySchedule[5];


    public StudentClass(int grade, Student[] students, String classRoom, Teacher classTeacher) {
        this.grade = grade;
        this.students = students;
        this.classRoom = classRoom;
        this.classTeacher = classTeacher;
    }

    public void doTask(Task task){
        for (int i = 0; i < students.length; i++) {
            students[i].doTask(task);
        }
        task.setDone(true);
        System.out.println("All students done task:" + task.getProblem());

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public DaySchedule[] getSchedule() {
        return schedule;
    }

    public void setSchedule(DaySchedule[] schedule) {
        this.schedule = schedule;
    }
}
