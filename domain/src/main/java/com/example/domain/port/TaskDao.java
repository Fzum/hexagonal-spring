package com.example.domain.port;

import com.example.domain.model.Task;

public interface TaskDao {

  Task insertTask(Task task);

  Task getTask(String id);
}

