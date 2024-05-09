package org.example;

public class Mechanic implements Worker{
    @Override
    public void startWork() {
        System.out.println("- Механик начал работу с запчастями автомобиля!");
    }
}
