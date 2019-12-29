package com.codeathon.Resource;

import com.codeathon.repositories.ProductTypeRepository;
import com.codeathon.tables.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ProductType")
public class ProductTypeResource {
    @Autowired
    private ProductTypeRepository productTypeRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/initialize")
    public Iterable<ProductType> initializeProduct(){
        return productTypeRepository.saveAll(buildProductsList());
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<ProductType> getProducts(){
        productTypeRepository.findAll().forEach(System.out::println);
        return productTypeRepository.findAll();

    }

    @RequestMapping(method = RequestMethod.POST)
    public ProductType insert(@RequestBody ProductType product){
        return productTypeRepository.save(product);
    }

    private List<ProductType> buildProductsList() {
        List<ProductType> products = new ArrayList<>();
        return products;

    }
}
