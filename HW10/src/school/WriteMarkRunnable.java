package school;


import java.io.FileWriter;
import java.io.IOException;

public class WriteMarkRunnable implements Runnable{

    private Lesson lesson;
    private Student student;
    private Integer mark;

    public WriteMarkRunnable(Lesson lesson, Student student, Integer mark) {
        this.lesson = lesson;
        this.student = student;
        this.mark = mark;
    }

    @Override
    public void run() {
        try {
            FileWriter writeMark = new FileWriter(student.getDiary(), true);
            writeMark.append("\n" + lesson.getLessonDate() + " ").append(lesson.getLessonSchedule().getSubjectName().name() + " ").append(mark.toString() + " ");
            writeMark.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
