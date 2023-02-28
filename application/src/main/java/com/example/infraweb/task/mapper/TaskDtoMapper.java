package com.example.infraweb.task.mapper;

import com.example.domain.model.Task;
import com.example.infraweb.task.dto.TaskDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskDtoMapper {

  Task map(TaskDto source);

}
