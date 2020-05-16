package com.averude.spring_generic_controller_issue.controller;

import com.averude.spring_generic_controller_issue.repository.IRepository;

import java.util.List;
import java.util.Optional;

public abstract class AController<T> {

    private IRepository<T> repository;

    public AController(IRepository<T> repository) {
        this.repository = repository;
    }

    public Optional<T> get(Long id) {
        return repository.get(id);
    }

    public List<T> getAll() {
        return repository.getALl();
    }

    public T post(T t) {
        return repository.save(t);
    }
}
