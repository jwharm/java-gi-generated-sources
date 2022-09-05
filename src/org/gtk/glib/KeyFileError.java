package org.gtk.glib;

/**
 * Error codes returned by key file parsing.
 */
public enum KeyFileError {

    /**
     * the text being parsed was in
     *   an unknown encoding
     */
    UNKNOWN_ENCODING,
    
    /**
     * document was ill-formed
     */
    PARSE,
    
    /**
     * the file was not found
     */
    NOT_FOUND,
    
    /**
     * a requested key was not found
     */
    KEY_NOT_FOUND,
    
    /**
     * a requested group was not found
     */
    GROUP_NOT_FOUND,
    
    /**
     * a value could not be parsed
     */
    INVALID_VALUE;
    
    public static KeyFileError fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN_ENCODING;
            case 1 -> PARSE;
            case 2 -> NOT_FOUND;
            case 3 -> KEY_NOT_FOUND;
            case 4 -> GROUP_NOT_FOUND;
            case 5 -> INVALID_VALUE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN_ENCODING -> 0;
            case PARSE -> 1;
            case NOT_FOUND -> 2;
            case KEY_NOT_FOUND -> 3;
            case GROUP_NOT_FOUND -> 4;
            case INVALID_VALUE -> 5;
        };
    }

}
