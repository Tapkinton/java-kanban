public class Task {
    protected String taskName;
    protected String description;
    protected int id;
    protected StatusOfCase status;

    public Task(String taskName, String description, int id, StatusOfCase status) {
        this.taskName = taskName;
        this.description = description;
        this.id = id;
        this.status = status;
    }
   /* public Task(String taskName, String description, StatusOfCase status) {
        this.taskName = taskName;
        this.description = description;
        this.status = status;
    }*/

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatusOfCase getStatus() {
        return status;
    }

    public void setStatus(StatusOfCase status) {
        this.status = status;
    }

}
