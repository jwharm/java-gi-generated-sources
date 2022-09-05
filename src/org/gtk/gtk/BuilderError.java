package org.gtk.gtk;

/**
 * Error codes that identify various errors that can occur while using
 * `GtkBuilder`.
 */
public enum BuilderError {

    /**
     * A type-func attribute didn’t name
     *  a function that returns a `GType`.
     */
    INVALID_TYPE_FUNCTION,
    
    /**
     * The input contained a tag that `GtkBuilder`
     *  can’t handle.
     */
    UNHANDLED_TAG,
    
    /**
     * An attribute that is required by
     *  `GtkBuilder` was missing.
     */
    MISSING_ATTRIBUTE,
    
    /**
     * `GtkBuilder` found an attribute that
     *  it doesn’t understand.
     */
    INVALID_ATTRIBUTE,
    
    /**
     * `GtkBuilder` found a tag that
     *  it doesn’t understand.
     */
    INVALID_TAG,
    
    /**
     * A required property value was
     *  missing.
     */
    MISSING_PROPERTY_VALUE,
    
    /**
     * `GtkBuilder` couldn’t parse
     *  some attribute value.
     */
    INVALID_VALUE,
    
    /**
     * The input file requires a newer version
     *  of GTK.
     */
    VERSION_MISMATCH,
    
    /**
     * An object id occurred twice.
     */
    DUPLICATE_ID,
    
    /**
     * A specified object type is of the same type or
     *  derived from the type of the composite class being extended with builder XML.
     */
    OBJECT_TYPE_REFUSED,
    
    /**
     * The wrong type was specified in a composite class’s template XML
     */
    TEMPLATE_MISMATCH,
    
    /**
     * The specified property is unknown for the object class.
     */
    INVALID_PROPERTY,
    
    /**
     * The specified signal is unknown for the object class.
     */
    INVALID_SIGNAL,
    
    /**
     * An object id is unknown.
     */
    INVALID_ID,
    
    /**
     * A function could not be found. This often happens
     *   when symbols are set to be kept private. Compiling code with -rdynamic or using the
     *   `gmodule-export-2.0` pkgconfig module can fix this problem.
     */
    INVALID_FUNCTION;
    
    public static BuilderError fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID_TYPE_FUNCTION;
            case 1 -> UNHANDLED_TAG;
            case 2 -> MISSING_ATTRIBUTE;
            case 3 -> INVALID_ATTRIBUTE;
            case 4 -> INVALID_TAG;
            case 5 -> MISSING_PROPERTY_VALUE;
            case 6 -> INVALID_VALUE;
            case 7 -> VERSION_MISMATCH;
            case 8 -> DUPLICATE_ID;
            case 9 -> OBJECT_TYPE_REFUSED;
            case 10 -> TEMPLATE_MISMATCH;
            case 11 -> INVALID_PROPERTY;
            case 12 -> INVALID_SIGNAL;
            case 13 -> INVALID_ID;
            case 14 -> INVALID_FUNCTION;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID_TYPE_FUNCTION -> 0;
            case UNHANDLED_TAG -> 1;
            case MISSING_ATTRIBUTE -> 2;
            case INVALID_ATTRIBUTE -> 3;
            case INVALID_TAG -> 4;
            case MISSING_PROPERTY_VALUE -> 5;
            case INVALID_VALUE -> 6;
            case VERSION_MISMATCH -> 7;
            case DUPLICATE_ID -> 8;
            case OBJECT_TYPE_REFUSED -> 9;
            case TEMPLATE_MISMATCH -> 10;
            case INVALID_PROPERTY -> 11;
            case INVALID_SIGNAL -> 12;
            case INVALID_ID -> 13;
            case INVALID_FUNCTION -> 14;
        };
    }

}
