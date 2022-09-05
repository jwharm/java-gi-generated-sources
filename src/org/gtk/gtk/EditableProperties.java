package org.gtk.gtk;

/**
 * The identifiers for [iface@Gtk.Editable] properties.
 * 
 * See [func@Gtk.Editable.install_properties] for details on how to
 * implement the `GtkEditable` interface.
 */
public enum EditableProperties {

    /**
     * the property id for [property@Gtk.Editable:text]
     */
    PROP_TEXT,
    
    /**
     * the property id for [property@Gtk.Editable:cursor-position]
     */
    PROP_CURSOR_POSITION,
    
    /**
     * the property id for [property@Gtk.Editable:selection-bound]
     */
    PROP_SELECTION_BOUND,
    
    /**
     * the property id for [property@Gtk.Editable:editable]
     */
    PROP_EDITABLE,
    
    /**
     * the property id for [property@Gtk.Editable:width-chars]
     */
    PROP_WIDTH_CHARS,
    
    /**
     * the property id for [property@Gtk.Editable:max-width-chars]
     */
    PROP_MAX_WIDTH_CHARS,
    
    /**
     * the property id for [property@Gtk.Editable:xalign]
     */
    PROP_XALIGN,
    
    /**
     * the property id for [property@Gtk.Editable:enable-undo]
     */
    PROP_ENABLE_UNDO,
    
    /**
     * the number of properties
     */
    NUM_PROPERTIES;
    
    public static EditableProperties fromValue(int value) {
        return switch(value) {
            case 0 -> PROP_TEXT;
            case 1 -> PROP_CURSOR_POSITION;
            case 2 -> PROP_SELECTION_BOUND;
            case 3 -> PROP_EDITABLE;
            case 4 -> PROP_WIDTH_CHARS;
            case 5 -> PROP_MAX_WIDTH_CHARS;
            case 6 -> PROP_XALIGN;
            case 7 -> PROP_ENABLE_UNDO;
            case 8 -> NUM_PROPERTIES;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case PROP_TEXT -> 0;
            case PROP_CURSOR_POSITION -> 1;
            case PROP_SELECTION_BOUND -> 2;
            case PROP_EDITABLE -> 3;
            case PROP_WIDTH_CHARS -> 4;
            case PROP_MAX_WIDTH_CHARS -> 5;
            case PROP_XALIGN -> 6;
            case PROP_ENABLE_UNDO -> 7;
            case NUM_PROPERTIES -> 8;
        };
    }

}
