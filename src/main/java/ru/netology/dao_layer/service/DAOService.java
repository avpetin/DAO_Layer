package ru.netology.dao_layer.service;

import org.springframework.stereotype.Service;
import ru.netology.dao_layer.repository.DAORepository;

import java.util.List;

@Service
public class DAOService {
    private DAORepository repository;

    public DAOService(DAORepository repository){
        this.repository = repository;
    }

    public List<String> getProducts(String name) {
        return repository.getProductName(name);
    }
}
