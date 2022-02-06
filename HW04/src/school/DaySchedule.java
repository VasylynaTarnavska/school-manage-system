package school;

public class DaySchedule {

    private WeekDay weekDay;

    private LessonSchedule[] subjects = new LessonSchedule[5];

    private StudentClass studentClass;

    public DaySchedule(WeekDay weekDay,  StudentClass studentClass) {
        this.weekDay = weekDay;
        this.studentClass = studentClass;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
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
