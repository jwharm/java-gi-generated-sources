package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base type for snapshot operations.
 * <p>
 * The subclass of {@code GdkSnapshot} used by GTK is {@link org.gtk.gtk.Snapshot}.
 */
public class Snapshot extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkSnapshot";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public Snapshot(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Snapshot if its GType is a (or inherits from) "GdkSnapshot".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Snapshot" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkSnapshot", a ClassCastException will be thrown.
     */
    public static Snapshot castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkSnapshot"))) {
            return new Snapshot(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkSnapshot");
        }
    }
}
