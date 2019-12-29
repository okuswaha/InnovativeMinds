package com.codeathon.repositories;

import com.codeathon.tables.SimulationData;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface SimulationDataRepository extends CrudRepository<SimulationData, String> {
}
