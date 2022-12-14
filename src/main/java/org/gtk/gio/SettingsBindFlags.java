package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when creating a binding. These flags determine in which
 * direction the binding works. The default is to synchronize in both
 * directions.
 */
public class SettingsBindFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GSettingsBindFlags";
    
    /**
     * Equivalent to {@code G_SETTINGS_BIND_GET|G_SETTINGS_BIND_SET}
     */
    public static final SettingsBindFlags DEFAULT = new SettingsBindFlags(0);
    
    /**
     * Update the {@link org.gtk.gobject.GObject} property when the setting changes.
     *     It is an error to use this flag if the property is not writable.
     */
    public static final SettingsBindFlags GET = new SettingsBindFlags(1);
    
    /**
     * Update the setting when the {@link org.gtk.gobject.GObject} property changes.
     *     It is an error to use this flag if the property is not readable.
     */
    public static final SettingsBindFlags SET = new SettingsBindFlags(2);
    
    /**
     * Do not try to bind a "sensitivity" property to the writability of the setting
     */
    public static final SettingsBindFlags NO_SENSITIVITY = new SettingsBindFlags(4);
    
    /**
     * When set in addition to {@link SettingsBindFlags#GET}, set the {@link org.gtk.gobject.GObject} property
     *     value initially from the setting, but do not listen for changes of the setting
     */
    public static final SettingsBindFlags GET_NO_CHANGES = new SettingsBindFlags(8);
    
    /**
     * When passed to g_settings_bind(), uses a pair of mapping functions that invert
     *     the boolean value when mapping between the setting and the property.  The setting and property must both
     *     be booleans.  You cannot pass this flag to g_settings_bind_with_mapping().
     */
    public static final SettingsBindFlags INVERT_BOOLEAN = new SettingsBindFlags(16);
    
    /**
     * Create a new SettingsBindFlags with the provided value
     */
    public SettingsBindFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SettingsBindFlags or(SettingsBindFlags... masks) {
        int value = this.getValue();
        for (SettingsBindFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SettingsBindFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SettingsBindFlags combined(SettingsBindFlags mask, SettingsBindFlags... masks) {
        int value = mask.getValue();
        for (SettingsBindFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SettingsBindFlags(value);
    }
}
