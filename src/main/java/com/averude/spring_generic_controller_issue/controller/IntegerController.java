package com.averude.spring_generic_controller_issue.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@RequestMapping("/integers")
public interface IntegerController {
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Optional<Integer> get(@PathVariable Long id);

    @RequestMapping(method = RequestMethod.GET)
    List<Integer> getAll();

    @RequestMapping(method = RequestMethod.POST)
    Integer post(@RequestBody Integer t);
}
