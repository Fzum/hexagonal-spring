package com.example.domain.port;

import com.example.domain.model.Task;

public interface TaskRepository {

  Task getTask(String id);

}

