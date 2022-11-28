package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutsShortcut} represents a single keyboard shortcut or gesture
 * with a short text.
 * <p>
 * This widget is only meant to be used with {@code GtkShortcutsWindow}.
 */
public class ShortcutsShortcut extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutsShortcut";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShortcutsShortcut proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutsShortcut(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ShortcutsShortcut if its GType is a (or inherits from) "GtkShortcutsShortcut".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ShortcutsShortcut} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutsShortcut", a ClassCastException will be thrown.
     */
    public static ShortcutsShortcut castFrom(org.gtk.gobject.Object gobject) {
            return new ShortcutsShortcut(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcuts_shortcut_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link ShortcutsShortcut.Build} object constructs a {@link ShortcutsShortcut} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ShortcutsShortcut} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutsShortcut} using {@link ShortcutsShortcut#castFrom}.
         * @return A new instance of {@code ShortcutsShortcut} with the properties 
         *         that were set in the Build object.
         */
        public ShortcutsShortcut construct() {
            return ShortcutsShortcut.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ShortcutsShortcut.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The size group for the accelerator portion of this shortcut.
         * <p>
         * This is used internally by GTK, and must not be modified by applications.
         * @param accelSizeGroup The value for the {@code accel-size-group} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccelSizeGroup(org.gtk.gtk.SizeGroup accelSizeGroup) {
            names.add("accel-size-group");
            values.add(org.gtk.gobject.Value.create(accelSizeGroup));
            return this;
        }
        
        /**
         * The accelerator(s) represented by this object.
         * <p>
         * This property is used if {@code Gtk.ShortcutsShortcut:shortcut-type}
         * is set to {@link ShortcutType#ACCELERATOR}.
         * <p>
         * The syntax of this property is (an extension of) the syntax understood
         * by {@link Gtk#acceleratorParse}. Multiple accelerators can be specified
         * by separating them with a space, but keep in mind that the available width
         * is limited.
         * <p>
         * It is also possible to specify ranges of shortcuts, using "..." between
         * the keys. Sequences of keys can be specified using a "+" or "&amp;" between
         * the keys.
         * <p>
         * Examples:
         * <ul>
         * <li>A single shortcut: &lt;ctl&gt;&lt;alt&gt;delete
         * <li>Two alternative shortcuts: &lt;shift&gt;a Home
         * <li>A range of shortcuts: &lt;alt&gt;1...&lt;alt&gt;9
         * <li>Several keys pressed together: Control_L&amp;Control_R
         * <li>A sequence of shortcuts or keys: &lt;ctl&gt;c+&lt;ctl&gt;x
         * </ul>
         * <p>
         * Use "+" instead of "&amp;" when the keys may (or have to be) pressed
         * sequentially (e.g use "t+t" for 'press the t key twice').
         * <p>
         * Note that &lt;, &gt; and &amp; need to be escaped as &amp;lt;, &amp;gt; and &amp;amp; when used
         * in .ui files.
         * @param accelerator The value for the {@code accelerator} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccelerator(java.lang.String accelerator) {
            names.add("accelerator");
            values.add(org.gtk.gobject.Value.create(accelerator));
            return this;
        }
        
        /**
         * A detailed action name.
         * <p>
         * If this is set for a shortcut of type {@link ShortcutType#ACCELERATOR},
         * then GTK will use the accelerators that are associated with the
         * action via {@link Application#setAccelsForAction}, and
         * setting {@code Gtk.ShortcutsShortcut:accelerator} is not necessary.
         * @param actionName The value for the {@code action-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setActionName(java.lang.String actionName) {
            names.add("action-name");
            values.add(org.gtk.gobject.Value.create(actionName));
            return this;
        }
        
        /**
         * The text direction for which this shortcut is active.
         * <p>
         * If the shortcut is used regardless of the text direction,
         * set this property to {@link TextDirection#NONE}.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDirection(org.gtk.gtk.TextDirection direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * An icon to represent the shortcut or gesture.
         * <p>
         * This property is used if {@code Gtk.ShortcutsShortcut:shortcut-type}
         * is set to {@link ShortcutType#GESTURE}.
         * <p>
         * For the other predefined gesture types, GTK provides an icon on its own.
         * @param icon The value for the {@code icon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIcon(org.gtk.gio.Icon icon) {
            names.add("icon");
            values.add(org.gtk.gobject.Value.create(icon));
            return this;
        }
        
        /**
         * {@code true} if an icon has been set.
         * @param iconSet The value for the {@code icon-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIconSet(boolean iconSet) {
            names.add("icon-set");
            values.add(org.gtk.gobject.Value.create(iconSet));
            return this;
        }
        
        /**
         * The type of shortcut that is represented.
         * @param shortcutType The value for the {@code shortcut-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShortcutType(org.gtk.gtk.ShortcutType shortcutType) {
            names.add("shortcut-type");
            values.add(org.gtk.gobject.Value.create(shortcutType));
            return this;
        }
        
        /**
         * The subtitle for the shortcut or gesture.
         * <p>
         * This is typically used for gestures and should be a short, one-line
         * text that describes the gesture itself. For the predefined gesture
         * types, GTK provides a subtitle on its own.
         * @param subtitle The value for the {@code subtitle} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSubtitle(java.lang.String subtitle) {
            names.add("subtitle");
            values.add(org.gtk.gobject.Value.create(subtitle));
            return this;
        }
        
        /**
         * {@code true} if a subtitle has been set.
         * @param subtitleSet The value for the {@code subtitle-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSubtitleSet(boolean subtitleSet) {
            names.add("subtitle-set");
            values.add(org.gtk.gobject.Value.create(subtitleSet));
            return this;
        }
        
        /**
         * The textual description for the shortcut or gesture represented by
         * this object.
         * <p>
         * This should be a short string that can fit in a single line.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * The size group for the textual portion of this shortcut.
         * <p>
         * This is used internally by GTK, and must not be modified by applications.
         * @param titleSizeGroup The value for the {@code title-size-group} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitleSizeGroup(org.gtk.gtk.SizeGroup titleSizeGroup) {
            names.add("title-size-group");
            values.add(org.gtk.gobject.Value.create(titleSizeGroup));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcuts_shortcut_get_type = Interop.downcallHandle(
            "gtk_shortcuts_shortcut_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
