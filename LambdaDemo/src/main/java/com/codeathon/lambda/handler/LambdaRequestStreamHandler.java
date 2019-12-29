package com.codeathon.lambda.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.util.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LambdaRequestStreamHandler implements RequestStreamHandler {
    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        context.getLogger().log("Input : "+ inputStream.toString());
        final String input = IOUtils.toString(inputStream);
        outputStream.write(("Hello from RequestStreamHandler :" + input).getBytes());
    }
}
