

public class Main {
    public static void main(String[] args) {

        TaskManager t = new TaskManager();

        Task r = new Task("ИНТЕРНЕТ", "Оплатить интернет.", t.nextId(), StatusOfCase.NEW);
        t.createTask(r);
        System.out.println(t.getTaskById(r.getId()));
        Task e = new Task("ИНТЕРНЕТ", "Оплатить интернет.", t.nextId(), StatusOfCase.NEW);
        t.createTask(e);
        System.out.println(t.getTaskById(e.getId()));
        Epic c = new Epic("Оплатить услуги", "что-то там оплатить",t.nextId());
        t.createEpic(c);
        SubTask q = new SubTask("подзадача 1", "описание подзадачи 1", t.nextId(), StatusOfCase.NEW, c.getId());
        t.createSubtask(q);
        System.out.println(c);
        System.out.println(q);



        /*new Task("СТРИЖКА", "Сходить в парикмахерскую.", id++, StatusOfCase.NEW);
        new Task("ПОДАРОК", "Выбрать подарок подруге на ДР.", id++, StatusOfCase.NEW);
        new Task("ТЕАТР", "Купить билеты в театр.", id++, StatusOfCase.NEW);
        new Task("УЧЁБА", "Посетить вебинар по английскому языку.", id++, StatusOfCase.NEW);
        new Task("УБОРКА", "Купить пылесос.", id++, StatusOfCase.NEW);*/

    }
}

