package org.gtk.gtk;

/**
 * Error codes for `GtkRecentManager` operations
 */
public enum RecentManagerError {

    /**
     * the URI specified does not exists in
     *   the recently used resources list.
     */
    NOT_FOUND,
    
    /**
     * the URI specified is not valid.
     */
    INVALID_URI,
    
    /**
     * the supplied string is not
     *   UTF-8 encoded.
     */
    INVALID_ENCODING,
    
    /**
     * no application has registered
     *   the specified item.
     */
    NOT_REGISTERED,
    
    /**
     * failure while reading the recently used
     *   resources file.
     */
    READ,
    
    /**
     * failure while writing the recently used
     *   resources file.
     */
    WRITE,
    
    /**
     * unspecified error.
     */
    UNKNOWN;
    
    public static RecentManagerError fromValue(int value) {
        return switch(value) {
            case 0 -> NOT_FOUND;
            case 1 -> INVALID_URI;
            case 2 -> INVALID_ENCODING;
            case 3 -> NOT_REGISTERED;
            case 4 -> READ;
            case 5 -> WRITE;
            case 6 -> UNKNOWN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NOT_FOUND -> 0;
            case INVALID_URI -> 1;
            case INVALID_ENCODING -> 2;
            case NOT_REGISTERED -> 3;
            case READ -> 4;
            case WRITE -> 5;
            case UNKNOWN -> 6;
        };
    }

}
