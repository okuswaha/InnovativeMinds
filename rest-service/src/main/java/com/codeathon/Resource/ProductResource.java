package com.codeathon.Resource;

import com.codeathon.repositories.ProductRepository;
import com.codeathon.tables.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/initialize")
    public Iterable<Product> initializeProduct(){
        return productRepository.saveAll(buildProductsList());
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Product> getProducts(){
        productRepository.findAll().forEach(System.out::println);
        return productRepository.findAll();

    }

    @RequestMapping(method = RequestMethod.POST)
    public Product insert(@RequestBody Product product){
        return productRepository.save(product);
    }

    private List<Product> buildProductsList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Paper","Used for writing"));
        products.add(new Product("Rock","Used for weight to hold papers on desk"));
        products.add(new Product("Scissors","Used for cutting"));
        return products;

    }
}
