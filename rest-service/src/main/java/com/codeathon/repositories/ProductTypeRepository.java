package com.codeathon.repositories;

import com.codeathon.tables.ProductType;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ProductTypeRepository extends CrudRepository<ProductType, String> {
}
