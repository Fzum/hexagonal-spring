package com.example.infraweb.adapter;

import com.example.domain.model.Task;
import com.example.domain.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskController {

  private final TaskService taskService;

  public Task getTask(String id) {
    return taskService.getTask(id);
  }
}