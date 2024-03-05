import java.util.ArrayList;
import java.util.HashMap;


public class TaskManager {
    private int id = 0;
    private final HashMap<Integer, Task> tasks = new HashMap<>();
    private final HashMap<Integer, SubTask> subTasks = new HashMap<>();
    private final HashMap<Integer, Epic> epics = new HashMap<>();
    //d. Создание. Сам объект должен передаваться в качестве параметра.


    //    a. Получение списка всех задач.
    public HashMap<Integer, Task> getTasks() {
        return tasks;
    }

    public HashMap<Integer, SubTask> getSubTasks() {
        return subTasks;
    }

    public HashMap<Integer, Epic> getEpics() {
        return epics;
    }

    //  b. Удаление всех задач.
    public void clearAllTasks() {
        tasks.clear();
    }

    public void clearAllSubTasks() {
        subTasks.clear();
    }

    public void clearAllEpics() {
        epics.clear();
    }

    //  c. Получение по идентификатору.
    public Task getTaskById(int id) {
        return tasks.get(id);
    }

    public SubTask getSubtaskById(int id) {
        return subTasks.get(id);
    }

    public Epic getEpicById(int id) {
        return epics.get(id);
    }
    //Дополнительные методы: a. Получение списка всех подзадач определённого эпика.
    public ArrayList<SubTask> getSubTasksByEpic(Epic epic) {
        ArrayList<SubTask> SubT = epic.getSubTasks();
        for (SubTask obj : SubT) {
            if (epic.id == obj.getEpicID()) {

            } return SubT;
        }

        return null;
    }

    //   d. Создание. Сам объект должен передаваться в качестве параметра.
    public void createTask(Task task) {
        tasks.put(task.getId(), task);
    }

    public void createSubtask(SubTask subTask) {
        subTasks.put(subTask.getId(), subTask);       ////
        Epic a = epics.get(subTask.getEpicID());
        ArrayList<SubTask> SubT = a.getSubTasks();
        SubT.add(subTask);
    }

    public void createEpic(Epic epic) {
        epics.put(epic.getId(), epic);

    }

    //   e. Обновление. Новая версия объекта с верным идентификатором передаётся в виде параметра.
    public void updateTask(Task task) {
        tasks.put(task.getId(), task);
    }

    //   f. Удаление по идентификатору.
    public void removeTaskById(int id) {
        tasks.remove(id);
    }

    public void removeSubTaskById(int id) {
        subTasks.remove(id);
    }

    public void removeEpicById(int id) {
        Epic b = getEpicById(id);
        ArrayList<SubTask> SubT = b.getSubTasks();
        for (SubTask obj : SubT) {
            removeSubTaskById(obj.getId());
        }
        epics.remove(id);
    }

    public int nextId() {
        return ++id;
    }

}

