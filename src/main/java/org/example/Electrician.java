package org.example;

public class Electrician implements Worker{ // создали класс электрика, имплементирующийся от класса "Worker"  */
@Override
public void startWork() {
    System.out.println("- Электрик начал работу с проводкой автомобиля!");
    }
}
