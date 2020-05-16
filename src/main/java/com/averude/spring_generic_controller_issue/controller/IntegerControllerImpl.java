package com.averude.spring_generic_controller_issue.controller;

import com.averude.spring_generic_controller_issue.repository.IntegerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegerControllerImpl extends AController<Integer> implements IntegerController {
    @Autowired
    public IntegerControllerImpl(IntegerRepository repository) {
        super(repository);
    }
}
