import java.util.ArrayList;

public class Epic extends Task {
    private ArrayList<SubTask> subTasks;
    public Epic(String taskName, String description, int id){
        super(taskName, description, id, null);
        this.subTasks = new ArrayList<>();
    }

    public ArrayList<SubTask> getSubTasks() {
        return subTasks;
    }
    public void setSubTasks(ArrayList<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    @Override
    public String toString() {
        return "Epic{" +
                "Название='" + taskName + '\'' +
                ", Описание='" + description + '\'' +
                ", id=" + id +
                ", Статус=" + status +
                ", Подзадача=" + subTasks +
                '}';
    }
}
