package com.example.competition.service;

import com.example.competition.model.Competition;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.util.List;

@Service
public class CompetitionService {
    private List<Competition> competitions;

    @PostConstruct
    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = getClass().getResourceAsStream("/competitions.json");
            competitions = mapper.readValue(is, new TypeReference<List<Competition>>() {});
        } catch (Exception e) {
            throw new RuntimeException("加载静态文件失败", e);
        }
    }

    public List<Competition> getAll() {
        return competitions;
    }

    public Competition getById(int id) {
        return competitions.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
