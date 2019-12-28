package com.codeathon.Resource;

import com.codeathon.repositories.ProductRepository;
import com.codeathon.tables.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductResource {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String welcome(){
        return "Welcome";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/get-products")
    public List<Product> getProducts(){
        productRepository.findAll().forEach(System.out::println);
        return new ArrayList<>();

    }
}
