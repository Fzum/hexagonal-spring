package com.example.infradata.task.mapper;

import com.example.domain.model.Task;
import com.example.infradata.task.entity.TaskEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskEntityMapper {

  Task map(TaskEntity source);

  TaskEntity map(Task source);

}
