package com.codeathon.lambda.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaRequestHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String s, Context context) {
        context.getLogger().log("Input : "+ s);
        return "Hello from LamdbaRequestHandler Interface : "+ s;
    }
}
