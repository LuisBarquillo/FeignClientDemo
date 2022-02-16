package com.cognizant.client.exceptions;

public class FeignClientExceptions {
    public static class BadRequestException extends Exception {
        public BadRequestException() {
            super("Bad Request");
        }
    }

    public static class UnauthorizedException extends Exception {
        public UnauthorizedException() {
            super("Unauthorized");
        }
    }

    public static class NotFoundException extends Exception {
        public NotFoundException() {
            super("Not Found");
        }
    }
}
