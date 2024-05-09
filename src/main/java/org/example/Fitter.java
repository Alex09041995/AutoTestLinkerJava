package org.example;

public class Fitter implements Worker{
    @Override
    public void startWork() {
        System.out.println("- Сборщик начал работу с деталями автомобиля!");
    }
}
