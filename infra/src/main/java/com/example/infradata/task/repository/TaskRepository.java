package com.example.infradata.task.repository;

import com.example.infradata.task.entity.TaskEntity;
import org.springframework.stereotype.Service;

public interface TaskRepository {

  TaskEntity save(TaskEntity taskEntity);

  TaskEntity findById(String id);
}

@Service
class TaskRepositoryImpl implements TaskRepository {

  @Override
  public TaskEntity save(TaskEntity taskEntity) {
    return taskEntity;
  }

  @Override
  public TaskEntity findById(String id) {
    return new TaskEntity(id, "Task " + id, "Description");
  }
}