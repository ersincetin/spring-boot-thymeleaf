package com.springbootthymeleaf.springboot.thymeleaf.Business;

import com.springbootthymeleaf.springboot.thymeleaf.DataAccess.IWorkerDal;
import com.springbootthymeleaf.springboot.thymeleaf.Entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class WorkerManager implements IWorkerService {
    private IWorkerDal workerDal;

    @Autowired
    public WorkerManager(IWorkerDal workerDal) {
        this.workerDal = workerDal;
    }

    @Override
    @Transactional
    public List<Worker> getAll() {
        return this.workerDal.getAll();
    }

    @Override
    @Transactional
    public void add(Worker worker) {
        this.workerDal.add(worker);
    }

    @Override
    @Transactional
    public void update(Worker worker) {
        this.workerDal.update(worker);
    }

    @Override
    @Transactional
    public void delete(Worker worker) {
        this.workerDal.delete(worker);
    }

    @Override
    @Transactional
    public Worker getById(int id) {
        return this.workerDal.getById(id);
    }
}
