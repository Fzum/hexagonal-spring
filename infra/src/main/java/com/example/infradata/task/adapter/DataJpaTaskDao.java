package com.example.infradata.task.adapter;

import com.example.domain.model.Task;
import com.example.domain.port.TaskDao;
import com.example.infradata.task.entity.TaskEntity;
import com.example.infradata.task.mapper.TaskEntityMapper;
import com.example.infradata.task.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataJpaTaskDao implements TaskDao {

  private final TaskEntityMapper mapper;
  private final TaskRepository repository;

  @Override
  public Task insertTask(Task task) {
    TaskEntity taskEntity = repository.save(mapper.map(task));
    return mapper.map(taskEntity);
  }

  public Task getTask(String id) {
    return mapper.map(repository.findById(id));
  }
}

