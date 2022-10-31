package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutsGroup} represents a group of related keyboard shortcuts
 * or gestures.
 * <p>
 * The group has a title. It may optionally be associated with a view
 * of the application, which can be used to show only relevant shortcuts
 * depending on the application context.
 * <p>
 * This widget is only meant to be used with {@link ShortcutsWindow}.
 */
public class ShortcutsGroup extends org.gtk.gtk.Box implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutsGroup";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ShortcutsGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ShortcutsGroup if its GType is a (or inherits from) "GtkShortcutsGroup".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ShortcutsGroup" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutsGroup", a ClassCastException will be thrown.
     */
    public static ShortcutsGroup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkShortcutsGroup"))) {
            return new ShortcutsGroup(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutsGroup");
        }
    }
}
