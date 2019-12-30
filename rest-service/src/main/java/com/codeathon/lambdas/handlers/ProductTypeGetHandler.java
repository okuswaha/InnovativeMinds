package com.codeathon.lambdas.handlers;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.codeathon.config.DynamoConfig;
import com.codeathon.repositories.ProductTypeRepository;
import com.codeathon.tables.ProductType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductTypeGetHandler implements RequestHandler<ProductType, ProductType> {

    @Override
    public ProductType handleRequest(ProductType productType, Context context) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DynamoConfig.class);
        ProductTypeRepository productTypeRepository = applicationContext.getBean(ProductTypeRepository.class);
       return productTypeRepository.save(productType);
    }


}
