package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkConstraintLayout}.
 */
public class ConstraintLayoutChild extends org.gtk.gtk.LayoutChild {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintLayoutChild";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ConstraintLayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ConstraintLayoutChild if its GType is a (or inherits from) "GtkConstraintLayoutChild".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ConstraintLayoutChild" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkConstraintLayoutChild", a ClassCastException will be thrown.
     */
    public static ConstraintLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkConstraintLayoutChild"))) {
            return new ConstraintLayoutChild(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkConstraintLayoutChild");
        }
    }
}
