package com.gabryellr.feignclientsaverequests.feign.handler;

import com.gabryellr.feignclientsaverequests.handlerException.BadRequestCustomException;
import com.gabryellr.feignclientsaverequests.model.requests.ErrorEntity;
import com.gabryellr.feignclientsaverequests.repository.FeignErrorRepository;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

@Component
public class CustomErrorDecoder implements ErrorDecoder {

    @Autowired
    private FeignErrorRepository repository;

    @Override
    public Exception decode(String s, Response response) {
        String requestBody = new String(response.request().body());
        String responseBody = getResponseBody(response.body());

        ErrorEntity errorEntity = new ErrorEntity(requestBody, responseBody, response.status(), LocalDateTime.now());

        this.repository.save(errorEntity);

        if (response.status() == HttpStatus.BAD_REQUEST.value()) {
            throw new BadRequestCustomException("Bad request");
        }

        throw new RuntimeException("other exception");

    }

    private String getResponseBody(Response.Body body) {
        try {
            return StreamUtils.copyToString(body.asInputStream(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
