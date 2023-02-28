package com.example.infraweb;

import com.example.infraweb.adapter.TaskController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class InfraWebApplication {

  public static void main(String[] args) {
    var run = SpringApplication.run(InfraWebApplication.class, args);
    var taskControllerAdapter = (TaskController) run.getBean("taskController");
    System.out.println(taskControllerAdapter.getTask("1"));
  }

}
