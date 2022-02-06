package school;

public class Lesson {

    public LessonSchedule lessonSchedule;

    public StudentClass studentClass;

    public String lessonTopic;

    public Lesson(LessonSchedule lessonSchedule, StudentClass studentClass, String lessonTopic) {
        this.lessonSchedule = lessonSchedule;
        this.studentClass = studentClass;
        this.lessonTopic = lessonTopic;
    }
}
