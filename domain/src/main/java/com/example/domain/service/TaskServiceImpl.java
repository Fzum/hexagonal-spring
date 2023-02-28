package com.example.domain.service;

import com.example.domain.model.Task;
import com.example.domain.port.TaskRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

  private final TaskRepository taskRepository;

  @Override
  public Task getTask(String id) {
    return taskRepository.getTask(id);
  }
}
