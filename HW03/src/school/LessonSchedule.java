package school;

public class LessonSchedule {

    private int numberOfLesson;

    private String subjectName;

    private Teacher teacher;

    private DaySchedule daySchedule;


    public LessonSchedule(int numberOfLesson, String subjectName, Teacher teacher, DaySchedule daySchedule) {
        this.numberOfLesson = numberOfLesson;
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.daySchedule = daySchedule;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    public void setNumberOfLesson(int numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public DaySchedule getDaySchedule() {
        return daySchedule;
    }

    public void setDaySchedule(DaySchedule daySchedule) {
        this.daySchedule = daySchedule;
    }
}
