package com.example.domain.service;

import com.example.domain.model.Task;

public interface TaskService {

  Task createTask(Task task);

  Task getTask(String id);
}
