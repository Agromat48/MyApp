package org.example;

import org.example.aop.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskExecuter {
    private final Task task;

    @Autowired
    public TaskExecuter(Task task) {
        this.task = task;
    }

    @Loggable
    public void executeTask(){
        System.out.println("I am carrying it out: " + task + ". His time: " + task.getDuration());
    }
}
