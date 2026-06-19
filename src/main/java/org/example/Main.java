package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import java.text.Annotation;

public class  Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example");

//        Task task1 = context.getBean(Task.class);
//        Task task2 = context.getBean(Task.class);

//        System.out.println(task1 == task2);

//        TaskExecuter taskExecuter = context.getBean(TaskExecuter.class);
//        taskExecuter.executeTask();

//        var properties = context.getBean(TaskProperties.class);
//        System.out.println(properties);

        TaskManager taskManager = context.getBean(TaskManager.class);

        taskManager.printTask();

        TaskExecuter taskExecuter = context.getBean(TaskExecuter.class);

        taskExecuter.executeTask();

        context.close();
    }
}