package com.example.infradata.configuration;

import com.example.domain.port.TaskDao;
import com.example.domain.service.TaskService;
import com.example.domain.service.TaskServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainBeanConfig {

  @Bean
  public TaskService taskService(TaskDao taskDao) {
    return new TaskServiceImpl(taskDao);
  }

}
