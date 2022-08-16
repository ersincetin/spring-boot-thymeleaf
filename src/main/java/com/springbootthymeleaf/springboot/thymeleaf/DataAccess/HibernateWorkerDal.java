package com.springbootthymeleaf.springboot.thymeleaf.DataAccess;

import com.springbootthymeleaf.springboot.thymeleaf.Entities.Worker;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateWorkerDal implements IWorkerDal {
    private EntityManager entityManager;
    private Session session;
    @Autowired
    public HibernateWorkerDal(EntityManager entityManager) {
        this.entityManager = entityManager;
        this.session = entityManager.unwrap(Session.class);
    }

    @Override
    @Transactional
    public List<Worker> getAll() {
        List<Worker> workerList = this.session.createQuery("from Worker").getResultList();
        return workerList;
    }

    @Override
    @Transactional
    public void add(Worker worker) {
        this.session.saveOrUpdate(worker);
    }

    @Override
    @Transactional
    public void update(Worker worker) {
        this.session.saveOrUpdate(worker);
    }

    @Override
    @Transactional
    public void delete(long id) {
        Worker worker = this.session.get(Worker.class, id);
        this.session.delete(worker);
    }

    @Override
    @Transactional
    public Worker getById(long id) {
        Worker worker = this.session.get(Worker.class, id);
        return worker;
    }
}
