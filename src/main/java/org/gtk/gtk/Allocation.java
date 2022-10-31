package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The rectangle representing the area allocated for a widget by its parent.
 */
public class Allocation extends org.gtk.gdk.Rectangle {

    
    @ApiStatus.Internal
    public Allocation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Allocation if its GType is a (or inherits from) "GtkAllocation".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Allocation" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAllocation", a ClassCastException will be thrown.
     */
    public static Allocation castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkAllocation"))) {
            return new Allocation(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAllocation");
        }
    }
}
