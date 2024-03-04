public class SubTask extends Task{
    private int epicID;

    public SubTask(String name, String description, int id, StatusOfCase status, int epicID){
        super(name, description, id, status);
        this.epicID = epicID;
    }

    public int getEpicID() {
        return epicID;
    }

    public void setEpicID(int epicID) {
        this.epicID = epicID;
    }
    @Override
    public String toString() {
        return "SubTask{" +
                "Название='" + taskName + '\'' +
                ", Описание='" + description + '\'' +
                ", id=" + id +
                ", Статус=" + status +
                ", Эпик=" + epicID +
                '}';
    }
}
