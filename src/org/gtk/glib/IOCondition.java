package org.gtk.glib;

/**
 * A bitwise combination representing a condition to watch for on an
 * event source.
 */
public class IOCondition {

    /**
     * There is data to read.
     */
    public static final int IN = 1;
    
    /**
     * Data can be written (without blocking).
     */
    public static final int OUT = 4;
    
    /**
     * There is urgent data to read.
     */
    public static final int PRI = 2;
    
    /**
     * Error condition.
     */
    public static final int ERR = 8;
    
    /**
     * Hung up (the connection has been broken, usually for
     *            pipes and sockets).
     */
    public static final int HUP = 16;
    
    /**
     * Invalid request. The file descriptor is not open.
     */
    public static final int NVAL = 32;
    
}
