package com.example.dao.service;

import com.example.dao.DAO.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    private MyRepository repository;

    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
