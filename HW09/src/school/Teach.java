package school;

import myException.MarkDoesNotExist;

import java.io.IOException;

public interface Teach {

    Lesson teachLesson(LessonSchedule lessonSchedule);

    void giveTask(Lesson lesson);

    void putMark(Lesson lesson) throws MarkDoesNotExist, IOException;
}
