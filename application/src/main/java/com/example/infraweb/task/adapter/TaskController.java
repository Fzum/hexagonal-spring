package com.example.infraweb.task.adapter;

import com.example.domain.model.Task;
import com.example.domain.service.TaskService;
import com.example.infraweb.task.dto.TaskDto;
import com.example.infraweb.task.mapper.TaskDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskController {

  private final TaskService taskService;
  private final TaskDtoMapper taskDtoMapper;

  public Task createTask(TaskDto task) {
    return taskService.createTask(taskDtoMapper.map(task));
  }

  public Task getTask(String id) {
    return taskService.getTask(id);
  }
}