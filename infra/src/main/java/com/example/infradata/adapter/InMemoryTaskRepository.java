package com.example.infradata.adapter;

import com.example.domain.model.Task;
import com.example.domain.port.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class InMemoryTaskRepository implements TaskRepository {

  public Task getTask(String id) {
    return new Task(id, "Task " + id, "Description");
  }
}
