package org.gtk.gio;

/**
 * Flags used when creating a binding. These flags determine in which
 * direction the binding works. The default is to synchronize in both
 * directions.
 */
public class SettingsBindFlags {

    /**
     * Equivalent to <code>G_SETTINGS_BIND_GET|G_SETTINGS_BIND_SET</code>
     */
    public static final int DEFAULT = 0;
    
    /**
     * Update the #GObject property when the setting changes.
     *     It is an error to use this flag if the property is not writable.
     */
    public static final int GET = 1;
    
    /**
     * Update the setting when the #GObject property changes.
     *     It is an error to use this flag if the property is not readable.
     */
    public static final int SET = 2;
    
    /**
     * Do not try to bind a &#34;sensitivity&#34; property to the writability of the setting
     */
    public static final int NO_SENSITIVITY = 4;
    
    /**
     * When set in addition to <code>G_SETTINGS_BIND_GET,</code> set the #GObject property
     *     value initially from the setting, but do not listen for changes of the setting
     */
    public static final int GET_NO_CHANGES = 8;
    
    /**
     * When passed to g_settings_bind(), uses a pair of mapping functions that invert
     *     the boolean value when mapping between the setting and the property.  The setting and property must both
     *     be booleans.  You cannot pass this flag to g_settings_bind_with_mapping().
     */
    public static final int INVERT_BOOLEAN = 16;
    
}
