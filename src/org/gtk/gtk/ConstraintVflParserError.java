package org.gtk.gtk;

/**
 * Domain for VFL parsing errors.
 */
public class ConstraintVflParserError extends io.github.jwharm.javagi.Enumeration {

    /**
     * Invalid or unknown symbol
     */
    public static final ConstraintVflParserError SYMBOL = new ConstraintVflParserError(0);
    
    /**
     * Invalid or unknown attribute
     */
    public static final ConstraintVflParserError ATTRIBUTE = new ConstraintVflParserError(1);
    
    /**
     * Invalid or unknown view
     */
    public static final ConstraintVflParserError VIEW = new ConstraintVflParserError(2);
    
    /**
     * Invalid or unknown metric
     */
    public static final ConstraintVflParserError METRIC = new ConstraintVflParserError(3);
    
    /**
     * Invalid or unknown priority
     */
    public static final ConstraintVflParserError PRIORITY = new ConstraintVflParserError(4);
    
    /**
     * Invalid or unknown relation
     */
    public static final ConstraintVflParserError RELATION = new ConstraintVflParserError(5);
    
    public ConstraintVflParserError(int value) {
        super(value);
    }
    
}
