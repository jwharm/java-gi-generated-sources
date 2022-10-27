package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The identifiers for {@code Gtk.Editable} properties.
 * <p>
 * See {@link Editable#installProperties} for details on how to
 * implement the {@code GtkEditable} interface.
 */
public class EditableProperties extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the property id for {@code Gtk.Editable:text}
     */
    public static final EditableProperties PROP_TEXT = new EditableProperties(0);
    
    /**
     * the property id for {@code Gtk.Editable:cursor-position}
     */
    public static final EditableProperties PROP_CURSOR_POSITION = new EditableProperties(1);
    
    /**
     * the property id for {@code Gtk.Editable:selection-bound}
     */
    public static final EditableProperties PROP_SELECTION_BOUND = new EditableProperties(2);
    
    /**
     * the property id for {@code Gtk.Editable:editable}
     */
    public static final EditableProperties PROP_EDITABLE = new EditableProperties(3);
    
    /**
     * the property id for {@code Gtk.Editable:width-chars}
     */
    public static final EditableProperties PROP_WIDTH_CHARS = new EditableProperties(4);
    
    /**
     * the property id for {@code Gtk.Editable:max-width-chars}
     */
    public static final EditableProperties PROP_MAX_WIDTH_CHARS = new EditableProperties(5);
    
    /**
     * the property id for {@code Gtk.Editable:xalign}
     */
    public static final EditableProperties PROP_XALIGN = new EditableProperties(6);
    
    /**
     * the property id for {@code Gtk.Editable:enable-undo}
     */
    public static final EditableProperties PROP_ENABLE_UNDO = new EditableProperties(7);
    
    /**
     * the number of properties
     */
    public static final EditableProperties NUM_PROPERTIES = new EditableProperties(8);
    
    public EditableProperties(int value) {
        super(value);
    }
}
