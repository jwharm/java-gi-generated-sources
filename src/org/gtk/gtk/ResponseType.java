package org.gtk.gtk;

/**
 * Predefined values for use as response ids in gtk_dialog_add_button().
 * 
 * All predefined values are negative; GTK leaves values of 0 or greater for
 * application-defined response ids.
 */
public enum ResponseType {

    /**
     * Returned if an action widget has no response id,
     *   or if the dialog gets programmatically hidden or destroyed
     */
    NONE,
    
    /**
     * Generic response id, not used by GTK dialogs
     */
    REJECT,
    
    /**
     * Generic response id, not used by GTK dialogs
     */
    ACCEPT,
    
    /**
     * Returned if the dialog is deleted
     */
    DELETE_EVENT,
    
    /**
     * Returned by OK buttons in GTK dialogs
     */
    OK,
    
    /**
     * Returned by Cancel buttons in GTK dialogs
     */
    CANCEL,
    
    /**
     * Returned by Close buttons in GTK dialogs
     */
    CLOSE,
    
    /**
     * Returned by Yes buttons in GTK dialogs
     */
    YES,
    
    /**
     * Returned by No buttons in GTK dialogs
     */
    NO,
    
    /**
     * Returned by Apply buttons in GTK dialogs
     */
    APPLY,
    
    /**
     * Returned by Help buttons in GTK dialogs
     */
    HELP;
    
    public static ResponseType fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> -1;
            case REJECT -> -2;
            case ACCEPT -> -3;
            case DELETE_EVENT -> -4;
            case OK -> -5;
            case CANCEL -> -6;
            case CLOSE -> -7;
            case YES -> -8;
            case NO -> -9;
            case APPLY -> -10;
            case HELP -> -11;
        };
    }

}
