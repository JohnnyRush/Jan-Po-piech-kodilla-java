package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        if(LocalDate.now().getDayOfMonth() % 2 != 0) {
           return "Task is done";
        }else{
            return "Task is not done";
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executeTask() == "Task is done") {
            return true;
        }
        return false;
    }
}
