package org.example;

public class Supervisor implements Worker{
    @Override
    public void startWork() { // при запуске данного метода будет выводится соответствующий текст в терминал */
        System.out.println("- Начальник машинного цеха контролирует работу сотрудников!");
    }
}