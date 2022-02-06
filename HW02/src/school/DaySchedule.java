package school;

public class DaySchedule {

    private String weekDay;

    private LessonSchedule[] subjects = new LessonSchedule[5];

    private StudentClass studentClass;

    public DaySchedule(String weekDay, LessonSchedule[] subjects, StudentClass studentClass) {
        this.weekDay = weekDay;
        this.subjects = subjects;
        this.studentClass = studentClass;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public LessonSchedule[] getSubjects() {
        return subjects;
    }

    public void setSubjects(LessonSchedule[] subjects) {
        this.subjects = subjects;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }
}
