package com.example.competition.controller;

import com.example.competition.model.Competition;
import com.example.competition.service.CompetitionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/competitions", produces = "application/json; charset=UTF-8")
public class CompetitionController {
    private final CompetitionService service;

    public CompetitionController(CompetitionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Competition> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Competition getById(@PathVariable int id) {
        return service.getById(id);
    }
}
