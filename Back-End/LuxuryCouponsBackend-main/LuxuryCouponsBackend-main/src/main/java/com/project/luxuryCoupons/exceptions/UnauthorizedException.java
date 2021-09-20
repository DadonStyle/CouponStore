package com.project.luxuryCoupons.exceptions;

/**
 * Unauthorized Exception class
 * uses custom exception in case of incorrect information sent to the login manager class
 */
public class UnauthorizedException extends Exception{
    /**
     * Constructor for creating new exception
     *
     * @param message - the custom message for the report
     */
    public UnauthorizedException(String message) {
        super(message);
    }
}
