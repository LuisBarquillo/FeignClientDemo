package com.cognizant.client.configuration;

import com.cognizant.client.exceptions.FeignClientExceptions;
import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignClientErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()) {
            case 400:
                return new FeignClientExceptions.BadRequestException();
            case 401:
                return new FeignClientExceptions.UnauthorizedException();
            case 404:
                return new FeignClientExceptions.NotFoundException();
            default:
                return new Exception("Error");
        }
    }
}
