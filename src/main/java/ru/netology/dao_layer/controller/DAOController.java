package ru.netology.dao_layer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.netology.dao_layer.service.DAOService;

import java.util.List;

@Controller
public class DAOController {
    private DAOService service;

    public DAOController(DAOService service){
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    @ResponseBody
    public List<String> getProductName(@RequestParam("name") String customerName) {
        return service.getProducts(customerName);
    }
}
