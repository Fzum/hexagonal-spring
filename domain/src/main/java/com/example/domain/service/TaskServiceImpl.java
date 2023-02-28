package com.example.domain.service;

import com.example.domain.model.Task;
import com.example.domain.port.TaskDao;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

  private final TaskDao taskDao;

  @Override
  public Task createTask(Task task) {
    return taskDao.insertTask(task);
  }

  @Override
  public Task getTask(String id) {
    return taskDao.getTask(id);
  }
}
