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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ShortcutsShortcut(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ShortcutsShortcut if its GType is a (or inherits from) "GtkShortcutsShortcut".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ShortcutsShortcut" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutsShortcut", a ClassCastException will be thrown.
     */
    public static ShortcutsShortcut castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkShortcutsShortcut"))) {
            return new ShortcutsShortcut(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutsShortcut");
        }
    }
}
