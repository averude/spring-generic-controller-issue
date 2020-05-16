package com.averude.spring_generic_controller_issue.repository;

import java.util.List;
import java.util.Optional;

public interface IRepository<T> {
    Optional<T> get(Long id);
    List<T> getALl();
    T save(T t);
}
