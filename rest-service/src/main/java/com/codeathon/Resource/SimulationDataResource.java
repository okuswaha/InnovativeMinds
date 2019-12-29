package com.codeathon.Resource;

import com.codeathon.repositories.SimulationDataRepository;
import com.codeathon.tables.SimulationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/SimulationData")
public class SimulationDataResource {
    @Autowired
    private SimulationDataRepository simulationDataRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/initialize")
    public Iterable<SimulationData> initializeProduct(){
        return simulationDataRepository.saveAll(buildProductsList());
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<SimulationData> getProducts(){
        simulationDataRepository.findAll().forEach(System.out::println);
        return simulationDataRepository.findAll();

    }

    @RequestMapping(method = RequestMethod.POST)
    public SimulationData insert(@RequestBody SimulationData product){
        return simulationDataRepository.save(product);
    }

    private List<SimulationData> buildProductsList() {
        List<SimulationData> products = new ArrayList<>();
        return products;

    }
}
