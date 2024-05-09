package org.example;

import java.util.ArrayList;

public class Workers {
    private ArrayList<Worker> workers = new ArrayList<>(); // создали коллекцию-массив с типом-классом "Worker" и переменной "workers", и модификатором доступа "private", чтобы не было свободного доступа */
    private Worker worker;

    public void addWorker(Worker worker) { // создали метод для добавления работника в переменную "workers" */
        workers.add(worker);
    }

    public void deleteWorker() {
        deleteWorker(null);
    }

    public void deleteWorker(Worker worker) { // создали метод для удаления работника из переменной "workers" */
        workers.remove(worker);
    }

    public void startWork() { // создали метод "startWork" чтобы запустить работу сотрудников */
        System.out.println("Работники машинного цеха приступили к работе:");
        for(Worker worker : workers) { // по циклу "for" перебираем всех работников вызывая у переменной метод ".startWork()"" */
            worker.startWork();
        }
    }
}