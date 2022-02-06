package src.school;

public class Task {

    private String problem;

    private boolean isDone;

    public Task(String problem) {
        this.problem = problem;
        isDone = false;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
