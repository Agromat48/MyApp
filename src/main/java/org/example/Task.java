package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mainTask")
//@Scope("prototype")
public class Task {
    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

    private final String name;
    private final Integer duration;

    @PostConstruct
    public void postConstruct() {
//        System.out.println("Task postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
//        System.out.println("Task preDestroy");
    }

    public Integer getDuration() {
        return duration;
    }

    public Task(
            @Value("${task.name}") String name,
            @Value("${task.duration}") Integer duration
    ) {
        this.duration = duration;
        this.name = name;
    }
}
