package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mainTask")
@Scope("prototype")
public class Task {
    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

    private final String name;
    private final Long duration;


    public Long getDuration() {
        return duration;
    }

    public Task() {
        this.duration = 60L;
        this.name = "Task";
    }
}
