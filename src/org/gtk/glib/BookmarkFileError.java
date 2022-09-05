package org.gtk.glib;

/**
 * Error codes returned by bookmark file parsing.
 */
public enum BookmarkFileError {

    /**
     * URI was ill-formed
     */
    INVALID_URI,
    
    /**
     * a requested field was not found
     */
    INVALID_VALUE,
    
    /**
     * a requested application did
     *     not register a bookmark
     */
    APP_NOT_REGISTERED,
    
    /**
     * a requested URI was not found
     */
    URI_NOT_FOUND,
    
    /**
     * document was ill formed
     */
    READ,
    
    /**
     * the text being parsed was
     *     in an unknown encoding
     */
    UNKNOWN_ENCODING,
    
    /**
     * an error occurred while writing
     */
    WRITE,
    
    /**
     * requested file was not found
     */
    FILE_NOT_FOUND;
    
    public static BookmarkFileError fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID_URI;
            case 1 -> INVALID_VALUE;
            case 2 -> APP_NOT_REGISTERED;
            case 3 -> URI_NOT_FOUND;
            case 4 -> READ;
            case 5 -> UNKNOWN_ENCODING;
            case 6 -> WRITE;
            case 7 -> FILE_NOT_FOUND;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID_URI -> 0;
            case INVALID_VALUE -> 1;
            case APP_NOT_REGISTERED -> 2;
            case URI_NOT_FOUND -> 3;
            case READ -> 4;
            case UNKNOWN_ENCODING -> 5;
            case WRITE -> 6;
            case FILE_NOT_FOUND -> 7;
        };
    }

}
