package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to the proximity of a tool to a device.
 */
public class ProximityEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkProximityEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ProximityEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ProximityEvent if its GType is a (or inherits from) "GdkProximityEvent".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ProximityEvent" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkProximityEvent", a ClassCastException will be thrown.
     */
    public static ProximityEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkProximityEvent"))) {
            return new ProximityEvent(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkProximityEvent");
        }
    }
}
