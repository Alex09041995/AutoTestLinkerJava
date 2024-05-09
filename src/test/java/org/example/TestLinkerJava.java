package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class TestLinkerJava {

    static ArrayList<Workers> workers; // объявили переменную "doors" для выполнения метода @BeforeEach


    @BeforeEach // аннотация для метода, чтобы до выполнения тестов создавались соответствующие ниже переменные
    void createWorkers() {
        workers = new ArrayList<>();
    }

    @Test
    public void addWorker() {
   //Worker worker = new Worker("Работник"); // создали переменную "worker" с созданием нового работника, и boolean-утверждением "true"
        //не совсем понятен тест, создать новго Worker няапрямую нельзя, т.к. это Interface
        Assertions.assertTrue(true, workers.add(worker)); // метод "Assertions.assertTrue()" проверяет, что предоставленное условие - правда
    }


}
