package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Workers workers = new Workers(); // создали объект на основе класса "Workers", и переменную "workers" и выделили соответственно под объект память */

        Worker mechanic = new Mechanic(); // создали переменные типа данных на основе класса "Worker"*/
        Worker electrician = new Electrician();
        Worker fitter = new Fitter();
        Worker supervisor = new Supervisor();

        workers.addWorker(mechanic); // с помощью метода ".addWorker" добавляем наших работников к переменной "workers" */
        workers.addWorker(electrician);
        workers.addWorker(fitter);
        workers.addWorker(supervisor);
        workers.startWork(); // вызываем метод ".startWork()" для переменной "workers" чтобы наши работники приступили к работе  */

    }
}