package school;

public class DaySchedule {

    public String weekDay;

    public LessonSchedule[] subjects = new LessonSchedule[5];

    public StudentClass studentClass;

    public DaySchedule(String weekDay, LessonSchedule[] subjects, StudentClass studentClass) {
        this.weekDay = weekDay;
        this.subjects = subjects;
        this.studentClass = studentClass;
    }
}
