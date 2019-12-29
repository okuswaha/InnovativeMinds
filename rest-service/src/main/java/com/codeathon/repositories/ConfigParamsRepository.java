package com.codeathon.repositories;

import com.codeathon.tables.ConfigParams;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ConfigParamsRepository extends CrudRepository<ConfigParams, String> {
}
