package com.averude.spring_generic_controller_issue.repository;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class IntegerRepository implements IRepository<Integer> {
    @Override
    public Optional<Integer> get(Long id) {
        return Optional.of(10);
    }

    @Override
    public List<Integer> getALl() {
        return Arrays.asList(10,20,30);
    }

    @Override
    public Integer save(Integer integer) {
        return integer;
    }
}
