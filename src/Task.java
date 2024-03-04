public class Task {
    private String taskName;
    private String description;
    private int id;
    private StatusOfCase status;

    public Task(String taskName, String description, int id, StatusOfCase status) {
        this.taskName = taskName;
        this.description = description;
        this.id = id;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "Название='" + taskName + '\'' +
                ", Описание='" + description + '\'' +
                ", id=" + id +
                ", Статус=" + status +
                '}';
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public StatusOfCase getStatus() {
        return status;
    }

    public void setStatus(StatusOfCase status) {
        this.status = status;
    }
    public void setChengeTask(Task newTask){
        this.taskName = newTask.getTaskName();
        this.description = newTask.getDescription();
        this.id = newTask.getid();
        this.status = newTask.getStatus();
    }
}
