import java.util.ArrayList;


public class TaskManager {
    private int id = 1;
    private final ArrayList<Task> tasks = addAllTasks(); //d. Создание. Сам объект должен передаваться в качестве параметра.

    public static void main(String[] args) {

        TaskManager t = new TaskManager();
        ArrayList<Task> allTasks = t.getAllTasks();  //a. Получение списка всех задач.
        t.getTasksById(5);                           // c. Получение по идентификатору.
        t.changeTask(new Task("ЗУБЫ", "Поставить пломбу.", t.id = 2, StatusOfCase.NEW));    // e. Обновление. Новая версия объекта с верным идентификатором передаётся в виде параметра.
        t.clearById(1);                                    // f. Удаление по идентификатору.
        t.clearAllTasks();                            // b. Удаление всех задач.
        System.out.println(t.tasks);
    }
    public ArrayList<Task> addAllTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("ИНТЕРНЕТ", "Оплатить интернет.", id++, StatusOfCase.NEW));
        tasks.add(new Task("СТРИЖКА", "Сходить в парикмахерскую.", id++, StatusOfCase.NEW));
        tasks.add(new Task("ПОДАРОК", "Выбрать подарок подруге на ДР.", id++, StatusOfCase.NEW));
        tasks.add(new Task("ТЕАТР", "Купить билеты в театр.", id++, StatusOfCase.NEW));
        tasks.add(new Task("УЧЁБА", "Посетить вебинар по английскому языку.", id++, StatusOfCase.NEW));
        tasks.add(new Task("УБОРКА", "Купить пылесос.", id++, StatusOfCase.NEW));
        return tasks;
    }
    public void clearById(int id) {
        for (Task obj : tasks) {
            if (id == obj.getid()) {
                System.out.println(obj);
                tasks.remove(obj);
            }
        }
    }
    public void changeTask(Task newTask) {
        for (Task obj : tasks) {
            if (newTask.getid() == obj.getid()) {
                obj.setChengeTask(newTask);
            }
        }
    }
        public void clearAllTasks() {
            tasks.clear();
        }
        public ArrayList<Task> getAllTasks() {
            ArrayList<Task> taskArrayList = new ArrayList<>(tasks);
            return taskArrayList;
        }
        public Task getTasksById(int id){
            for (Task obj : tasks) {
                if (id == obj.getid()) {
                    return obj;
                }
            }
            return null;
        }

    }

