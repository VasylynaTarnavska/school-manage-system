package src.school;

public interface Teach {

    Lesson teachLesson(LessonSchedule lessonSchedule);

    void giveTask(Lesson lesson);

    void putMark(Lesson lesson);
}
