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
public enum ResponseType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Returned if an action widget has no response id,
     *   or if the dialog gets programmatically hidden or destroyed
     */
    NONE(-1),
    /**
     * Generic response id, not used by GTK dialogs
     */
    REJECT(-2),
    /**
     * Generic response id, not used by GTK dialogs
     */
    ACCEPT(-3),
    /**
     * Returned if the dialog is deleted
     */
    DELETE_EVENT(-4),
    /**
     * Returned by OK buttons in GTK dialogs
     */
    OK(-5),
    /**
     * Returned by Cancel buttons in GTK dialogs
     */
    CANCEL(-6),
    /**
     * Returned by Close buttons in GTK dialogs
     */
    CLOSE(-7),
    /**
     * Returned by Yes buttons in GTK dialogs
     */
    YES(-8),
    /**
     * Returned by No buttons in GTK dialogs
     */
    NO(-9),
    /**
     * Returned by Apply buttons in GTK dialogs
     */
    APPLY(-10),
    /**
     * Returned by Help buttons in GTK dialogs
     */
    HELP(-11);
    
    private static final java.lang.String C_TYPE_NAME = "GtkResponseType";
    
    private final int value;
    ResponseType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ResponseType of(int value) {
        return switch (value) {
            case -1 -> NONE;
            case -2 -> REJECT;
            case -3 -> ACCEPT;
            case -4 -> DELETE_EVENT;
            case -5 -> OK;
            case -6 -> CANCEL;
            case -7 -> CLOSE;
            case -8 -> YES;
            case -9 -> NO;
            case -10 -> APPLY;
            case -11 -> HELP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
