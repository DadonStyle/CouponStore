package com.project.luxuryCoupons.exceptions;

/**
* The Luxury coupons exception class
* uses custom exception in case of incorrect information sent to the other classes in the program
 */
public class TokenExpiredException extends Exception{
    /**
     * Constructor for creating new exception
     * @param message - the custom message for the report
     */
    public TokenExpiredException(String message) {
        super(message);
    }
}
