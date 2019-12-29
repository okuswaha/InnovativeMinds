package com.codeathon.Resource;

import com.codeathon.repositories.ConfigParamsRepository;
import com.codeathon.repositories.ProductRepository;
import com.codeathon.tables.ConfigParams;
import com.codeathon.tables.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ConfigParams")
public class ConfigParamsResource {
    @Autowired
    private ConfigParamsRepository configParamsRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/initialize")
    public Iterable<ConfigParams> initializeProduct(){
        return configParamsRepository.saveAll(buildProductsList());
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<ConfigParams> getProducts(){
        configParamsRepository.findAll().forEach(System.out::println);
        return configParamsRepository.findAll();

    }

    @RequestMapping(method = RequestMethod.POST)
    public ConfigParams insert(@RequestBody ConfigParams product){
        return configParamsRepository.save(product);
    }

    private List<ConfigParams> buildProductsList() {
        List<ConfigParams> products = new ArrayList<>();
        return products;

    }
}
