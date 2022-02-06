package school;

public class Lesson {

    private LessonSchedule lessonSchedule;

    private StudentClass studentClass;

    private String lessonTopic;

    public Lesson(LessonSchedule lessonSchedule, StudentClass studentClass, String lessonTopic) {
        this.lessonSchedule = lessonSchedule;
        this.studentClass = studentClass;
        this.lessonTopic = lessonTopic;
    }

    public LessonSchedule getLessonSchedule() {
        return lessonSchedule;
    }

    public void setLessonSchedule(LessonSchedule lessonSchedule) {
        this.lessonSchedule = lessonSchedule;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public String getLessonTopic() {
        return lessonTopic;
    }

    public void setLessonTopic(String lessonTopic) {
        this.lessonTopic = lessonTopic;
    }
}
