package com.springbootthymeleaf.springboot.thymeleaf.Business;

import com.springbootthymeleaf.springboot.thymeleaf.Entities.Worker;

import java.util.List;

public interface IWorkerService {
    List<Worker> getAll();

    void add(Worker worker);

    void update(Worker worker);

    void delete(long id);

    Worker getById(long id);
}
