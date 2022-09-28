package org.gtk.gio;

/**
 * Flags used when creating a binding. These flags determine in which
 * direction the binding works. The default is to synchronize in both
 * directions.
 */
public class SettingsBindFlags {

    /**
     * Equivalent to {@code G_SETTINGS_BIND_GET|G_SETTINGS_BIND_SET}
     */
    public static final SettingsBindFlags DEFAULT = new SettingsBindFlags(0);
    
    /**
     * Update the {@link org.gtk.gobject.Object} property when the setting changes.
     *     It is an error to use this flag if the property is not writable.
     */
    public static final SettingsBindFlags GET = new SettingsBindFlags(1);
    
    /**
     * Update the setting when the {@link org.gtk.gobject.Object} property changes.
     *     It is an error to use this flag if the property is not readable.
     */
    public static final SettingsBindFlags SET = new SettingsBindFlags(2);
    
    /**
     * Do not try to bind a "sensitivity" property to the writability of the setting
     */
    public static final SettingsBindFlags NO_SENSITIVITY = new SettingsBindFlags(4);
    
    /**
     * When set in addition to {@link SettingsBindFlags#GET}, set the {@link org.gtk.gobject.Object} property
     *     value initially from the setting, but do not listen for changes of the setting
     */
    public static final SettingsBindFlags GET_NO_CHANGES = new SettingsBindFlags(8);
    
    /**
     * When passed to g_settings_bind(), uses a pair of mapping functions that invert
     *     the boolean value when mapping between the setting and the property.  The setting and property must both
     *     be booleans.  You cannot pass this flag to g_settings_bind_with_mapping().
     */
    public static final SettingsBindFlags INVERT_BOOLEAN = new SettingsBindFlags(16);
    
    private int value;
    
    public SettingsBindFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SettingsBindFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public SettingsBindFlags combined(SettingsBindFlags mask) {
        return new SettingsBindFlags(this.getValue() | mask.getValue());
    }
    
    public static SettingsBindFlags combined(SettingsBindFlags mask, SettingsBindFlags... masks) {
        int value = mask.getValue();
        for (SettingsBindFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SettingsBindFlags(value);
    }
    
}
