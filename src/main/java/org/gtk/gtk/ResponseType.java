package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Predefined values for use as response ids in gtk_dialog_add_button().
 * <p>
 * All predefined values are negative; GTK leaves values of 0 or greater for
 * application-defined response ids.
 */
public class ResponseType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkResponseType";
    
    /**
     * Returned if an action widget has no response id,
     *   or if the dialog gets programmatically hidden or destroyed
     */
    public static final ResponseType NONE = new ResponseType(-1);
    
    /**
     * Generic response id, not used by GTK dialogs
     */
    public static final ResponseType REJECT = new ResponseType(-2);
    
    /**
     * Generic response id, not used by GTK dialogs
     */
    public static final ResponseType ACCEPT = new ResponseType(-3);
    
    /**
     * Returned if the dialog is deleted
     */
    public static final ResponseType DELETE_EVENT = new ResponseType(-4);
    
    /**
     * Returned by OK buttons in GTK dialogs
     */
    public static final ResponseType OK = new ResponseType(-5);
    
    /**
     * Returned by Cancel buttons in GTK dialogs
     */
    public static final ResponseType CANCEL = new ResponseType(-6);
    
    /**
     * Returned by Close buttons in GTK dialogs
     */
    public static final ResponseType CLOSE = new ResponseType(-7);
    
    /**
     * Returned by Yes buttons in GTK dialogs
     */
    public static final ResponseType YES = new ResponseType(-8);
    
    /**
     * Returned by No buttons in GTK dialogs
     */
    public static final ResponseType NO = new ResponseType(-9);
    
    /**
     * Returned by Apply buttons in GTK dialogs
     */
    public static final ResponseType APPLY = new ResponseType(-10);
    
    /**
     * Returned by Help buttons in GTK dialogs
     */
    public static final ResponseType HELP = new ResponseType(-11);
    
    public ResponseType(int value) {
        super(value);
    }
}
