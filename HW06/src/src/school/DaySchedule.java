package src.school;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {

    private WeekDay weekDay;

    private List<LessonSchedule> subjects = new ArrayList<>();

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

    public List<LessonSchedule> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<LessonSchedule> subjects) {
        this.subjects = subjects;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }
}
