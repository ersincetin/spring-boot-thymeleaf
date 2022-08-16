package com.springbootthymeleaf.springboot.thymeleaf.DataAccess;

import com.springbootthymeleaf.springboot.thymeleaf.Entities.Worker;

import java.util.List;

public interface IWorkerDal {

    List<Worker> getAll();
    void add(Worker worker);
    void update(Worker worker);
    void delete(Worker worker);
    Worker getById(int id);
}
