package school;

import java.time.LocalDate;

public class LessonSchedule {

    public int numberOfLesson;

    public String subjectName;

    public Teacher teacher;

    public DaySchedule daySchedule;


    public LessonSchedule(int numberOfLesson, String subjectName, Teacher teacher, DaySchedule daySchedule) {
        this.numberOfLesson = numberOfLesson;
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.daySchedule = daySchedule;
    }
}
