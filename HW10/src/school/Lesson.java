package school;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Lesson {

    private LessonSchedule lessonSchedule;

    private StudentClass studentClass;

    private String lessonTopic;

    private Teacher teacher;

    private Task task;

    private Map<Student, Integer> marks;

    private LocalDate lessonDate;



    public Lesson(LessonSchedule lessonSchedule, StudentClass studentClass, String lessonTopic) {
        this.lessonSchedule = lessonSchedule;
        this.studentClass = studentClass;
        this.lessonTopic = lessonTopic;
        this.teacher = lessonSchedule.getTeacher();
        this.marks = new TreeMap<>();
        this.lessonDate = LocalDate.now();
    }

    public void addTask(Task task){
        this.task = task;
        studentClass.doTask(task);

    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Map<Student, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<Student, Integer> marks) {
        this.marks = marks;
    }

    public LocalDate getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(LocalDate lessonDate) {
        this.lessonDate = lessonDate;
    }
}
