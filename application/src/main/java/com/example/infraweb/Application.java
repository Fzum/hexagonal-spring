package com.example.infraweb;

import com.example.infraweb.task.adapter.TaskController;
import com.example.infraweb.task.dto.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class Application {

  public static void main(String[] args) {
    var run = SpringApplication.run(Application.class, args);
    var taskControllerAdapter = (TaskController) run.getBean("taskController");

    System.out.println(taskControllerAdapter.getTask("1"));
    System.out.println(
        taskControllerAdapter.createTask(new TaskDto("2", "Task 2", "Description 2")));
  }

}
